package com.ddtong.core.entity.integralLog;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TIntegralLog 
* @Description: 积分日志信息
* @author xc_qin
* @date 2017年12月6日 下午5:19:40 
*
 */
public class TIntegralLog implements Serializable{

	private static final long serialVersionUID = 4161149183411752651L;

	private Long id;
	
	private Long userId;
	
	private Long userType;
	
	private String operbType;
	
	private String opersType;
	
	private BigDecimal tradeAmt;
	
	private BigDecimal feeAmt;
	
	private Date operTime;
	
	private Long operId;
	
	private String operStatus;
	
	private Long tradeUserId;
	
	private BigDecimal oldIntegral;
	
	private BigDecimal newIntegral;
	
	private BigDecimal integral;
	
	private String integralType;
	
	private String remark;

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
	* @date 2017年12月6日 下午5:23:03
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
	* @date 2017年12月6日 下午5:23:18
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
	* @date 2017年12月6日 下午5:23:26
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
	* @date 2017年12月6日 下午5:23:34
	 */
	public void setUserType(Long userType) {
		this.userType = userType;
	}

	/**
	 * 
	* @Title: getOperbType 
	* @Description: 操作大类 0:转入 2:转出 4:管理
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:23:41
	 */
	public String getOperbType() {
		return operbType;
	}

	/**
	 * 
	* @Title: setOperbType 
	* @Description: 操作大类 0:转入 2:转出 4:管理
	* @param operbType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:23:51
	 */
	public void setOperbType(String operbType) {
		this.operbType = operbType;
	}

	/**
	 * 
	* @Title: getOpersType 
	* @Description: 操作小类 
	* 		01:激励转入 02:获赠转入 03:消费转入 04:推荐转入 05:产品推荐转入 
	* 		21:提现 22:转赠 23:消费 24:管理费 
	* 		41:冻结 42:解冻 43:开户 44:其他 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:23:57
	 */
	public String getOpersType() {
		return opersType;
	}

	/**
	 * 
	* @Title: setOpersType 
	* @Description: 操作小类 
	* 		01:激励转入 02:获赠转入 03:消费转入 04:推荐转入 05:产品推荐转入 
	* 		21:提现 22:转赠 23:消费 24:管理费 
	* 		41:冻结 42:解冻 43:开户 44:其他  
	* @param opersType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:24:20
	 */
	public void setOpersType(String opersType) {
		this.opersType = opersType;
	}

	/**
	 * 
	* @Title: getTradeAmt 
	* @Description: 交易金额
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:24:30
	 */
	public BigDecimal getTradeAmt() {
		return tradeAmt;
	}

	/**
	 * 
	* @Title: setTradeAmt 
	* @Description: 交易金额
	* @param tradeAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:24:39
	 */
	public void setTradeAmt(BigDecimal tradeAmt) {
		this.tradeAmt = tradeAmt;
	}

