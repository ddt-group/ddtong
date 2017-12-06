package com.ddtong.core.entity.salesPeak;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TSalesPeak 
* @Description: 日营收峰值信息
* @author xc_qin
* @date 2017年12月6日 下午6:03:20 
*
 */
public class TSalesPeak implements Serializable{

	private static final long serialVersionUID = -7092828740245305093L;

	private Long id;
	
	private Long userId;
	
	private BigDecimal daySales;
	
	private Date salesDate;

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
	* @date 2017年12月6日 下午6:04:49
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
	* @date 2017年12月6日 下午6:04:58
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 
	* @Title: getDaySales 
	* @Description: 日营收额
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:05:04
	 */
	public BigDecimal getDaySales() {
		return daySales;
	}

	/**
	 * 
	* @Title: setDaySales 
	* @Description: 日营收额
	* @param daySales     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:05:13
	 */
	public void setDaySales(BigDecimal daySales) {
		this.daySales = daySales;
	}

	/**
	 * 
	* @Title: getSalesDate 
	* @Description: 营业日期
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:05:19
	 */
	public Date getSalesDate() {
		return salesDate;
	}

	/**
	 * 
	* @Title: setSalesDate 
	* @Description: 营业日期
	* @param salesDate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:05:26
	 */
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public TSalesPeak() {
		super();
	}

	public TSalesPeak(Long id, Long userId, BigDecimal daySales, Date salesDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.daySales = daySales;
		this.salesDate = salesDate;
	}

	@Override
	public String toString() {
		return "TSalesPeak [id=" + id + ", userId=" + userId + ", daySales=" + daySales + ", salesDate=" + salesDate
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((daySales == null) ? 0 : daySales.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((salesDate == null) ? 0 : salesDate.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		TSalesPeak other = (TSalesPeak) obj;
		if (daySales == null) {
			if (other.daySales != null)
				return false;
		} else if (!daySales.equals(other.daySales))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (salesDate == null) {
			if (other.salesDate != null)
				return false;
		} else if (!salesDate.equals(other.salesDate))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	
	
}
