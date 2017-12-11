package com.ddtong.service.passport.impl;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ddtong.core.util.MD5;
import com.ddtong.core.vo.LoginUserVO;
import com.ddtong.service.passport.VLoginUserService;
import com.ddtong.service.redis.DdtRedisClient;

public abstract class AbstractLoginService {

	@Autowired
	protected DdtRedisClient ddtRedisClient;
	
	@Autowired
	protected VLoginUserService vloginUserService;

	protected String getLoginUserRedisKey(LoginUserVO vo) {
		String key = "loginuser_" + vo.getClient().getValue() + "_" + vo.getUserId();
		return key;
	}

	protected String buildDeviceId() {
		String deviceId = UUID.randomUUID().toString().replace("-", "");
		return deviceId;
	}

	protected String buildToken(LoginUserVO vo) {
		String token = getLoginUserRedisKey(vo) + "_" + vo.getDeviceId();
		String token_md5 = MD5.encode(token);
		return token_md5;
	}

	protected final ServletRequestAttributes getServletRequestAttributes() {
		return (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	}

	protected HttpServletRequest getRequest() {
		return getServletRequestAttributes().getRequest();
	}
}
