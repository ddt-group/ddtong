package com.ddtong.core.entity.sendMsg;

import java.io.Serializable;

/**
 * 
* @ClassName: TMsgTemplate 
* @Description: 短信模板信息
* @author xc_qin
* @date 2017年12月6日 下午4:59:23 
*
 */
public class TMsgTemplate implements Serializable{

	private static final long serialVersionUID = 6761894829869839291L;
	
	/**
	 * 渠道ID
	 */
	private Long id;
	
	/**
	 * 模板编号
	 */
	private String templateCode;
	
	/**
	 * 模板类型 0:验证码  1:短信通知 2:语音
	 */
	private Long templateType;
	
	/**
	 * 模板名称
	 */
	private String templatename;
	
	/**
	 * 模板所需参数 （多个以逗号分隔）
	 */
	private String templateParam;
	
	/**
	 * 参数值(多个以逗号分隔,动态参数,如:验证码,金额类以|代替)
	 */
	private String paramVal;
	
	/**
	 * 模板内容  
	 */
	private String templateContent;
	
	/**
	 * 短信后缀签名号
	 */
	private String singNumber;
	
	/**
	 * 签名名称  
	 */
	private String singName;
	
	/**
	 * 操作类型  操作类型  1: 有验证码 2: 无验证码
	 */
	private String operType;
	
	/**
	 * 描述
	 */
	private String description;
	
	/**
	 * 状态 0:启用 1:停用 
	 */
	private String state;
	
	/**
	 * 渠道编号 1:阿里大鱼   2:云片网络    3:网易云信
	 */
	private Long channelId;
	
	/**
	 * 渠道符号标识,如:${},#{},%{}
	 */
	private String channelFeatures;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	/**
	 * 
	* @Title: getTemplateCode 
	* @Description: 模板编号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:10:22
	 */
	public String getTemplateCode() {
		return templateCode;
	}

	/**
	 * 
	* @Title: setTemplateCode 
	* @Description: 模板编号
	* @param templateCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:10:53
	 */
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	/**
	 * 
	* @Title: getTemplateType 
	* @Description: 模板类型 0:验证码 1:短信通知 2:语音
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:11:22
	 */
	public Long getTemplateType() {
		return templateType;
	}

	/**
	 * 
	* @Title: setTemplateType 
	* @Description: 模板类型 0:验证码 1:短信通知 2:语音
	* @param templateType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:11:56
	 */
	public void setTemplateType(Long templateType) {
		this.templateType = templateType;
	}

	/**
	 * 
	* @Title: getTemplatename 
	* @Description: 模板名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:12:04
	 */
	public String getTemplatename() {
		return templatename;
	}

	/**
	 * 
	* @Title: setTemplatename 
	* @Description: 模板名称
	* @param templatename     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:12:16
	 */
	public void setTemplatename(String templatename) {
		this.templatename = templatename;
	}

	/**
	 * 
	* @Title: getTemplateParam 
	* @Description:模板所需参数 （多个以逗号分隔）
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:12:26
	 */
	public String getTemplateParam() {
		return templateParam;
	}

	/**
	 * 
	* @Title: setTemplateParam 
	* @Description: 模板所需参数 （多个以逗号分隔）
	* @param templateParam     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:12:46
	 */
	public void setTemplateParam(String templateParam) {
		this.templateParam = templateParam;
	}

	/**
	 * 
	* @Title: getParamVal 
	* @Description: 参数值(多个以逗号分隔,动态参数,如:验证码,金额类以|代替)
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:12:53
	 */
	public String getParamVal() {
		return paramVal;
	}

	/**
	 * 
	* @Title: setParamVal 
	* @Description: 参数值(多个以逗号分隔,动态参数,如:验证码,金额类以|代替)
	* @param paramVal     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:13:11
	 */
	public void setParamVal(String paramVal) {
		this.paramVal = paramVal;
	}

	/**
	 * 
	* @Title: getTemplateContent 
	* @Description: 模板内容
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:13:17
	 */
	public String getTemplateContent() {
		return templateContent;
	}

	/**
	 * 
	* @Title: setTemplateContent 
	* @Description: 模板内容  
	* @param templateContent     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:13:47
	 */
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	/**
	 * 
	* @Title: getSingNumber 
	* @Description: 短信后缀签名号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:13:54
	 */
	public String getSingNumber() {
		return singNumber;
	}

	/**
	 * 
	* @Title: setSingNumber 
	* @Description: 短信后缀签名号
	* @param singNumber     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:14:10
	 */
	public void setSingNumber(String singNumber) {
		this.singNumber = singNumber;
	}

	/**
	 * 
	* @Title: getSingName 
	* @Description: 签名名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:14:16
	 */
	public String getSingName() {
		return singName;
	}

	/**
	 * 
	* @Title: setSingName 
	* @Description: 签名名称 
	* @param singName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:15:05
	 */
	public void setSingName(String singName) {
		this.singName = singName;
	}

	/**
	 * 
	* @Title: getOperType 
	* @Description: 操作类型  1: 有验证码 2: 无验证码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:15:16
	 */
	public String getOperType() {
		return operType;
	}

	/**
	 * 
	* @Title: setOperType 
	* @Description: 操作类型  1: 有验证码 2: 无验证码
	* @param operType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:16:31
	 */
	public void setOperType(String operType) {
		this.operType = operType;
	}

