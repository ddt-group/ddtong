package com.ddtong.service.oauth.abst;

import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ddtong.service.oauth.AccessTokenInterface;
import com.ddtong.service.oauth.OAuthConfig;

/**
 * 微信公众号accesstoken
 */
public abstract class AbstractWechatAccessToken extends AbstractAccessToken implements AccessTokenInterface {

	private static final Logger logger = LoggerFactory.getLogger(AbstractWechatAccessToken.class);

	protected String getRedisRefreshTokenKey() {
		return getRedisAccessTokenKey();
	}

	@Override
	public String requestAccessToken() {
		return refreshAccessToken();
	}

	/**
	 * 微信公众号刷新token, 重新请求一次获取token接口, 使用定时器刷新
	 */
	@Override
	public String refreshAccessToken() {
		try {
			OAuthConfig oauthconfig = getOAuthConfig();

			// 请求token
			// HttpsClientBaseUtil.get("url", null);

			String access_token = "xsssdfsdfsd";
			long expires_in = 7200;// 秒

			// 将获取的access_token保存到缓存
			redisClient.set(getRedisAccessTokenKey(), access_token, expires_in);

			// 启动计时器定时刷新token
			RefreshTokenTask task = new RefreshTokenTask(this);
			Timer timer = new Timer();
			// 在缓存过期前5分钟刷新
			timer.schedule(task, expires_in * 1000 - 300000);
			return access_token;

		} catch (Exception e) {
			return null;
		}
	}

	class RefreshTokenTask extends TimerTask {
		private AccessTokenInterface tokenInterface;

		public RefreshTokenTask(AccessTokenInterface tokenInterface) {
			this.tokenInterface = tokenInterface;
		}

		@Override
		public void run() {
			logger.info("正在刷新 [" + tokenInterface.getKey() + "] token信息");
			tokenInterface.refreshAccessToken();
		}
	}
}
