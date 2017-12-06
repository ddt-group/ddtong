package com.ddtong.core.entity.sysConfig;

import java.io.Serializable;

/**
 * 
* @ClassName: TSysConfig 
* @Description: 系统字典配置信息
* @author xc_qin
* @date 2017年12月6日 下午6:10:18 
*
 */
public class TSysConfig implements Serializable{

	private static final long serialVersionUID = -178727190843609093L;
	
	private String configKey;
	
	private String configVal;
	
	private String configDesc;
	
	private String configState;
	
	private String configGroup;

	/**
	 * 
	* @Title: getConfigKey 
	* @Description: 字典key
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:11:40
	 */
	public String getConfigKey() {
		return configKey;
	}

	/**
	 * 
	* @Title: setConfigKey 
	* @Description: 字典key
	* @param configKey     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:11:47
	 */
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	/**
	 * 
	* @Title: getConfigVal 
	* @Description: 字典值
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:11:52
	 */
	public String getConfigVal() {
		return configVal;
	}

	/**
	 * 
	* @Title: setConfigVal 
	* @Description: 字典值
	* @param configVal     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:12:05
	 */
	public void setConfigVal(String configVal) {
		this.configVal = configVal;
	}

	/**
	 * 
	* @Title: getConfigDesc 
	* @Description: 字典描述
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:12:11
	 */
	public String getConfigDesc() {
		return configDesc;
	}

	/**
	 * 
	* @Title: setConfigDesc 
	* @Description: 字典描述
	* @param configDesc     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:12:19
	 */
	public void setConfigDesc(String configDesc) {
		this.configDesc = configDesc;
	}

	/**
	 * 
	* @Title: getConfigState 
	* @Description: 字典状态
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:12:24
	 */
	public String getConfigState() {
		return configState;
	}

	/**
	 * 
	* @Title: setConfigState 
	* @Description: 字典状态
	* @param configState     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:12:31
	 */
	public void setConfigState(String configState) {
		this.configState = configState;
	}

	/**
	 * 
	* @Title: getConfigGroup 
	* @Description: 字典组
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:12:36
	 */
	public String getConfigGroup() {
		return configGroup;
	}

	/**
	 * 
	* @Title: setConfigGroup 
	* @Description: 字典组
	* @param configGroup     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:12:44
	 */
	public void setConfigGroup(String configGroup) {
		this.configGroup = configGroup;
	}

	public TSysConfig() {
		super();
	}

	public TSysConfig(String configKey, String configVal, String configDesc, String configState, String configGroup) {
		super();
		this.configKey = configKey;
		this.configVal = configVal;
		this.configDesc = configDesc;
		this.configState = configState;
		this.configGroup = configGroup;
	}

	@Override
	public String toString() {
		return "TSysConfig [configKey=" + configKey + ", configVal=" + configVal + ", configDesc=" + configDesc
				+ ", configState=" + configState + ", configGroup=" + configGroup + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((configDesc == null) ? 0 : configDesc.hashCode());
		result = prime * result + ((configGroup == null) ? 0 : configGroup.hashCode());
		result = prime * result + ((configKey == null) ? 0 : configKey.hashCode());
		result = prime * result + ((configState == null) ? 0 : configState.hashCode());
		result = prime * result + ((configVal == null) ? 0 : configVal.hashCode());
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
		TSysConfig other = (TSysConfig) obj;
		if (configDesc == null) {
			if (other.configDesc != null)
				return false;
		} else if (!configDesc.equals(other.configDesc))
			return false;
		if (configGroup == null) {
			if (other.configGroup != null)
				return false;
		} else if (!configGroup.equals(other.configGroup))
			return false;
		if (configKey == null) {
			if (other.configKey != null)
				return false;
		} else if (!configKey.equals(other.configKey))
			return false;
		if (configState == null) {
			if (other.configState != null)
				return false;
		} else if (!configState.equals(other.configState))
			return false;
		if (configVal == null) {
			if (other.configVal != null)
				return false;
		} else if (!configVal.equals(other.configVal))
			return false;
		return true;
	}
	
	

}
