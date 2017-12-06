package com.ddtong.core.entity.industryInfo;

import java.io.Serializable;

/**
 * 
* @ClassName: TIndustryInfo 
* @Description: 行业信息
* @author xc_qin
* @date 2017年12月6日 下午5:16:34 
*
 */
public class TIndustryInfo implements Serializable{

	private static final long serialVersionUID = -3560111990077696535L;

	private Long id;
	
	private String industryName;
	
	private String industryIcon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getIndustryName 
	* @Description: 行业名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:17:36
	 */
	public String getIndustryName() {
		return industryName;
	}

	/**
	 * 
	* @Title: setIndustryName 
	* @Description: 行业名称
	* @param industryName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:17:44
	 */
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	/**
	 * 
	* @Title: getIndustryIcon 
	* @Description: 行业图片
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:17:51
	 */
	public String getIndustryIcon() {
		return industryIcon;
	}

	/**
	 * 
	* @Title: setIndustryIcon 
	* @Description: 行业图片
	* @param industryIcon     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:18:01
	 */
	public void setIndustryIcon(String industryIcon) {
		this.industryIcon = industryIcon;
	}

	public TIndustryInfo() {
		super();
	}

	public TIndustryInfo(Long id, String industryName, String industryIcon) {
		super();
		this.id = id;
		this.industryName = industryName;
		this.industryIcon = industryIcon;
	}

	@Override
	public String toString() {
		return "TIndustryInfo [id=" + id + ", industryName=" + industryName + ", industryIcon=" + industryIcon + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((industryIcon == null) ? 0 : industryIcon.hashCode());
		result = prime * result + ((industryName == null) ? 0 : industryName.hashCode());
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
		TIndustryInfo other = (TIndustryInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (industryIcon == null) {
			if (other.industryIcon != null)
				return false;
		} else if (!industryIcon.equals(other.industryIcon))
			return false;
		if (industryName == null) {
			if (other.industryName != null)
				return false;
		} else if (!industryName.equals(other.industryName))
			return false;
		return true;
	}
	
	
	
}
