package com.ddtong.core.entity.withdraw;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TWithdraw 
* @Description: 提现记录
* @author xc_qin
* @date 2017年12月6日 下午6:32:13 
*
 */
public class TWithdraw implements Serializable{

	private static final long serialVersionUID = 2407727006687922568L;

	private Long id;
	
	private Long userId;
	
	private Long userType;
	
	private String withdrawLogno;
	
	private String withdrawType;
	
	private BigDecimal withdrawNum;
	
	private BigDecimal feeAmt;
	
	private BigDecimal realAmt;
	
	private Long bankCardNum;
	
	private String bankCardName;
	
	private String bankName;
	
	private String verifyState;
	
	private String payState;
	
	private Date verifyTime;
	
	private Long verifyUserId;
	
	private Date payTime;
	
	private String thirdLogno;
	
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getUserId 
	* @Description: 用户编号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:36:15
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 
	* @Title: setUserId 
	* @Description: 用户编号
	* @param userId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:36:28
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
	* @date 2017年12月6日 下午6:36:33
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
	* @date 2017年12月6日 下午6:36:45
	 */
	public void setUserType(Long userType) {
		this.userType = userType;
	}

	/**
	 * 
	* @Title: getWithdrawLogno 
	* @Description: 提现流水号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:36:50
	 */
	public String getWithdrawLogno() {
		return withdrawLogno;
	}

	/**
	 * 
	* @Title: setWithdrawLogno 
	* @Description: 提现流水号
	* @param withdrawLogno     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:36:58
	 */
	public void setWithdrawLogno(String withdrawLogno) {
		this.withdrawLogno = withdrawLogno;
	}

	/**
	 * 
	* @Title: getWithdrawType 
	* @Description: 提现类型 1:积分 2:货款
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:03
	 */
	public String getWithdrawType() {
		return withdrawType;
	}

