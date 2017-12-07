package com.ddtong.core.entity;

import java.io.Serializable;

public class YshDemoUserEntity implements Serializable{

	private static final long serialVersionUID = -8545998736109953763L;

	private String id;

	private String userName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
