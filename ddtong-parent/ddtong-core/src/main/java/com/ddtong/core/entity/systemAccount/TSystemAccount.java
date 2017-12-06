package com.ddtong.core.entity.systemAccount;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
* @ClassName: TSystemAccount 
* @Description: 系统账户信息
* @author xc_qin
* @date 2017年12月6日 下午6:13:38 
*
 */
public class TSystemAccount implements Serializable{

	private static final long serialVersionUID = -100558322816401977L;

	private Long id;
	
	private String usName;
	
	private String zhName;
	
	private BigDecimal totalAmt;
	
	private BigDecimal amt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getUsName 
	* @Description: 系统英文账户名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:14:39
	 */
	public String getUsName() {
		return usName;
	}

	/**
	 * 
	* @Title: setUsName 
	* @Description: 系统英文账户名称
	* @param usName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:14:47
	 */
	public void setUsName(String usName) {
		this.usName = usName;
	}

	/**
	 * 
	* @Title: getZhName 
	* @Description: 系统中文账户名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:14:52
	 */
	public String getZhName() {
		return zhName;
	}

	/**
	 * 
	* @Title: setZhName 
	* @Description: 系统中文账户名称
	* @param zhName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:14:59
	 */
	public void setZhName(String zhName) {
		this.zhName = zhName;
	}

	/**
	 * 
	* @Title: getTotalAmt 
	* @Description: 累计总金额,只增不减
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:15:04
	 */
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	/**
	 * 
	* @Title: setTotalAmt 
	* @Description: 累计总金额,只增不减
	* @param totalAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:15:13
	 */
	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	/**
	 * 
	* @Title: getAmt 
	* @Description: 当前金额
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:15:20
	 */
	public BigDecimal getAmt() {
		return amt;
	}

	/**
	 * 
	* @Title: setAmt 
	* @Description: 当前金额
	* @param amt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:15:27
	 */
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public TSystemAccount() {
		super();
	}

	public TSystemAccount(Long id, String usName, String zhName, BigDecimal totalAmt, BigDecimal amt) {
		super();
		this.id = id;
		this.usName = usName;
		this.zhName = zhName;
		this.totalAmt = totalAmt;
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "TSystemAccount [id=" + id + ", usName=" + usName + ", zhName=" + zhName + ", totalAmt=" + totalAmt
				+ ", amt=" + amt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amt == null) ? 0 : amt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((totalAmt == null) ? 0 : totalAmt.hashCode());
		result = prime * result + ((usName == null) ? 0 : usName.hashCode());
		result = prime * result + ((zhName == null) ? 0 : zhName.hashCode());
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
		TSystemAccount other = (TSystemAccount) obj;
		if (amt == null) {
			if (other.amt != null)
				return false;
		} else if (!amt.equals(other.amt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (totalAmt == null) {
			if (other.totalAmt != null)
				return false;
		} else if (!totalAmt.equals(other.totalAmt))
			return false;
		if (usName == null) {
			if (other.usName != null)
				return false;
		} else if (!usName.equals(other.usName))
			return false;
		if (zhName == null) {
			if (other.zhName != null)
				return false;
		} else if (!zhName.equals(other.zhName))
			return false;
		return true;
	}
	
	
	
}