	/**
	 * 
	* @Title: setWithdrawType 
	* @Description: 提现类型 1:积分 2:货款
	* @param withdrawType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:12
	 */
	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}

	/**
	 * 
	* @Title: getWithdrawNum 
	* @Description: 提现数量(金额)
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:17
	 */
	public BigDecimal getWithdrawNum() {
		return withdrawNum;
	}

	/**
	 * 
	* @Title: setWithdrawNum 
	* @Description: 提现数量(金额)
	* @param withdrawNum     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:25
	 */
	public void setWithdrawNum(BigDecimal withdrawNum) {
		this.withdrawNum = withdrawNum;
	}

	/**
	 * 
	* @Title: getFeeAmt 
	* @Description: 手续费
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:31
	 */
	public BigDecimal getFeeAmt() {
		return feeAmt;
	}

	/**
	 * 
	* @Title: setFeeAmt 
	* @Description: 手续费
	* @param feeAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:38
	 */
	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}

	/**
	 * 
	* @Title: getRealAmt 
	* @Description: 实际到账数量
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:43
	 */
	public BigDecimal getRealAmt() {
		return realAmt;
	}

	/**
	 * 
	* @Title: setRealAmt 
	* @Description: 实际到账数量
	* @param realAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:50
	 */
	public void setRealAmt(BigDecimal realAmt) {
		this.realAmt = realAmt;
	}

	/**
	 * 
	* @Title: getBankCardNum 
	* @Description: 银行卡号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:37:55
	 */
	public Long getBankCardNum() {
		return bankCardNum;
	}

	/**
	 * 
	* @Title: setBankCardNum 
	* @Description: 银行卡号
	* @param bankCardNum     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:38:02
	 */
	public void setBankCardNum(Long bankCardNum) {
		this.bankCardNum = bankCardNum;
	}

	/**
	 * 
	* @Title: getBankCardName 
	* @Description: 收款人名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:38:07
	 */
	public String getBankCardName() {
		return bankCardName;
	}

	/**
	 * 
	* @Title: setBankCardName 
	* @Description: 收款人名称
	* @param bankCardName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:38:15
	 */
	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

	/**
	 * 
	* @Title: getBankName 
	* @Description: 银行名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:38:19
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
	* @date 2017年12月6日 下午6:38:26
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 
	* @Title: getVerifyState 
	* @Description: 审核状态 0:审核通过 1:审核中 2:审核失败'
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:38:32
	 */
	public String getVerifyState() {
		return verifyState;
	}

	/**
	 * 
	* @Title: setVerifyState 
	* @Description: 审核状态 0:审核通过 1:审核中 2:审核失败'
	* @param verifyState     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:38:47
	 */
	public void setVerifyState(String verifyState) {
		this.verifyState = verifyState;
	}

	/**
	 * 
	* @Title: getPayState 
	* @Description: 支付状态 0:已支付 1:处理中 2:未支付 3:支付失败
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:38:59
	 */
	public String getPayState() {
		return payState;
	}

	/**
	 * 
	* @Title: setPayState 
	* @Description: 支付状态 0:已支付 1:处理中 2:未支付 3:支付失败
	* @param payState     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:39:12
	 */
	public void setPayState(String payState) {
		this.payState = payState;
	}

	/**
	 * 
	* @Title: getVerifyTime 
	* @Description: 审核时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:39:17
	 */
	public Date getVerifyTime() {
		return verifyTime;
	}

	/**
	 * 
	* @Title: setVerifyTime 
	* @Description: 审核时间
	* @param verifyTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:39:29
	 */
	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}

	/**
	 * 
	* @Title: getVerifyUserId 
	* @Description: 审核人
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:39:34
	 */
	public Long getVerifyUserId() {
		return verifyUserId;
	}

	/**
	 * 
	* @Title: setVerifyUserId 
	* @Description: 审核人
	* @param verifyUserId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:39:44
	 */
	public void setVerifyUserId(Long verifyUserId) {
		this.verifyUserId = verifyUserId;
	}

	/**
	 * 
	* @Title: getPayTime 
	* @Description: 支付时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:39:53
	 */
	public Date getPayTime() {
		return payTime;
	}

	/**
	 * 
	* @Title: setPayTime 
	* @Description: 支付时间
	* @param payTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:39:59
	 */
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	/**
	 * 
	* @Title: getThirdLogno 
	* @Description: 第三方流水号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:40:03
	 */
	public String getThirdLogno() {
		return thirdLogno;
	}

	/**
	 * 
	* @Title: setThirdLogno 
	* @Description: 第三方流水号
	* @param thirdLogno     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:40:11
	 */
	public void setThirdLogno(String thirdLogno) {
		this.thirdLogno = thirdLogno;
	}

	/**
	 * 
	* @Title: getCreateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:40:16
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 
	* @Title: setCreateTime 
	* @Description: 创建时间
	* @param createTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:40:25
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public TWithdraw() {
		super();
	}

	public TWithdraw(Long id, Long userId, Long userType, String withdrawLogno, String withdrawType,
			BigDecimal withdrawNum, BigDecimal feeAmt, BigDecimal realAmt, Long bankCardNum, String bankCardName,
			String bankName, String verifyState, String payState, Date verifyTime, Long verifyUserId, Date payTime,
			String thirdLogno, Date createTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.userType = userType;
		this.withdrawLogno = withdrawLogno;
		this.withdrawType = withdrawType;
		this.withdrawNum = withdrawNum;
		this.feeAmt = feeAmt;
		this.realAmt = realAmt;
		this.bankCardNum = bankCardNum;
		this.bankCardName = bankCardName;
		this.bankName = bankName;
		this.verifyState = verifyState;
		this.payState = payState;
		this.verifyTime = verifyTime;
		this.verifyUserId = verifyUserId;
		this.payTime = payTime;
		this.thirdLogno = thirdLogno;
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "TWithdraw [id=" + id + ", userId=" + userId + ", userType=" + userType + ", withdrawLogno="
				+ withdrawLogno + ", withdrawType=" + withdrawType + ", withdrawNum=" + withdrawNum + ", feeAmt="
				+ feeAmt + ", realAmt=" + realAmt + ", bankCardNum=" + bankCardNum + ", bankCardName=" + bankCardName
				+ ", bankName=" + bankName + ", verifyState=" + verifyState + ", payState=" + payState + ", verifyTime="
				+ verifyTime + ", verifyUserId=" + verifyUserId + ", payTime=" + payTime + ", thirdLogno=" + thirdLogno
				+ ", createTime=" + createTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankCardName == null) ? 0 : bankCardName.hashCode());
		result = prime * result + ((bankCardNum == null) ? 0 : bankCardNum.hashCode());
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((feeAmt == null) ? 0 : feeAmt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((payState == null) ? 0 : payState.hashCode());
		result = prime * result + ((payTime == null) ? 0 : payTime.hashCode());
		result = prime * result + ((realAmt == null) ? 0 : realAmt.hashCode());
		result = prime * result + ((thirdLogno == null) ? 0 : thirdLogno.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((verifyState == null) ? 0 : verifyState.hashCode());
		result = prime * result + ((verifyTime == null) ? 0 : verifyTime.hashCode());
		result = prime * result + ((verifyUserId == null) ? 0 : verifyUserId.hashCode());
		result = prime * result + ((withdrawLogno == null) ? 0 : withdrawLogno.hashCode());
		result = prime * result + ((withdrawNum == null) ? 0 : withdrawNum.hashCode());
		result = prime * result + ((withdrawType == null) ? 0 : withdrawType.hashCode());
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
		TWithdraw other = (TWithdraw) obj;
		if (bankCardName == null) {
			if (other.bankCardName != null)
				return false;
		} else if (!bankCardName.equals(other.bankCardName))
			return false;
		if (bankCardNum == null) {
			if (other.bankCardNum != null)
				return false;
		} else if (!bankCardNum.equals(other.bankCardNum))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (feeAmt == null) {
			if (other.feeAmt != null)
				return false;
		} else if (!feeAmt.equals(other.feeAmt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (payState == null) {
			if (other.payState != null)
				return false;
		} else if (!payState.equals(other.payState))
			return false;
		if (payTime == null) {
			if (other.payTime != null)
				return false;
		} else if (!payTime.equals(other.payTime))
			return false;
		if (realAmt == null) {
			if (other.realAmt != null)
				return false;
		} else if (!realAmt.equals(other.realAmt))
			return false;
		if (thirdLogno == null) {
			if (other.thirdLogno != null)
				return false;
		} else if (!thirdLogno.equals(other.thirdLogno))
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
		if (verifyState == null) {
			if (other.verifyState != null)
				return false;
		} else if (!verifyState.equals(other.verifyState))
			return false;
		if (verifyTime == null) {
			if (other.verifyTime != null)
				return false;
		} else if (!verifyTime.equals(other.verifyTime))
			return false;
		if (verifyUserId == null) {
			if (other.verifyUserId != null)
				return false;
		} else if (!verifyUserId.equals(other.verifyUserId))
			return false;
		if (withdrawLogno == null) {
			if (other.withdrawLogno != null)
				return false;
		} else if (!withdrawLogno.equals(other.withdrawLogno))
			return false;
		if (withdrawNum == null) {
			if (other.withdrawNum != null)
				return false;
		} else if (!withdrawNum.equals(other.withdrawNum))
			return false;
		if (withdrawType == null) {
			if (other.withdrawType != null)
				return false;
		} else if (!withdrawType.equals(other.withdrawType))
			return false;
		return true;
	}
	
	
	
	
}
