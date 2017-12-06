package com.ddtong.core.entity.sysActLog;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TSysActLog 
* @Description: 系统账户日志信息
* @author xc_qin
* @date 2017年12月6日 下午6:06:25 
*
 */
public class TSysActLog implements Serializable{

	private static final long serialVersionUID = 3362991189022360457L;
	
	private Long id;
	
	private Long sysUserId;
	
	private String operbType;
	
	private String opersType;
	
	private BigDecimal tradeAmt;
	
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getSysUserId 
	* @Description: 系统账户id
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:07:44
	 */
	public Long getSysUserId() {
		return sysUserId;
	}

	/**
	 * 
	* @Title: setSysUserId 
	* @Description: 系统账户id
	* @param sysUserId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:07:52
	 */
	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}

	/**
	 * 
	* @Title: getOperbType 
	* @Description: 操作大类 0:转入 2:转出
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:07:58
	 */
	public String getOperbType() {
		return operbType;
	}

	/**
	 * 
	* @Title: setOperbType 
	* @Description: 操作大类 0:转入 2:转出
	* @param operbType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:08:09
	 */
	public void setOperbType(String operbType) {
		this.operbType = operbType;
	}

	/**
	 * 
	* @Title: getOpersType 
	* @Description: 操作小类  
	* 	03:让利款 
	* 	21:小数点结余 22:扶贫基金 23:平台运营 24:奖励 25:激励 26:税
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:08:14
	 */
	public String getOpersType() {
		return opersType;
	}

	/**
	 * 
	* @Title: setOpersType 
	* @Description: 操作小类  
	* 	03:让利款 
	* 	21:小数点结余 22:扶贫基金 23:平台运营 24:奖励 25:激励 26:税
	* @param opersType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:08:39
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
	* @date 2017年12月6日 下午6:08:44
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
	* @date 2017年12月6日 下午6:08:57
	 */
	public void setTradeAmt(BigDecimal tradeAmt) {
		this.tradeAmt = tradeAmt;
	}

	/**
	 * 
	* @Title: getCreateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:09:03
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
	* @date 2017年12月6日 下午6:09:10
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public TSysActLog() {
		super();
	}

	public TSysActLog(Long id, Long sysUserId, String operbType, String opersType, BigDecimal tradeAmt,
			Date createTime) {
		super();
		this.id = id;
		this.sysUserId = sysUserId;
		this.operbType = operbType;
		this.opersType = opersType;
		this.tradeAmt = tradeAmt;
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "TSysActLog [id=" + id + ", sysUserId=" + sysUserId + ", operbType=" + operbType + ", opersType="
				+ opersType + ", tradeAmt=" + tradeAmt + ", createTime=" + createTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((operbType == null) ? 0 : operbType.hashCode());
		result = prime * result + ((opersType == null) ? 0 : opersType.hashCode());
		result = prime * result + ((sysUserId == null) ? 0 : sysUserId.hashCode());
		result = prime * result + ((tradeAmt == null) ? 0 : tradeAmt.hashCode());
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
		TSysActLog other = (TSysActLog) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
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
		if (sysUserId == null) {
			if (other.sysUserId != null)
				return false;
		} else if (!sysUserId.equals(other.sysUserId))
			return false;
		if (tradeAmt == null) {
			if (other.tradeAmt != null)
				return false;
		} else if (!tradeAmt.equals(other.tradeAmt))
			return false;
		return true;
	}
	
	

}
