package com.ddtong.core.enums;

public enum UserTypeEnum {

	CUSTOM(1), MERCHANT(2);

	private int value;

	private UserTypeEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
