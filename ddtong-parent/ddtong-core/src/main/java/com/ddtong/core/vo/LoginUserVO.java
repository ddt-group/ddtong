package com.ddtong.core.vo;

import com.ddtong.core.enums.ClientApplicationEnum;
import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;

/**
 * 记录登陆用户
 */
public class LoginUserVO {

	// 客户端
	private ClientApplicationEnum client;

	// 终端类型
	private TerminalTypeEnum terminalTypeEnum;

	// 用户类型
	private UserTypeEnum userTypeEnum;

	// 用户id
	private String userId;

	// 设备号 - 使用UUID生成32位字符串 UUID.randomUUID().toString().replace("-", "")
	private String deviceId;

	private String token;

	public LoginUserVO() {

	}
	public LoginUserVO(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum, UserTypeEnum userTypeEnum,
			String userId) {
		this.client = client;
		this.terminalTypeEnum = terminalTypeEnum;
		this.userTypeEnum = userTypeEnum;
		this.userId = userId;
	}

	public LoginUserVO(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum, UserTypeEnum userTypeEnum,
			String userId, String deviceId) {
		this.client = client;
		this.terminalTypeEnum = terminalTypeEnum;
		this.userTypeEnum = userTypeEnum;
		this.userId = userId;
		this.deviceId = deviceId;
	}

	public ClientApplicationEnum getClient() {
		return client;
	}

	public void setClient(ClientApplicationEnum client) {
		this.client = client;
	}

	public TerminalTypeEnum getTerminalTypeEnum() {
		return terminalTypeEnum;
	}

	public void setTerminalTypeEnum(TerminalTypeEnum terminalTypeEnum) {
		this.terminalTypeEnum = terminalTypeEnum;
	}

	public UserTypeEnum getUserTypeEnum() {
		return userTypeEnum;
	}

	public void setUserTypeEnum(UserTypeEnum userTypeEnum) {
		this.userTypeEnum = userTypeEnum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
