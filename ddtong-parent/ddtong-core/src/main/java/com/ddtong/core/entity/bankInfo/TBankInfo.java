package com.ddtong.core.entity.bankInfo;

import java.io.Serializable;

/**
 * 
* @ClassName: TBankInfo 
* @Description: 银行卡信息
* @author xc_qin
* @date 2017年12月6日 下午4:59:02 
*
 */
public class TBankInfo implements Serializable{

	private static final long serialVersionUID = -1928284214856794143L;
	
	private Long id;
	
	private String bankName;
	
	private String bankCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getBankName 
	* @Description: 银行名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:00:45
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
	* @date 2017年12月6日 下午5:00:53
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 
	* @Title: getBankCode 
	* @Description: 银行编号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:00:59
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * 
	* @Title: setBankCode 
	* @Description: 银行编号
	* @param bankCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:01:08
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public TBankInfo() {
		super();
	}

	public TBankInfo(Long id, String bankName, String bankCode) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.bankCode = bankCode;
	}

	@Override
	public String toString() {
		return "TBankInfo [id=" + id + ", bankName=" + bankName + ", bankCode=" + bankCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankCode == null) ? 0 : bankCode.hashCode());
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TBankInfo other = (TBankInfo) obj;
		if (bankCode == null) {
			if (other.bankCode != null)
				return false;
		} else if (!bankCode.equals(other.bankCode))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
