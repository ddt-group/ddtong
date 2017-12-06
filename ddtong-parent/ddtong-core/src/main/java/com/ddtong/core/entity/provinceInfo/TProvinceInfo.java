package com.ddtong.core.entity.provinceInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: TProvinceInfo 
* @Description: 省信息
* @author xc_qin
* @date 2017年12月6日 下午5:56:41 
*
 */
public class TProvinceInfo implements Serializable{

	private static final long serialVersionUID = -8737932169760951567L;

	private Long id;
	
	private String provinceName;
	
	private Date createTime;
	
	private String areaCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getProvinceName 
	* @Description: 省名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:57:52
	 */
	public String getProvinceName() {
		return provinceName;
	}

	/**
	 * 
	* @Title: setProvinceName 
	* @Description: 省名称
	* @param provinceName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:58:02
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	/**
	 * 
	* @Title: getCreateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:58:08
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
	* @date 2017年12月6日 下午5:58:16
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 
	* @Title: getAreaCode 
	* @Description: 区域编码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:58:23
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * 
	* @Title: setAreaCode 
	* @Description: 区域编码
	* @param areaCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:58:32
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public TProvinceInfo() {
		super();
	}

	public TProvinceInfo(Long id, String provinceName, Date createTime, String areaCode) {
		super();
		this.id = id;
		this.provinceName = provinceName;
		this.createTime = createTime;
		this.areaCode = areaCode;
	}

	@Override
	public String toString() {
		return "TProvinceInfo [id=" + id + ", provinceName=" + provinceName + ", createTime=" + createTime
				+ ", areaCode=" + areaCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaCode == null) ? 0 : areaCode.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((provinceName == null) ? 0 : provinceName.hashCode());
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
		TProvinceInfo other = (TProvinceInfo) obj;
		if (areaCode == null) {
			if (other.areaCode != null)
				return false;
		} else if (!areaCode.equals(other.areaCode))
			return false;
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
		if (provinceName == null) {
			if (other.provinceName != null)
				return false;
		} else if (!provinceName.equals(other.provinceName))
			return false;
		return true;
	}
	
	
	
	
}
