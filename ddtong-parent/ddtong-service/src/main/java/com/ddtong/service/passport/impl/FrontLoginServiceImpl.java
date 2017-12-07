package com.ddtong.service.passport.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ddtong.core.enums.ClientApplicationEnum;
import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;
import com.ddtong.core.exception.ServiceException;
import com.ddtong.core.exception.UnLoginAccoutException;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.core.vo.LoginUserVO;
import com.ddtong.service.passport.DdtLoginService;

@Service(value = "frontLoginService")
public class FrontLoginServiceImpl extends AbstractLoginService implements DdtLoginService {

	private static final String DDT_CURRENT_LOGIN_USER = "DDT_CURRENT_LOGIN_USER";

	@Override
	public ApiResponseResult loginAcc(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, String account, String pwd) throws ServiceException {
		// 校验用户名密码
		Long userId = loginAccCheck(terminalTypeEnum, userTypeEnum, account, pwd);

		String deviceId = buildDeviceId();

		LoginUserVO loginUserVO = new LoginUserVO(client, terminalTypeEnum, userTypeEnum, userId + "", deviceId);
		String token_md5 = buildToken(loginUserVO);
		loginUserVO.setToken(token_md5);

		HttpServletRequest request = getRequest();
		request.getSession().setAttribute(DDT_CURRENT_LOGIN_USER + "_" + client, loginUserVO);

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

		HttpServletRequest request = getRequest();
		Object obju = request.getSession().getAttribute(DDT_CURRENT_LOGIN_USER + "_" + client);
		if (obju == null) {
			throw new UnLoginAccoutException("验证TOKEN失败");
		}
		LoginUserVO sessionloginUserVO = (LoginUserVO) obju;

		String token_md5 = sessionloginUserVO.getToken();

		if (!ticket_md5.equals(token_md5)) {
			throw new UnLoginAccoutException("验证TOKEN失败");
		}

		LoginUserVO result = new LoginUserVO();
		result.setClient(sessionloginUserVO.getClient());
		result.setTerminalTypeEnum(sessionloginUserVO.getTerminalTypeEnum());
		result.setUserTypeEnum(sessionloginUserVO.getUserTypeEnum());
		result.setUserId(sessionloginUserVO.getUserId());

		return result;

	}
}
