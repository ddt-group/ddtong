package com.ddtong.core.entity.versionInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: TVersionInfo 
* @Description: 版本控制信息
* @author xc_qin
* @date 2017年12月6日 下午6:26:20 
*
 */
public class TVersionInfo implements Serializable{

	private static final long serialVersionUID = -1599861578877996488L;

	private Long id;
	
	private Integer versionCode;
	
	private String versionNo;
	
	private String updateVersionNo;
	
	private String updateContent;
	
	private String versionUrl;
	
	private Integer state;
	
	private Date createTime;
	
	private Integer client;
	
	private String clientType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getVersionCode 
	* @Description: 版本编码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:28:37
	 */
	public Integer getVersionCode() {
		return versionCode;
	}

	/**
	 * 
	* @Title: setVersionCode 
	* @Description: 版本编码
	* @param versionCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:28:44
	 */
	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	/**
	 * 
	* @Title: getVersionNo 
	* @Description: 版本号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:28:51
	 */
	public String getVersionNo() {
		return versionNo;
	}

	/**
	 * 
	* @Title: setVersionNo 
	* @Description: 版本号
	* @param versionNo     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:29:33
	 */
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	/**
	 * 
	* @Title: getUpdateVersionNo 
	* @Description: 要替换的版本号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:29:38
	 */
	public String getUpdateVersionNo() {
		return updateVersionNo;
	}

	/**
	 * 
	* @Title: setUpdateVersionNo 
	* @Description: 要替换的版本号
	* @param updateVersionNo     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:29:49
	 */
	public void setUpdateVersionNo(String updateVersionNo) {
		this.updateVersionNo = updateVersionNo;
	}

	/**
	 * 
	* @Title: getUpdateContent 
	* @Description: 更新内容
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:29:54
	 */
	public String getUpdateContent() {
		return updateContent;
	}

	/**
	 * 
	* @Title: setUpdateContent 
	* @Description: 更新内容
	* @param updateContent     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:30:01
	 */
	public void setUpdateContent(String updateContent) {
		this.updateContent = updateContent;
	}

	/**
	 * 
	* @Title: getVersionUrl 
	* @Description: 下载地址 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:30:06
	 */
	public String getVersionUrl() {
		return versionUrl;
	}

	/**
	 * 
	* @Title: setVersionUrl 
	* @Description: 下载地址
	* @param versionUrl     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:30:14
	 */
	public void setVersionUrl(String versionUrl) {
		this.versionUrl = versionUrl;
	}

	/**
	 * 
	* @Title: getState 
	* @Description: 1强制更新 0推荐更新
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:30:19
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * 
	* @Title: setState 
	* @Description: 1强制更新 0推荐更新
	* @param state     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:30:29
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 
	* @Title: getCreateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:30:35
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
	* @date 2017年12月6日 下午6:30:46
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 
	* @Title: getClient 
	* @Description: 1用户端 2商户端
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:30:54
	 */
	public Integer getClient() {
		return client;
	}

	/**
	 * 
	* @Title: setClient 
	* @Description: 1用户端 2商户端
	* @param client     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:31:07
	 */
	public void setClient(Integer client) {
		this.client = client;
	}

	/**
	 * 
	* @Title: getClientType 
	* @Description: IOS 或者 ANDROID
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:31:12
	 */
	public String getClientType() {
		return clientType;
	}

	/**
	 * 
	* @Title: setClientType 
	* @Description: IOS 或者 ANDROID
	* @param clientType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:31:22
	 */
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public TVersionInfo() {
		super();
	}

	public TVersionInfo(Long id, Integer versionCode, String versionNo, String updateVersionNo, String updateContent,
			String versionUrl, Integer state, Date createTime, Integer client, String clientType) {
		super();
		this.id = id;
		this.versionCode = versionCode;
		this.versionNo = versionNo;
		this.updateVersionNo = updateVersionNo;
		this.updateContent = updateContent;
		this.versionUrl = versionUrl;
		this.state = state;
		this.createTime = createTime;
		this.client = client;
		this.clientType = clientType;
	}

	@Override
	public String toString() {
		return "TVersionInfo [id=" + id + ", versionCode=" + versionCode + ", versionNo=" + versionNo
				+ ", updateVersionNo=" + updateVersionNo + ", updateContent=" + updateContent + ", versionUrl="
				+ versionUrl + ", state=" + state + ", createTime=" + createTime + ", client=" + client
				+ ", clientType=" + clientType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((clientType == null) ? 0 : clientType.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((updateContent == null) ? 0 : updateContent.hashCode());
		result = prime * result + ((updateVersionNo == null) ? 0 : updateVersionNo.hashCode());
		result = prime * result + ((versionCode == null) ? 0 : versionCode.hashCode());
		result = prime * result + ((versionNo == null) ? 0 : versionNo.hashCode());
		result = prime * result + ((versionUrl == null) ? 0 : versionUrl.hashCode());
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
		TVersionInfo other = (TVersionInfo) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (clientType == null) {
			if (other.clientType != null)
				return false;
		} else if (!clientType.equals(other.clientType))
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
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (updateContent == null) {
			if (other.updateContent != null)
				return false;
		} else if (!updateContent.equals(other.updateContent))
			return false;
		if (updateVersionNo == null) {
			if (other.updateVersionNo != null)
				return false;
		} else if (!updateVersionNo.equals(other.updateVersionNo))
			return false;
		if (versionCode == null) {
			if (other.versionCode != null)
				return false;
		} else if (!versionCode.equals(other.versionCode))
			return false;
		if (versionNo == null) {
			if (other.versionNo != null)
				return false;
		} else if (!versionNo.equals(other.versionNo))
			return false;
		if (versionUrl == null) {
			if (other.versionUrl != null)
				return false;
		} else if (!versionUrl.equals(other.versionUrl))
			return false;
		return true;
	}
	
	
	
}
