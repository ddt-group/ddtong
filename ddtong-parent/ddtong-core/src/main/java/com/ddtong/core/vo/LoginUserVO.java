package com.ddtong.core.vo;

import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;

/**
 * 记录登陆用户
 */
public class LoginUserVO {

	// 用户id
	private String userId;
	// 用户类型
	private UserTypeEnum userType;
	// 终端类型
	private TerminalTypeEnum terminaType;
	// 设备号 - 使用UUID生成32位字符串
	private String deviceId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserTypeEnum getUserType() {
		return userType;
	}

	public void setUserType(UserTypeEnum userType) {
		this.userType = userType;
	}

	public TerminalTypeEnum getTerminaType() {
		return terminaType;
	}

	public void setTerminaType(TerminalTypeEnum terminaType) {
		this.terminaType = terminaType;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
