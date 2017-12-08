package com.ddtong.core.enums;

/**
 * 客户端类型
 */
public enum TerminalTypeEnum {

	PC(1), IOS(2), ANDROID(3);

	private int value;

	private TerminalTypeEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static TerminalTypeEnum getEnumByValue(int value) {
		TerminalTypeEnum[] enumss = TerminalTypeEnum.values();
		for (TerminalTypeEnum itemEnum : enumss) {
			if (itemEnum.getValue() == value) {
				return itemEnum;
			}
		}
		throw new IllegalArgumentException(TerminalTypeEnum.class.getName() + " No element matches " + value);
	}
}
