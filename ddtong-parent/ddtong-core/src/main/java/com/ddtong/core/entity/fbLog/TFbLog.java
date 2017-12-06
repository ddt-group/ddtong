package com.ddtong.core.entity.fbLog;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TFbLog 
* @Description: 分宝日志信息
* @author xc_qin
* @date 2017年12月6日 下午5:08:15 
*
 */
public class TFbLog implements Serializable{

	private static final long serialVersionUID = -8241994572844661372L;

	private Long id;
	
	private Long userId;
	
	private Long userType;
	
	private BigDecimal fb;
	
	private BigDecimal changeFb;
	
	private BigDecimal freeFb;
	
	private BigDecimal unfezzFb;
	
	private Long actLogno;
	
	private Long tradeLog;
	
	private String operbType;
	
	private String opersType;
	
	private Date createTime;
	
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
	* @date 2017年12月6日 下午5:10:27
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
	* @date 2017年12月6日 下午5:10:35
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 
	* @Title: getUserType 
	* @Description: 用户类型 1:消费者 2:商家
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:10:42
	 */
	public Long getUserType() {
		return userType;
	}

	/**
	 * 
	* @Title: setUserType 
	* @Description: 用户类型 1:消费者 2:商家
	* @param userType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:10:59
	 */
	public void setUserType(Long userType) {
		this.userType = userType;
	}

	/**
	 * 
	* @Title: getFb 
	* @Description: 当前分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:11:21
	 */
	public BigDecimal getFb() {
		return fb;
	}

	/**
	 * 
	* @Title: setFb 
	* @Description: 当前分宝
	* @param fb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:11:29
	 */
	public void setFb(BigDecimal fb) {
		this.fb = fb;
	}

	/**
	 * 
	* @Title: getChangeFb 
	* @Description: 变更后分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:11:36
	 */
	public BigDecimal getChangeFb() {
		return changeFb;
	}

	/**
	 * 
	* @Title: setChangeFb 
	* @Description: 变更后分宝
	* @param changeFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:11:44
	 */
	public void setChangeFb(BigDecimal changeFb) {
		this.changeFb = changeFb;
	}

	/**
	 * 
	* @Title: getFreeFb 
	* @Description: 冻结分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:11:50
	 */
	public BigDecimal getFreeFb() {
		return freeFb;
	}

	/**
	 * 
	* @Title: setFreeFb 
	* @Description: 冻结分宝
	* @param freeFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:11:58
	 */
	public void setFreeFb(BigDecimal freeFb) {
		this.freeFb = freeFb;
	}

	/**
	 * 
	* @Title: getUnfezzFb 
	* @Description: 解冻分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:12:03
	 */
	public BigDecimal getUnfezzFb() {
		return unfezzFb;
	}

	/**
	 * 
	* @Title: setUnfezzFb 
	* @Description: 解冻分宝
	* @param unfezzFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:12:13
	 */
	public void setUnfezzFb(BigDecimal unfezzFb) {
		this.unfezzFb = unfezzFb;
	}

	/**
	 * 
	* @Title: getActLogno 
	* @Description: 资金流水ID
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:12:18
	 */
	public Long getActLogno() {
		return actLogno;
	}

	/**
	 * 
	* @Title: setActLogno 
	* @Description: 资金流水ID
	* @param actLogno     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:12:29
	 */
	public void setActLogno(Long actLogno) {
		this.actLogno = actLogno;
	}

	/**
	 * 
	* @Title: getTradeLog 
	* @Description: 交易流水
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:12:34
	 */
	public Long getTradeLog() {
		return tradeLog;
	}
	
	/**
	 * 
	* @Title: setTradeLog 
	* @Description: 交易流水
	* @param tradeLog     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:13:46
	 */
	public void setTradeLog(Long tradeLog) {
		this.tradeLog = tradeLog;
	}

	/**
	 * 
	* @Title: getOperbType 
	* @Description: 操作大类 0:转入 2:转出 4:管理
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:13:57
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
	* @date 2017年12月6日 下午5:14:08
	 */
	public void setOperbType(String operbType) {
		this.operbType = operbType;
	}

	/**
	 * 
	* @Title: getOpersType 
	* @Description: 操作小类 01:消费转入 21:消亡 41:冻结分宝 42:解冻分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:14:18
	 */
	public String getOpersType() {
		return opersType;
	}

	/**
	 * 
	* @Title: setOpersType 
	* @Description: 操作小类 01:消费转入 21:消亡 41:冻结分宝 42:解冻分宝
	* @param opersType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:14:46
	 */
	public void setOpersType(String opersType) {
		this.opersType = opersType;
	}

	/**
	 * 
	* @Title: getCreateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:14:52
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
	* @date 2017年12月6日 下午5:15:04
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 
	* @Title: getRemark 
	* @Description: 备注
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:15:15
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
	* @date 2017年12月6日 下午5:15:24
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public TFbLog() {
		super();
	}

	public TFbLog(Long id, Long userId, Long userType, BigDecimal fb, BigDecimal changeFb, BigDecimal freeFb,
			BigDecimal unfezzFb, Long actLogno, Long tradeLog, String operbType, String opersType, Date createTime,
			String remark) {
		super();
		this.id = id;
		this.userId = userId;
		this.userType = userType;
		this.fb = fb;
		this.changeFb = changeFb;
		this.freeFb = freeFb;
		this.unfezzFb = unfezzFb;
		this.actLogno = actLogno;
		this.tradeLog = tradeLog;
		this.operbType = operbType;
		this.opersType = opersType;
		this.createTime = createTime;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "TFbLog [id=" + id + ", userId=" + userId + ", userType=" + userType + ", fb=" + fb + ", changeFb="
				+ changeFb + ", freeFb=" + freeFb + ", unfezzFb=" + unfezzFb + ", actLogno=" + actLogno + ", tradeLog="
				+ tradeLog + ", operbType=" + operbType + ", opersType=" + opersType + ", createTime=" + createTime
				+ ", remark=" + remark + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actLogno == null) ? 0 : actLogno.hashCode());
		result = prime * result + ((changeFb == null) ? 0 : changeFb.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((fb == null) ? 0 : fb.hashCode());
		result = prime * result + ((freeFb == null) ? 0 : freeFb.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((operbType == null) ? 0 : operbType.hashCode());
		result = prime * result + ((opersType == null) ? 0 : opersType.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((tradeLog == null) ? 0 : tradeLog.hashCode());
		result = prime * result + ((unfezzFb == null) ? 0 : unfezzFb.hashCode());
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
		TFbLog other = (TFbLog) obj;
		if (actLogno == null) {
			if (other.actLogno != null)
				return false;
		} else if (!actLogno.equals(other.actLogno))
			return false;
		if (changeFb == null) {
			if (other.changeFb != null)
				return false;
		} else if (!changeFb.equals(other.changeFb))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (fb == null) {
			if (other.fb != null)
				return false;
		} else if (!fb.equals(other.fb))
			return false;
		if (freeFb == null) {
			if (other.freeFb != null)
				return false;
		} else if (!freeFb.equals(other.freeFb))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (tradeLog == null) {
			if (other.tradeLog != null)
				return false;
		} else if (!tradeLog.equals(other.tradeLog))
			return false;
		if (unfezzFb == null) {
			if (other.unfezzFb != null)
				return false;
		} else if (!unfezzFb.equals(other.unfezzFb))
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
