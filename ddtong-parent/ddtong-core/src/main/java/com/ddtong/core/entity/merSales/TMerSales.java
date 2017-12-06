package com.ddtong.core.entity.merSales;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TMerSales 
* @Description: 商家日营收
* @author xc_qin
* @date 2017年12月6日 下午5:33:15 
*
 */
public class TMerSales implements Serializable{

	private static final long serialVersionUID = -6869454741830703027L;

	private Long id;
	
	private Long userId;
	
	private BigDecimal salesAmt;
	
	private Date salesDate;
	
	private Date verifyDate;

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
	* @date 2017年12月6日 下午5:35:14
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
	* @date 2017年12月6日 下午5:35:30
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 
	* @Title: getSalesAmt 
	* @Description: 销售额
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:35:40
	 */
	public BigDecimal getSalesAmt() {
		return salesAmt;
	}

	/**
	 * 
	* @Title: setSalesAmt 
	* @Description: 销售额
	* @param salesAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:35:48
	 */
	public void setSalesAmt(BigDecimal salesAmt) {
		this.salesAmt = salesAmt;
	}

	/**
	 * 
	* @Title: getSalesDate 
	* @Description: 营业日期
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:35:53
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
	* @date 2017年12月6日 下午5:36:17
	 */
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	/**
	 * 
	* @Title: getVerifyDate 
	* @Description: 审核时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:36:56
	 */
	public Date getVerifyDate() {
		return verifyDate;
	}

	/**
	 * 
	* @Title: setVerifyDate 
	* @Description: 审核时间
	* @param verifyDate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:37:03
	 */
	public void setVerifyDate(Date verifyDate) {
		this.verifyDate = verifyDate;
	}

	public TMerSales() {
		super();
	}

	public TMerSales(Long id, Long userId, BigDecimal salesAmt, Date salesDate,Date verifyDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.salesAmt = salesAmt;
		this.salesDate = salesDate;
		this.verifyDate = verifyDate;
	}

	@Override
	public String toString() {
		return "TMerSales [id=" + id + ", userId=" + userId + ", salesAmt=" + salesAmt + ", salesDate=" + salesDate
				+ ", verifyDate=" + verifyDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((salesAmt == null) ? 0 : salesAmt.hashCode());
		result = prime * result + ((salesDate == null) ? 0 : salesDate.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((verifyDate == null) ? 0 : verifyDate.hashCode());
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
		TMerSales other = (TMerSales) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (salesAmt == null) {
			if (other.salesAmt != null)
				return false;
		} else if (!salesAmt.equals(other.salesAmt))
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
		if (verifyDate == null) {
			if (other.verifyDate != null)
				return false;
		} else if (!verifyDate.equals(other.verifyDate))
			return false;
		return true;
	}

	
	
	
}
