package com.ddtong.core.entity.integralRate;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
* @ClassName: TIntegralRate 
* @Description: 积分比例
* @author xc_qin
* @date 2017年12月6日 下午5:29:36 
*
 */
public class TIntegralRate implements Serializable{

	private static final long serialVersionUID = -7612039043514724437L;
	
	private Long userType;
	
	private BigDecimal redIntegralRate;
	
	private BigDecimal blueIntegralRate;
	
	private BigDecimal greenIntegralRate;

	/**
	 * 
	* @Title: getUserType 
	* @Description: 户类型 1:消费者 2:商家 3:服务商 4:市管理中心
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:31:04
	 */
	public Long getUserType() {
		return userType;
	}

	/**
	 * 
	* @Title: setUserType 
	* @Description: 户类型 1:消费者 2:商家 3:服务商 4:市管理中心
	* @param userType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:31:14
	 */
	public void setUserType(Long userType) {
		this.userType = userType;
	}

	/**
	 * 
	* @Title: getRedIntegralRate 
	* @Description: 红积分奖励比例
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:31:20
	 */
	public BigDecimal getRedIntegralRate() {
		return redIntegralRate;
	}

	/**
	 * 
	* @Title: setRedIntegralRate 
	* @Description: 红积分奖励比例
	* @param redIntegralRate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:31:29
	 */
	public void setRedIntegralRate(BigDecimal redIntegralRate) {
		this.redIntegralRate = redIntegralRate;
	}

	/**
	 * 
	* @Title: getBlueIntegralRate 
	* @Description: 蓝积分奖励比例
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:31:35
	 */
	public BigDecimal getBlueIntegralRate() {
		return blueIntegralRate;
	}

	/**
	 * 
	* @Title: setBlueIntegralRate 
	* @Description: 蓝积分奖励比例
	* @param blueIntegralRate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:31:45
	 */
	public void setBlueIntegralRate(BigDecimal blueIntegralRate) {
		this.blueIntegralRate = blueIntegralRate;
	}

	/**
	 * 
	* @Title: getGreenIntegralRate 
	* @Description: 绿积分奖励比例
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:31:50
	 */
	public BigDecimal getGreenIntegralRate() {
		return greenIntegralRate;
	}

	/**
	 * 
	* @Title: setGreenIntegralRate 
	* @Description: 绿积分奖励比例
	* @param greenIntegralRate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:31:58
	 */
	public void setGreenIntegralRate(BigDecimal greenIntegralRate) {
		this.greenIntegralRate = greenIntegralRate;
	}

	public TIntegralRate() {
		super();
	}

	public TIntegralRate(Long userType, BigDecimal redIntegralRate, BigDecimal blueIntegralRate,
			BigDecimal greenIntegralRate) {
		super();
		this.userType = userType;
		this.redIntegralRate = redIntegralRate;
		this.blueIntegralRate = blueIntegralRate;
		this.greenIntegralRate = greenIntegralRate;
	}

	@Override
	public String toString() {
		return "TIntegralRate [userType=" + userType + ", redIntegralRate=" + redIntegralRate + ", blueIntegralRate="
				+ blueIntegralRate + ", greenIntegralRate=" + greenIntegralRate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blueIntegralRate == null) ? 0 : blueIntegralRate.hashCode());
		result = prime * result + ((greenIntegralRate == null) ? 0 : greenIntegralRate.hashCode());
		result = prime * result + ((redIntegralRate == null) ? 0 : redIntegralRate.hashCode());
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
		TIntegralRate other = (TIntegralRate) obj;
		if (blueIntegralRate == null) {
			if (other.blueIntegralRate != null)
				return false;
		} else if (!blueIntegralRate.equals(other.blueIntegralRate))
			return false;
		if (greenIntegralRate == null) {
			if (other.greenIntegralRate != null)
				return false;
		} else if (!greenIntegralRate.equals(other.greenIntegralRate))
			return false;
		if (redIntegralRate == null) {
			if (other.redIntegralRate != null)
				return false;
		} else if (!redIntegralRate.equals(other.redIntegralRate))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}
	
	

}
