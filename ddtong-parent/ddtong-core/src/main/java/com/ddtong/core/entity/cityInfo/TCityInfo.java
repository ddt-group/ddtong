package com.ddtong.core.entity.cityInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: TCityInfo 
* @Description: 城市信息
* @author xc_qin
* @date 2017年12月6日 下午5:02:25 
*
 */
public class TCityInfo implements Serializable{

	private static final long serialVersionUID = 2746537472630847822L;

	private Long id;
	
	private Long provinceId;
	
	private String cityName;
	
	private Date createTime;
	
	private String jianPin;
	
	private String quanPin;
	
	private Long isHot;
	
	private Long status;
	
	private String areaCode;
	
	private Long sorts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getProvinceId 
	* @Description: 省ID
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:04:27
	 */
	public Long getProvinceId() {
		return provinceId;
	}

	/**
	 * 
	* @Title: setProvinceId 
	* @Description: 省ID
	* @param provinceId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:04:37
	 */
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * 
	* @Title: getCityName 
	* @Description: 市名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:04:44
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * 
	* @Title: setCityName 
	* @Description: 市名称
	* @param cityName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:04:55
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * 
	* @Title: getCreateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:05:04
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
	* @date 2017年12月6日 下午5:05:11
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	/**
	 * 
	* @Title: getJianPin 
	* @Description: 简拼
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:05:20
	 */
	public String getJianPin() {
		return jianPin;
	}

	/**
	 * 
	* @Title: setJianPin 
	* @Description: 简拼
	* @param jianPin     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:05:28
	 */
	public void setJianPin(String jianPin) {
		this.jianPin = jianPin;
	}

	/**
	 * 
	* @Title: getQuanPin 
	* @Description: 全拼
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:05:39
	 */
	public String getQuanPin() {
		return quanPin;
	}

	/**
	 * 
	* @Title: setQuanPin 
	* @Description: 全拼
	* @param quanPin     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:05:52
	 */
	public void setQuanPin(String quanPin) {
		this.quanPin = quanPin;
	}

	/**
	 * 
	* @Title: getIsHot 
	* @Description: 是否热门 1是 0否
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:05:59
	 */
	public Long getIsHot() {
		return isHot;
	}

	/**
	 * 
	* @Title: setIsHot 
	* @Description: 是否热门 1是 0否
	* @param isHot     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:06:09
	 */
	public void setIsHot(Long isHot) {
		this.isHot = isHot;
	}

	/**
	 * 
	* @Title: getStatus 
	* @Description: 状态 1:正常 0:删除
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:06:18
	 */
	public Long getStatus() {
		return status;
	}

	/**
	 * 
	* @Title: setStatus 
	* @Description:  状态 1:正常 0:删除
	* @param status     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:06:43
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

	/**
	 * 
	* @Title: getAreaCode 
	* @Description: 区编号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:06:48
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * 
	* @Title: setAreaCode 
	* @Description: 区编号
	* @param areaCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:07:08
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * 
	* @Title: getSorts 
	* @Description: 排序,值越大越在最后
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:07:16
	 */
	public Long getSorts() {
		return sorts;
	}

	/**
	 * 
	* @Title: setSorts 
	* @Description: 排序,值越大越在最后
	* @param sorts     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:07:35
	 */
	public void setSorts(Long sorts) {
		this.sorts = sorts;
	}
	
	
}
