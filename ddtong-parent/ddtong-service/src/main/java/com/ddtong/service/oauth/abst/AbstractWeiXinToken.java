package com.ddtong.service.oauth.abst;

import org.springframework.beans.factory.annotation.Autowired;

import com.ddtong.service.oauth.OAuthConfig;
import com.ddtong.service.oauth.AccessTokenInterface;
import com.ddtong.service.redis.DdtRedisClient;

public abstract class AbstractWeiXinToken implements AccessTokenInterface {

	@Autowired
	private DdtRedisClient redisClient;

	/**
	 * 采用redis缓存 , redis key
	 */
	public abstract String getKey();

	public abstract OAuthConfig initOAuthEntity();

	private String getRedisOAuthConfigKey() {
		return getKey() + "_config";
	}
	
	@Override
	public OAuthConfig getOAuthConfig() {
		if (redisClient.exists(getKey())) {
			return (OAuthConfig) redisClient.get(getKey());
		} else {
			return initOAuthEntity();
		}
	}

	@Override
	public String getAccessToken() {
		if (redisClient.exists(getKey())) {
			
			
		}
		
		return null;
	}

	@Override
	public String refreshAccessToken() {
		return null;
	}

	@Override
	public void reload() {

	}

}
