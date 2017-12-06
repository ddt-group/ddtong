package com.ddtong.core.entity.areaInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: TAreaInfo 
* @Description: 区域信息
* @author xc_qin
* @date 2017年12月6日 下午4:28:07 
*
 */
public class TAreaInfo implements Serializable{

	private static final long serialVersionUID = 3508108643727871338L;

	private Long id;
	
	private Long cityId;
	
	private String areaName;
	
	private Date crerateTime;
	
	private String areaCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getCityId 
	* @Description: 市ID
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:30:02
	 */
	public Long getCityId() {
		return cityId;
	}

	/**
	 * 
	* @Title: setCityId 
	* @Description: 市ID
	* @param cityId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:29:32
	 */
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	/**
	 * 
	* @Title: getAreaName 
	* @Description: 区名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:29:53
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * 
	* @Title: setAreaName 
	* @Description: 区名称
	* @param areaName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:30:25
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * 
	* @Title: getCrerateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:30:32
	 */
	public Date getCrerateTime() {
		return crerateTime;
	}

	/**
	 * 
	* @Title: setCrerateTime 
	* @Description: 创建时间
	* @param crerateTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:30:41
	 */
	public void setCrerateTime(Date crerateTime) {
		this.crerateTime = crerateTime;
	}

	/**
	 * 
	* @Title: getAreaCode 
	* @Description: 区编码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:30:49
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * 
	* @Title: setAreaCode 
	* @Description: 区编码
	* @param areaCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:30:58
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public TAreaInfo() {
		super();
	}

	public TAreaInfo(Long id, Long cityId, String areaName, Date crerateTime, String areaCode) {
		super();
		this.id = id;
		this.cityId = cityId;
		this.areaName = areaName;
		this.crerateTime = crerateTime;
		this.areaCode = areaCode;
	}

	@Override
	public String toString() {
		return "TAreaInfo [id=" + id + ", cityId=" + cityId + ", areaName=" + areaName + ", crerateTime=" + crerateTime
				+ ", areaCode=" + areaCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaCode == null) ? 0 : areaCode.hashCode());
		result = prime * result + ((areaName == null) ? 0 : areaName.hashCode());
		result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
		result = prime * result + ((crerateTime == null) ? 0 : crerateTime.hashCode());
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
		TAreaInfo other = (TAreaInfo) obj;
		if (areaCode == null) {
			if (other.areaCode != null)
				return false;
		} else if (!areaCode.equals(other.areaCode))
			return false;
		if (areaName == null) {
			if (other.areaName != null)
				return false;
		} else if (!areaName.equals(other.areaName))
			return false;
		if (cityId == null) {
			if (other.cityId != null)
				return false;
		} else if (!cityId.equals(other.cityId))
			return false;
		if (crerateTime == null) {
			if (other.crerateTime != null)
				return false;
		} else if (!crerateTime.equals(other.crerateTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
