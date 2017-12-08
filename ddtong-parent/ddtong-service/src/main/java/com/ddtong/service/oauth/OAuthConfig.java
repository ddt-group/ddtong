package com.ddtong.service.oauth;

import java.io.Serializable;

public class OAuthConfig implements Serializable {

	private static final long serialVersionUID = 3143843741418824973L;

	protected String bsCode;
	protected String bsName;
	protected String bsUrl;
	protected String appKey;
	protected String secret;
	protected String bsTokenUrl;
	protected String bsRefreshTokenUrl;
	protected String token;

	public String getBsCode() {
		return bsCode;
	}

	public void setBsCode(String bsCode) {
		this.bsCode = bsCode;
	}

	public String getBsName() {
		return bsName;
	}

	public void setBsName(String bsName) {
		this.bsName = bsName;
	}

	public String getBsTokenUrl() {
		return bsTokenUrl;
	}

	public void setBsTokenUrl(String bsTokenUrl) {
		this.bsTokenUrl = bsTokenUrl;
	}

	public String getBsRefreshTokenUrl() {
		return bsRefreshTokenUrl;
	}

	public void setBsRefreshTokenUrl(String bsRefreshTokenUrl) {
		this.bsRefreshTokenUrl = bsRefreshTokenUrl;
	}

	public String getBsUrl() {
		return bsUrl;
	}

	public void setBsUrl(String bsUrl) {
		this.bsUrl = bsUrl;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
