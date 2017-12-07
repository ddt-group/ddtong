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
	
	public static UserTypeEnum getEnumByValue(int value) {
		UserTypeEnum[] enumss = UserTypeEnum.values();
		for (UserTypeEnum itemEnum : enumss) {
			if (itemEnum.getValue() == value) {
				return itemEnum;
			}
		}
		throw new IllegalArgumentException(UserTypeEnum.class.getName() + " No element matches " + value);
	}

}
