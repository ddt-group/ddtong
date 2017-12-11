package com.ddtong.core.entity.passport;

import java.io.Serializable;
import java.util.Date;

public class TUserLoginInfo implements Serializable {

	private static final long serialVersionUID = -1168224812154929859L;

	private Long id;

	// 终端应用 ClientApplicationEnum
	private String clientId;

	// 客户端类型 TerminalTypeEnum
	private Integer terminalType;

	// 用户类型 UserTypeEnum
	private Integer userType;

	// 用户id
	private Long userId;

	// 设备号
	private String bsDeviceId;

	// 登录状态：0-未登录，1-已登录
	private Integer loginState = 0;

	// 是否锁定用户（当天内登录错误5次锁定该用户）：0-否，1-是
	private Integer bsIsLocked = 0;

	// 当天内登录错误次数
	private Integer loginErrorNum = 0;

	// 创建时间
	private Date createTime;

	// 最后登录时间
	private Date lastLoginTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Integer getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getBsDeviceId() {
		return bsDeviceId;
	}

	public void setBsDeviceId(String bsDeviceId) {
		this.bsDeviceId = bsDeviceId;
	}

	public Integer getLoginState() {
		return loginState;
	}

	public void setLoginState(Integer loginState) {
		this.loginState = loginState;
	}

	public Integer getBsIsLocked() {
		return bsIsLocked;
	}

	public void setBsIsLocked(Integer bsIsLocked) {
		this.bsIsLocked = bsIsLocked;
	}

	public Integer getLoginErrorNum() {
		return loginErrorNum;
	}

	public void setLoginErrorNum(Integer loginErrorNum) {
		this.loginErrorNum = loginErrorNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

}
