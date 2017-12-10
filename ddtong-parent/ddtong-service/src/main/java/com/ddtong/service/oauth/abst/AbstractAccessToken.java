package com.ddtong.service.oauth.abst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ddtong.service.oauth.AccessTokenInterface;
import com.ddtong.service.redis.DdtRedisClient;

public abstract class AbstractAccessToken implements AccessTokenInterface {

	private static final Logger logger = LoggerFactory.getLogger(AbstractAccessToken.class);

	@Autowired
	protected DdtRedisClient redisClient;

	/**
	 * 采用redis缓存 , redis key
	 */
	public abstract String getKey();

	protected String getRedisAccessTokenKey() {
		return getKey() + "_access_token";
	}

	protected String getRedisRefreshTokenKey() {
		return getKey() + "_access_refreshToken";
	}

	@Override
	public String getAccessToken() {
		if (redisClient.exists(getRedisAccessTokenKey())) {
			return (String) redisClient.get(getRedisAccessTokenKey());
		}

		return requestAccessToken();
	}

	public abstract String requestAccessToken();

	@Override
	public void reload() {
		if (redisClient.exists(getRedisAccessTokenKey())) {
			redisClient.remove(getRedisAccessTokenKey());
		}
		if (redisClient.exists(getRedisRefreshTokenKey())) {
			redisClient.remove(getRedisRefreshTokenKey());
		}
	}
}
