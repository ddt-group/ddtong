package com.ddtong.core.entity.userBank;

import java.io.Serializable;

/**
 * 
* @ClassName: TUserBank 
* @Description: 用户银行绑定信息
* @author xc_qin
* @date 2017年12月6日 下午6:19:26 
*
 */
public class TUserBank implements Serializable{

	private static final long serialVersionUID = -3819415120535417848L;

	private Long id;
	
	private Long userId;
	
	private Long userType;
	
	private String bankName;
	
	private String bankAddress;
	
	private String cardNum;
	
	private String cardName;
	
	private String cardMobile;
	
	private String validYear;
	
	private String validMonth;
	
	private String safeCode;
	
	private String cid;
	
	private String cardType;
	
	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getUserId 
	* @Description: 用户id
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:22:15
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 
	* @Title: setUserId 
	* @Description: 用户id
	* @param userId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:22:23
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 
	* @Title: getUserType 
	* @Description: 用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:22:28
	 */
	public Long getUserType() {
		return userType;
	}

	/**
	 * 
	* @Title: setUserType 
	* @Description: 用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param userType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:22:38
	 */
	public void setUserType(Long userType) {
		this.userType = userType;
	}

	/**
	 * 
	* @Title: getBankName 
	* @Description: 银行名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:22:43
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 
	* @Title: setBankName 
	* @Description: 银行名称
	* @param bankName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:22:51
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 
	* @Title: getBankAddress 
	* @Description: 银行支行信息
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:22:55
	 */
	public String getBankAddress() {
		return bankAddress;
	}

	/**
	 * 
	* @Title: setBankAddress 
	* @Description: 银行支行信息
	* @param bankAddress     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:03
	 */
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	/**
	 * 
	* @Title: getCardNum 
	* @Description: 银行卡卡号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:07
	 */
	public String getCardNum() {
		return cardNum;
	}

	/**
	 * 
	* @Title: setCardNum 
	* @Description: 银行卡卡号
	* @param cardNum     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:15
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	/**
	 * 
	* @Title: getCardName 
	* @Description: 持卡人姓名
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:20
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * 
	* @Title: setCardName 
	* @Description: 持卡人姓名
	* @param cardName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:28
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * 
	* @Title: getCardMobile 
	* @Description: 银行卡预留手机号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:34
	 */
	public String getCardMobile() {
		return cardMobile;
	}

	/**
	 * 
	* @Title: setCardMobile 
	* @Description: 银行卡预留手机号
	* @param cardMobile     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:42
	 */
	public void setCardMobile(String cardMobile) {
		this.cardMobile = cardMobile;
	}

	/**
	 * 
	* @Title: getValidYear 
	* @Description: 信用卡有效日期的年份:YY
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:48
	 */
	public String getValidYear() {
		return validYear;
	}

	/**
	 * 
	* @Title: setValidYear 
	* @Description: 信用卡有效日期的年份:YY
	* @param validYear     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:23:57
	 */
	public void setValidYear(String validYear) {
		this.validYear = validYear;
	}

	/**
	 * 
	* @Title: getValidMonth 
	* @Description: 信用卡有效日期的月份:MM
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:03
	 */
	public String getValidMonth() {
		return validMonth;
	}

	/**
	 * 
	* @Title: setValidMonth 
	* @Description: 信用卡有效日期的月份:MM
	* @param validMonth     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:13
	 */
	public void setValidMonth(String validMonth) {
		this.validMonth = validMonth;
	}

	/**
	 * 
	* @Title: getSafeCode 
	* @Description: 信用卡背面的安全码:3位
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:19
	 */
	public String getSafeCode() {
		return safeCode;
	}

	/**
	 * 
	* @Title: setSafeCode 
	* @Description: 信用卡背面的安全码:3位
	* @param safeCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:27
	 */
	public void setSafeCode(String safeCode) {
		this.safeCode = safeCode;
	}

	/**
	 * 
	* @Title: getCid 
	* @Description: 身份证号码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:32
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * 
	* @Title: setCid 
	* @Description: 身份证号码
	* @param cid     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:41
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}

	/**
	 * 
	* @Title: getCardType 
	* @Description: 类型 1:银行卡 2:信用卡
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:46
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * 
	* @Title: setCardType 
	* @Description: 类型 1:银行卡 2:信用卡
	* @param cardType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:54
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * 
	* @Title: getState 
	* @Description: 状态 0:开启 1:关闭
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:24:59
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	* @Title: setState 
	* @Description: 状态 0:开启 1:关闭 
	* @param state     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:25:10
	 */
	public void setState(String state) {
		this.state = state;
	}

	public TUserBank() {
		super();
	}

	public TUserBank(Long id, Long userId, Long userType, String bankName, String bankAddress, String cardNum,
			String cardName, String cardMobile, String validYear, String validMonth, String safeCode, String cid,
			String cardType, String state) {
		super();
		this.id = id;
		this.userId = userId;
		this.userType = userType;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.cardNum = cardNum;
		this.cardName = cardName;
		this.cardMobile = cardMobile;
		this.validYear = validYear;
		this.validMonth = validMonth;
		this.safeCode = safeCode;
		this.cid = cid;
		this.cardType = cardType;
		this.state = state;
	}

	@Override
	public String toString() {
		return "TUserBank [id=" + id + ", userId=" + userId + ", userType=" + userType + ", bankName=" + bankName
				+ ", bankAddress=" + bankAddress + ", cardNum=" + cardNum + ", cardName=" + cardName + ", cardMobile="
				+ cardMobile + ", validYear=" + validYear + ", validMonth=" + validMonth + ", safeCode=" + safeCode
				+ ", cid=" + cid + ", cardType=" + cardType + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankAddress == null) ? 0 : bankAddress.hashCode());
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((cardMobile == null) ? 0 : cardMobile.hashCode());
		result = prime * result + ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + ((cardNum == null) ? 0 : cardNum.hashCode());
		result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((safeCode == null) ? 0 : safeCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((validMonth == null) ? 0 : validMonth.hashCode());
		result = prime * result + ((validYear == null) ? 0 : validYear.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TUserBank other = (TUserBank) obj;
		if (bankAddress == null) {
			if (other.bankAddress != null)
				return false;
		} else if (!bankAddress.equals(other.bankAddress))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (cardMobile == null) {
			if (other.cardMobile != null)
				return false;
		} else if (!cardMobile.equals(other.cardMobile))
			return false;
		if (cardName == null) {
			if (other.cardName != null)
				return false;
		} else if (!cardName.equals(other.cardName))
			return false;
		if (cardNum == null) {
			if (other.cardNum != null)
				return false;
		} else if (!cardNum.equals(other.cardNum))
			return false;
		if (cardType == null) {
			if (other.cardType != null)
				return false;
		} else if (!cardType.equals(other.cardType))
			return false;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (safeCode == null) {
			if (other.safeCode != null)
				return false;
		} else if (!safeCode.equals(other.safeCode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (validMonth == null) {
			if (other.validMonth != null)
				return false;
		} else if (!validMonth.equals(other.validMonth))
			return false;
		if (validYear == null) {
			if (other.validYear != null)
				return false;
		} else if (!validYear.equals(other.validYear))
			return false;
		return true;
	}
	
	
	
	
}