	/**
	 * 
	* @Title: getFeeAmt 
	* @Description: 手续费
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:24:44
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
	* @date 2017年12月6日 下午5:24:52
	 */
	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}

	/**
	 * 
	* @Title: getOperTime 
	* @Description: 操作时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:24:57
	 */
	public Date getOperTime() {
		return operTime;
	}

	/**
	 * 
	* @Title: setOperTime 
	* @Description: 操作时间
	* @param operTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:25:04
	 */
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

	/**
	 * 
	* @Title: getOperId 
	* @Description: 操作人
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:25:09
	 */
	public Long getOperId() {
		return operId;
	}

	/**
	 * 
	* @Title: setOperId 
	* @Description: 操作人
	* @param operId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:25:16
	 */
	public void setOperId(Long operId) {
		this.operId = operId;
	}

	/**
	 * 
	* @Title: getOperStatus 
	* @Description: 操作状态 0:成功 1:失败 2:处理中
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:25:22
	 */
	public String getOperStatus() {
		return operStatus;
	}

	/**
	 * 
	* @Title: setOperStatus 
	* @Description: 操作状态 0:成功 1:失败 2:处理中
	* @param operStatus     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:25:32
	 */
	public void setOperStatus(String operStatus) {
		this.operStatus = operStatus;
	}

	/**
	 * 
	* @Title: getTradeUserId 
	* @Description: 交易方ID,如转出应为获赠人ID,转入应为转赠人ID
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:25:38
	 */
	public Long getTradeUserId() {
		return tradeUserId;
	}

	/**
	 * 
	* @Title: setTradeUserId 
	* @Description: 交易方ID,如转出应为获赠人ID,转入应为转赠人ID
	* @param tradeUserId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:25:50
	 */
	public void setTradeUserId(Long tradeUserId) {
		this.tradeUserId = tradeUserId;
	}

	/**
	 * 
	* @Title: getOldIntegral 
	* @Description: 变更前积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:25:57
	 */
	public BigDecimal getOldIntegral() {
		return oldIntegral;
	}

	/**
	 * 
	* @Title: setOldIntegral 
	* @Description: 变更前积分
	* @param oldIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:26:17
	 */
	public void setOldIntegral(BigDecimal oldIntegral) {
		this.oldIntegral = oldIntegral;
	}

	/**
	 * 
	* @Title: getNewIntegral 
	* @Description: 变更后积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:26:22
	 */
	public BigDecimal getNewIntegral() {
		return newIntegral;
	}

	/**
	 * 
	* @Title: setNewIntegral 
	* @Description: 变更后积分
	* @param newIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:26:33
	 */
	public void setNewIntegral(BigDecimal newIntegral) {
		this.newIntegral = newIntegral;
	}

	/**
	 * 
	* @Title: getIntegral 
	* @Description: 当前操作红积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:26:39
	 */
	public BigDecimal getIntegral() {
		return integral;
	}

	/**
	 * 
	* @Title: setIntegral 
	* @Description: 当前操作红积分
	* @param integral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:26:47
	 */
	public void setIntegral(BigDecimal integral) {
		this.integral = integral;
	}

	/**
	 * 
	* @Title: getIntegralType 
	* @Description: 积分类型 1:红积分 2:蓝积分 3:绿积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:26:55
	 */
	public String getIntegralType() {
		return integralType;
	}

	/**
	 * 
	* @Title: setIntegralType 
	* @Description: 积分类型 1:红积分 2:蓝积分 3:绿积分
	* @param integralType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:27:06
	 */
	public void setIntegralType(String integralType) {
		this.integralType = integralType;
	}

	/**
	 * 
	* @Title: getRemark 
	* @Description: 备注 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:27:12
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 
	* @Title: setRemark 
	* @Description: 备注
	* @param remark     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:27:21
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public TIntegralLog() {
		super();
	}

	public TIntegralLog(Long id, Long userId, Long userType, String operbType, String opersType, BigDecimal tradeAmt,
			BigDecimal feeAmt, Date operTime, Long operId, String operStatus, Long tradeUserId, BigDecimal oldIntegral,
			BigDecimal newIntegral, BigDecimal integral, String integralType, String remark) {
		super();
		this.id = id;
		this.userId = userId;
		this.userType = userType;
		this.operbType = operbType;
		this.opersType = opersType;
		this.tradeAmt = tradeAmt;
		this.feeAmt = feeAmt;
		this.operTime = operTime;
		this.operId = operId;
		this.operStatus = operStatus;
		this.tradeUserId = tradeUserId;
		this.oldIntegral = oldIntegral;
		this.newIntegral = newIntegral;
		this.integral = integral;
		this.integralType = integralType;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "TIntegralLog [id=" + id + ", userId=" + userId + ", userType=" + userType + ", operbType=" + operbType
				+ ", opersType=" + opersType + ", tradeAmt=" + tradeAmt + ", feeAmt=" + feeAmt + ", operTime="
				+ operTime + ", operId=" + operId + ", operStatus=" + operStatus + ", tradeUserId=" + tradeUserId
				+ ", oldIntegral=" + oldIntegral + ", newIntegral=" + newIntegral + ", integral=" + integral
				+ ", integralType=" + integralType + ", remark=" + remark + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feeAmt == null) ? 0 : feeAmt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((integral == null) ? 0 : integral.hashCode());
		result = prime * result + ((integralType == null) ? 0 : integralType.hashCode());
		result = prime * result + ((newIntegral == null) ? 0 : newIntegral.hashCode());
		result = prime * result + ((oldIntegral == null) ? 0 : oldIntegral.hashCode());
		result = prime * result + ((operId == null) ? 0 : operId.hashCode());
		result = prime * result + ((operStatus == null) ? 0 : operStatus.hashCode());
		result = prime * result + ((operTime == null) ? 0 : operTime.hashCode());
		result = prime * result + ((operbType == null) ? 0 : operbType.hashCode());
		result = prime * result + ((opersType == null) ? 0 : opersType.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((tradeAmt == null) ? 0 : tradeAmt.hashCode());
		result = prime * result + ((tradeUserId == null) ? 0 : tradeUserId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		TIntegralLog other = (TIntegralLog) obj;
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
		if (integral == null) {
			if (other.integral != null)
				return false;
		} else if (!integral.equals(other.integral))
			return false;
		if (integralType == null) {
			if (other.integralType != null)
				return false;
		} else if (!integralType.equals(other.integralType))
			return false;
		if (newIntegral == null) {
			if (other.newIntegral != null)
				return false;
		} else if (!newIntegral.equals(other.newIntegral))
			return false;
		if (oldIntegral == null) {
			if (other.oldIntegral != null)
				return false;
		} else if (!oldIntegral.equals(other.oldIntegral))
			return false;
		if (operId == null) {
			if (other.operId != null)
				return false;
		} else if (!operId.equals(other.operId))
			return false;
		if (operStatus == null) {
			if (other.operStatus != null)
				return false;
		} else if (!operStatus.equals(other.operStatus))
			return false;
		if (operTime == null) {
			if (other.operTime != null)
				return false;
		} else if (!operTime.equals(other.operTime))
			return false;
		if (operbType == null) {
			if (other.operbType != null)
				return false;
		} else if (!operbType.equals(other.operbType))
			return false;
		if (opersType == null) {
			if (other.opersType != null)
				return false;
		} else if (!opersType.equals(other.opersType))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (tradeAmt == null) {
			if (other.tradeAmt != null)
				return false;
		} else if (!tradeAmt.equals(other.tradeAmt))
			return false;
		if (tradeUserId == null) {
			if (other.tradeUserId != null)
				return false;
		} else if (!tradeUserId.equals(other.tradeUserId))
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
		return true;
	}
	
	
	
}
