package com.ddtong.service.passport.impl;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;
import com.ddtong.core.exception.ServiceException;
import com.ddtong.core.util.MD5;
import com.ddtong.core.vo.LoginUserVO;
import com.ddtong.service.redis.DdtRedisClient;

public abstract class AbstractLoginService {

	@Autowired
	protected DdtRedisClient ddtRedisClient;

	protected String getLoginUserRedisKey(LoginUserVO vo) {
		String key = "loginuser_" + vo.getClient().getValue() + "_" + vo.getUserId();
		return key;
	}

	protected String buildDeviceId() {
		String deviceId = UUID.randomUUID().toString().replace("-", "");
		// return deviceId;
		return "a5e41a483a9f48ab615052af000c2918";
	}

	protected String buildToken(LoginUserVO vo) {
		String token = getLoginUserRedisKey(vo) + "_" + vo.getDeviceId();
		String token_md5 = MD5.encode(token);
		return token_md5;
	}

	protected Long loginAccCheck(TerminalTypeEnum terminalTypeEnum, UserTypeEnum userTypeEnum, String account,
			String pwd) throws ServiceException {
		// 判断用户名密码
		return 60005000L;
	}

	protected final ServletRequestAttributes getServletRequestAttributes() {
		return (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	}

	protected HttpServletRequest getRequest() {
		return getServletRequestAttributes().getRequest();
	}
}
