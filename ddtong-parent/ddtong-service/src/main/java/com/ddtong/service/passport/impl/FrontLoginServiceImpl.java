package com.ddtong.service.passport.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ddtong.core.entity.passport.VLoginUser;
import com.ddtong.core.enums.ClientApplicationEnum;
import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;
import com.ddtong.core.exception.ServiceException;
import com.ddtong.core.exception.UnLoginAccoutException;
import com.ddtong.core.util.MD5;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.core.vo.LoginUserVO;
import com.ddtong.service.passport.DdtLoginService;

@Service(value = "frontLoginService")
public class FrontLoginServiceImpl extends AbstractLoginService implements DdtLoginService {

	private static final String DDT_CURRENT_LOGIN_USER = "DDT_CURRENT_LOGIN_USER";

	@Override
	public ApiResponseResult accLogin(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, String account, String pwd) throws ServiceException {
		String pwd_md5 = MD5.encode(pwd);
		// 校验用户名密码
		VLoginUser vloginUser = vloginUserMapper.getLoginAcc(userTypeEnum.getValue(), account, pwd_md5);
		if (vloginUser == null) {
			throw ServiceException.failure("用户名或密码错误");
		}

		// Long userId =60005000L
		Long userId = vloginUser.getId();

		String deviceId = buildDeviceId();

		LoginUserVO loginUserVO = new LoginUserVO(client, terminalTypeEnum, userTypeEnum, userId + "", deviceId);
		String token_md5 = buildToken(loginUserVO);
		loginUserVO.setToken(token_md5);

//		HttpServletRequest request = getRequest();
//		request.getSession().setAttribute(DDT_CURRENT_LOGIN_USER + "_" + client, loginUserVO);

		String ticketcode = getLoginUserRedisKey(loginUserVO);
		long expireTime = 60 * 60 * 6;// 6小时
		ddtRedisClient.set(ticketcode, loginUserVO, expireTime);

		// 封装返回数据
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("ddtclientid", client.getValue());
		retMap.put("ddtterminaltype", terminalTypeEnum.getValue());
		retMap.put("ddtusertype", userTypeEnum.getValue());
		retMap.put("ddtuserid", userId);
		retMap.put("ddtticket", token_md5);

		return ApiResponseResult.success().data(retMap);
	}

	@Override
	public LoginUserVO validateToken(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, Long userid, String ticket_md5) throws UnLoginAccoutException {

		if (ticket_md5 == null || "".equals(ticket_md5.trim())) {
			throw new UnLoginAccoutException("验证TOKEN失败");
		}

//		HttpServletRequest request = getRequest();
//		Object obju = request.getSession().getAttribute(DDT_CURRENT_LOGIN_USER + "_" + client);
//		if (obju == null) {
//			throw new UnLoginAccoutException("验证TOKEN失败");
//		}
//		LoginUserVO sessionloginUserVO = (LoginUserVO) obju;
//
//		String token_md5 = sessionloginUserVO.getToken();
//
//		if (!ticket_md5.equals(token_md5)) {
//			throw new UnLoginAccoutException("验证TOKEN失败");
//		}

		LoginUserVO checkLoginUserParam = new LoginUserVO(client, terminalTypeEnum, userTypeEnum, userid + "");
		String ticketcode = getLoginUserRedisKey(checkLoginUserParam);

		if (!ddtRedisClient.exists(ticketcode)) {
			throw new UnLoginAccoutException("验证TOKEN失败");
		}

		LoginUserVO curLoginUserVO = (LoginUserVO) ddtRedisClient.get(ticketcode);
		String token_md5 = curLoginUserVO.getToken();
		if (!ticket_md5.equals(token_md5)) {
			throw new UnLoginAccoutException("验证TOKEN失败");
		}

		LoginUserVO result = new LoginUserVO();
		result.setClient(curLoginUserVO.getClient());
		result.setTerminalTypeEnum(curLoginUserVO.getTerminalTypeEnum());
		result.setUserTypeEnum(curLoginUserVO.getUserTypeEnum());
		result.setUserId(curLoginUserVO.getUserId());

		return result;
	}
}
