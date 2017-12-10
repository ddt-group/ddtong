package com.ddtong.service.oauth;

/**
 * OAuth认证token管理、服务调用
 */
public interface AccessTokenInterface {

	/**
	 * 获取OAuth认证编码 对应一种OAuth认证服务
	 * 
	 * @return
	 */
	public String getKey();

	/**
	 * 获取AccessToken
	 * 
	 * @param key
	 *            认证编码
	 * @return
	 */
	public String getAccessToken();

	/**
	 * 刷新AccessToken
	 * 
	 * @param key
	 * @return
	 */
	public abstract String refreshAccessToken();

	/**
	 * 获取OAuth认证源信息
	 * 
	 * @param key
	 * @return
	 */
	public OAuthConfig getOAuthConfig();

	/**
	 * 清除token认证相关记录，重新加载配置
	 */
	public void reload();
}
