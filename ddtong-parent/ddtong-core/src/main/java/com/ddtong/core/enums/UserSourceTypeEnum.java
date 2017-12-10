package com.ddtong.core.enums;

public enum UserSourceTypeEnum {

	/**
	 * 微信登陆
	 */
	Weixin(1),
	/**
	 * 支付宝登陆
	 */
	Alipay(2),
	/**
	 * 腾讯qq
	 */
	QQ(4),
	/**
	 * 新浪
	 */
	Sina(3);

	private int value;

	private UserSourceTypeEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static UserSourceTypeEnum getEnumByValue(int value) {
		UserSourceTypeEnum[] enumss = UserSourceTypeEnum.values();
		for (UserSourceTypeEnum itemEnum : enumss) {
			if (itemEnum.getValue() == value) {
				return itemEnum;
			}
		}
		throw new IllegalArgumentException(UserSourceTypeEnum.class.getName() + " No element matches " + value);
	}

}
