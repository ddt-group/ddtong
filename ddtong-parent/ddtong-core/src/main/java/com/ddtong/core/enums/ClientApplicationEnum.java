package com.ddtong.core.enums;

public enum ClientApplicationEnum {

	/**
	 * 消费者APP
	 */
	CUSTOM_APP(1),

	/**
	 * 商家APP
	 */
	MERCHANT_APP(2),

	/**
	 * 消费者web
	 */
	CUSTOM_WEB(3),

	/**
	 * 商家web
	 */
	MERCHANT_WEB(4);

	private int value;

	private ClientApplicationEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static ClientApplicationEnum getEnumByValue(int value) {
		ClientApplicationEnum[] enumss = ClientApplicationEnum.values();
		for (ClientApplicationEnum itemEnum : enumss) {
			if (itemEnum.getValue() == value) {
				return itemEnum;
			}
		}
		throw new IllegalArgumentException(ClientApplicationEnum.class.getName() + " No element matches " + value);
	}
}