	/**
	 * 
	* @Title: getDescription 
	* @Description: 描述
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:16:41
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	* @Title: setDescription 
	* @Description: 描述
	* @param description     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:16:49
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	* @Title: getState 
	* @Description: 状态 0:启用 1:停用  
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:16:58
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	* @Title: setState 
	* @Description: 状态 0:启用 1:停用 
	* @param state     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:17:17
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	* @Title: getChannelId 
	* @Description: 渠道编号 1:阿里大鱼
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:17:25
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * 
	* @Title: setChannelId 
	* @Description: 渠道编号 1:阿里大鱼
	* @param channelId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:17:47
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * 
	* @Title: getChannelFeatures 
	* @Description: 渠道符号标识,如:${},#{},%{}
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:17:55
	 */
	public String getChannelFeatures() {
		return channelFeatures;
	}

	/**
	 * 
	* @Title: setChannelFeatures 
	* @Description: 渠道符号标识,如:${},#{},%{}
	* @param channelFeatures     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午6:18:07
	 */
	public void setChannelFeatures(String channelFeatures) {
		this.channelFeatures = channelFeatures;
	}

	/**
	 * 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param id
	* @param templateCode 		模板编号
	* @param templateType		模板类型  0:验证码  1:短信通知 2:语音
	* @param templatename		模板名称
	* @param templateParam		模板参数 （多个以逗号分隔）
	* @param paramVal			参数值(多个以逗号分隔,动态参数,如:验证码,金额类以|代替)
	* @param templateContent	模板内容
	* @param singNumber			短信后缀签名号
	* @param singName			签名名称
	* @param operType			操作类型  1: 有验证码 2: 无验证码
	* @param description		描述
	* @param state				状态 0:启用 1:停用
	* @param channelId			渠道编号 1:阿里大鱼
	* @param channelFeatures	渠道符号标识,如:${},#{},%{}
	 */
	public TMsgTemplate(Long id, String templateCode, Long templateType, String templatename, String templateParam,
			String paramVal, String templateContent, String singNumber, String singName, String operType,
			String description, String state, Long channelId, String channelFeatures) {
		super();
		this.id = id;
		this.templateCode = templateCode;
		this.templateType = templateType;
		this.templatename = templatename;
		this.templateParam = templateParam;
		this.paramVal = paramVal;
		this.templateContent = templateContent;
		this.singNumber = singNumber;
		this.singName = singName;
		this.operType = operType;
		this.description = description;
		this.state = state;
		this.channelId = channelId;
		this.channelFeatures = channelFeatures;
	}

	public TMsgTemplate() {
		super();
	}

	@Override
	public String toString() {
		return "TMsgTemplate [id=" + id + ", templateCode=" + templateCode + ", templateType=" + templateType
				+ ", templatename=" + templatename + ", templateParam=" + templateParam + ", paramVal=" + paramVal
				+ ", templateContent=" + templateContent + ", singNumber=" + singNumber + ", singName=" + singName
				+ ", operType=" + operType + ", description=" + description + ", state=" + state + ", channelId="
				+ channelId + ", channelFeatures=" + channelFeatures + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channelFeatures == null) ? 0 : channelFeatures.hashCode());
		result = prime * result + ((channelId == null) ? 0 : channelId.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((operType == null) ? 0 : operType.hashCode());
		result = prime * result + ((paramVal == null) ? 0 : paramVal.hashCode());
		result = prime * result + ((singName == null) ? 0 : singName.hashCode());
		result = prime * result + ((singNumber == null) ? 0 : singNumber.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((templateCode == null) ? 0 : templateCode.hashCode());
		result = prime * result + ((templateContent == null) ? 0 : templateContent.hashCode());
		result = prime * result + ((templateParam == null) ? 0 : templateParam.hashCode());
		result = prime * result + ((templateType == null) ? 0 : templateType.hashCode());
		result = prime * result + ((templatename == null) ? 0 : templatename.hashCode());
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
		TMsgTemplate other = (TMsgTemplate) obj;
		if (channelFeatures == null) {
			if (other.channelFeatures != null)
				return false;
		} else if (!channelFeatures.equals(other.channelFeatures))
			return false;
		if (channelId == null) {
			if (other.channelId != null)
				return false;
		} else if (!channelId.equals(other.channelId))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (operType == null) {
			if (other.operType != null)
				return false;
		} else if (!operType.equals(other.operType))
			return false;
		if (paramVal == null) {
			if (other.paramVal != null)
				return false;
		} else if (!paramVal.equals(other.paramVal))
			return false;
		if (singName == null) {
			if (other.singName != null)
				return false;
		} else if (!singName.equals(other.singName))
			return false;
		if (singNumber == null) {
			if (other.singNumber != null)
				return false;
		} else if (!singNumber.equals(other.singNumber))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (templateCode == null) {
			if (other.templateCode != null)
				return false;
		} else if (!templateCode.equals(other.templateCode))
			return false;
		if (templateContent == null) {
			if (other.templateContent != null)
				return false;
		} else if (!templateContent.equals(other.templateContent))
			return false;
		if (templateParam == null) {
			if (other.templateParam != null)
				return false;
		} else if (!templateParam.equals(other.templateParam))
			return false;
		if (templateType == null) {
			if (other.templateType != null)
				return false;
		} else if (!templateType.equals(other.templateType))
			return false;
		if (templatename == null) {
			if (other.templatename != null)
				return false;
		} else if (!templatename.equals(other.templatename))
			return false;
		return true;
	}
	
	
	

}
