package com.ddtong.core.enums;

public enum TerminalTypeEnum {
	
	WEB(1), ANDROID(2), IOS(3);

	private int value;

	private TerminalTypeEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}