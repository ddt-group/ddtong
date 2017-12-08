package com.ddtong.service.passport.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ddtong.core.enums.ClientApplicationEnum;
import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;
import com.ddtong.core.exception.ServiceException;
import com.ddtong.core.exception.UnLoginAccoutException;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.core.vo.LoginUserVO;
import com.ddtong.service.passport.DdtLoginService;

@Service(value = "appLoginService")
public class AppLoginServiceImpl extends AbstractLoginService implements DdtLoginService {

	public ApiResponseResult accLogin(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, String account, String pwd) throws ServiceException {

		// 校验用户名密码
		Long userId = loginAccCheck(terminalTypeEnum, userTypeEnum, account, pwd);

		// 校验用户名密码成功后, 生成设备号
		String deviceId = buildDeviceId();

		// 保存设备号
		saveLoginInfo(client, terminalTypeEnum, userTypeEnum, userId, deviceId);

		// 登陆信息存储redis
		LoginUserVO loginUserVO = new LoginUserVO(client, terminalTypeEnum, userTypeEnum, userId + "", deviceId);
		String token_md5 = buildToken(loginUserVO);
		loginUserVO.setToken(token_md5);

		String ticketcode = getLoginUserRedisKey(loginUserVO);
		ddtRedisClient.set(ticketcode, loginUserVO);

		// 封装返回数据
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("ddtclientid", client.getValue());
		retMap.put("ddtterminaltype", terminalTypeEnum.getValue());
		retMap.put("ddtusertype", userTypeEnum.getValue());
		retMap.put("ddtuserid", userId);
		retMap.put("ddtticket", token_md5);

		return ApiResponseResult.success().data(retMap);
	}

	public LoginUserVO validateToken(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, Long userid, String ticket_md5) throws UnLoginAccoutException {

		if (ticket_md5 == null || "".equals(ticket_md5.trim())) {
			throw new UnLoginAccoutException("验证TOKEN失败");
		}

		// 查询用户登陆信息
		LoginUserVO dbuser = new LoginUserVO();

		userid = 60005000L;
		String deviceId = "a5e41a483a9f48ab615052af000c2918";

		/*
		 * 查询用户信息的设备号 -生成token进行对比,
		 * 而不直接采用缓存token对比,原因在于服务升级或者缓存挂了,服务重启后,用户无语再次登陆,原token还是可以登陆,因为设备号是没有变的
		 */
		LoginUserVO checkLoginUserParam = new LoginUserVO(client, terminalTypeEnum, userTypeEnum, userid + "",
				deviceId);
		String token_dbb = buildToken(checkLoginUserParam);

		if (!ticket_md5.equals(token_dbb)) {
			throw new UnLoginAccoutException("验证TOKEN失败");
		}

		LoginUserVO result = new LoginUserVO();
		result.setClient(checkLoginUserParam.getClient());
		result.setTerminalTypeEnum(checkLoginUserParam.getTerminalTypeEnum());
		result.setUserTypeEnum(checkLoginUserParam.getUserTypeEnum());
		result.setUserId(checkLoginUserParam.getUserId());

		return result;
	}

	private void saveLoginInfo(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, Long userId, String deviceId) {
		// 保存设备号

	}

}
