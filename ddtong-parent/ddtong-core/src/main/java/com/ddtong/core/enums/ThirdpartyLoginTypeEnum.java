package com.ddtong.core.enums;

/**
 * 第三方登陆类型
 *
 */
public enum ThirdpartyLoginTypeEnum {
	/**
	 * 微信登陆
	 */
	Weixin(1),
	/**
	 * 支付宝登陆
	 */
	Alipay(2),
	/**
	 * 新浪
	 */
	Sina(3),
	/**
	 * 腾讯qq
	 */
	QQ(4);

	private int value;

	private ThirdpartyLoginTypeEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static ThirdpartyLoginTypeEnum getEnumByValue(int value) {
		ThirdpartyLoginTypeEnum[] enumss = ThirdpartyLoginTypeEnum.values();
		for (ThirdpartyLoginTypeEnum itemEnum : enumss) {
			if (itemEnum.getValue() == value) {
				return itemEnum;
			}
		}
		throw new IllegalArgumentException(ThirdpartyLoginTypeEnum.class.getName() + " No element matches " + value);
	}

}
