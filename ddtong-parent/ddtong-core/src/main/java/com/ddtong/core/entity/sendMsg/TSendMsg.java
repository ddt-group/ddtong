package com.ddtong.core.entity.sendMsg;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: TSendMsg 
* @Description: 短信记录
* @author xc_qin
* @date 2017年12月6日 下午4:59:41 
*
 */
public class TSendMsg implements Serializable{
	
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	* @author xc_qin
	* @date 2017年12月5日 下午5:45:51 
	*/ 
	private static final long serialVersionUID = 4526841514269476469L;

	/**
	 * 短信id
	 */
	private Long id;
	
	/**
	 * 发送手机号
	 */
	private String sendMobile;
	
	/**
	 * 手机验证码
	 */
	private String verifyCode;
	
	/**
	 * 发送时间
	 */
	private Date sendDate;
	
	/**
	 * 发送内容
	 */
	private String sendContent;
	
	/**
	 * 验证码有效期
	 */
	private Long verifyCodeValidity;
	
	/**
	 * 发送类型
	 */
	private Long sendType;	
	
	/**
	 * 发送状态
	 */
	private Long sendStatus;
	
	/**
	 * 发送渠道
	 */
	private String sendChannel;
	
	/**
	 * 用户编号
	 */
	private Long userId;
	
	/**
	 * 用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	 */
	private Long userType;

	
	/**
	 * 
	* @Title: getId 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:02:53
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	* @Title: setId 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param id     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:03:01
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getSendMobile 
	* @Description: 发送手机号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:03:23
	 */
	public String getSendMobile() {
		return sendMobile;
	}

	/**
	 * 
	* @Title: setSendMobile 
	* @Description: 发送手机号
	* @param sendMobile     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:04:04
	 */
	public void setSendMobile(String sendMobile) {
		this.sendMobile = sendMobile;
	}

	
	/**
	 * 
	* @Title: getVerifyCode 
	* @Description: 手机验证码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:04:18
	 */
	public String getVerifyCode() {
		return verifyCode;
	}

	/**
	 * 
	* @Title: setVerifyCode 
	* @Description: 手机验证码
	* @param verifyCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:04:37
	 */
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	/**
	 * 
	* @Title: getSendDate 
	* @Description: 发送时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:04:43
	 */
	public Date getSendDate() {
		return sendDate;
	}

	/**
	 * 
	* @Title: setSendDate 
	* @Description: 发送时间
	* @param sendDate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:05:01
	 */
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	/**
	 * 
	* @Title: getSendContent 
	* @Description: 发送内容
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:05:11
	 */
	public String getSendContent() {
		return sendContent;
	}

	/**
	 * 
	* @Title: setSendContent 
	* @Description: 发送内容
	* @param sendContent     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:05:19
	 */
	public void setSendContent(String sendContent) {
		this.sendContent = sendContent;
	}

	/**
	 * 
	* @Title: getVerifyCodeValidity 
	* @Description: 验证码有效期
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:05:27
	 */
	public Long getVerifyCodeValidity() {
		return verifyCodeValidity;
	}

	/**
	 * 
	* @Title: setVerifyCodeValidity 
	* @Description: 验证码有效期
	* @param verifyCodeValidity     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:05:48
	 */
	public void setVerifyCodeValidity(Long verifyCodeValidity) {
		this.verifyCodeValidity = verifyCodeValidity;
	}

	/**
	 * 
	* @Title: getSendType 
	* @Description: 发送类型
	* 		1:消费者注册 2:商家注册
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:07:26
	 */
	public Long getSendType() {
		return sendType;
	}

	/**
	 * 
	* @Title: setSendType 
	* @Description: 发送类型
	*       1:消费者注册 2:商家注册
	* @param sendType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:07:41
	 */
	public void setSendType(Long sendType) {
		this.sendType = sendType;
	}

	/**
	 * 
	* @Title: getSendStatus 
	* @Description: 发送状态
	* 	1:发送成功,未使用 2:验证码已使用 3:验证码已过期
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:08:10
	 */
	public Long getSendStatus() {
		return sendStatus;
	}

	/**
	 * 
	* @Title: setSendStatus 
	* @Description: 发送状态
	* 	1:发送成功,未使用 2:验证码已使用 3:验证码已过期
	* @param sendStatus     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:30:59
	 */
	public void setSendStatus(Long sendStatus) {
		this.sendStatus = sendStatus;
	}

	/**
	 * 
	* @Title: getSendChannel 
	* @Description: 发送渠道
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:33:50
	 */
	public String getSendChannel() {
		return sendChannel;
	}

	/**
	 * 
	* @Title: setSendChannel 
	* @Description: 发送渠道
	* @param sendChannel     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:33:56
	 */
	public void setSendChannel(String sendChannel) {
		this.sendChannel = sendChannel;
	}

	/**
	 * 
	* @Title: getUserId 
	* @Description: 用户编号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:35:02
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
	* @date 2017年12月5日 下午3:35:12
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 
	* @Title: getUserType 
	* @Description: 用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:35:43
	 */
	public Long getUserType() {
		return userType;
	}

	/**
	 * 
	* @Title: setUserType 
	* @Description: 用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param userType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月5日 下午3:35:58
	 */
	public void setUserType(Long userType) {
		this.userType = userType;
	}

	
	public TSendMsg() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param id
	* @param sendMobile				发送手机号
	* @param verifyCode				验证码
	* @param sendDate				发送时间
	* @param sendContent			发送内容
	* @param verifyCodeValidity		验证码有效期
	* @param sendType				发送类型 1:消费者注册 2:商家注册
	* @param sendStatus				发送状态 1:发送成功,未使用 2:验证码已使用 3:验证码已过期
	* @param sendChannel			发送渠道
	* @param userId					用户编号
	* @param userType				用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	 */
	public TSendMsg(Long id, String sendMobile, String verifyCode, Date sendDate, String sendContent,
			Long verifyCodeValidity, Long sendType, Long sendStatus, String sendChannel, Long userId, Long userType) {
		super();
		this.id = id;
		this.sendMobile = sendMobile;
		this.verifyCode = verifyCode;
		this.sendDate = sendDate;
		this.sendContent = sendContent;
		this.verifyCodeValidity = verifyCodeValidity;
		this.sendType = sendType;
		this.sendStatus = sendStatus;
		this.sendChannel = sendChannel;
		this.userId = userId;
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "TSendMsg [id=" + id + ", sendMobile=" + sendMobile + ", verifyCode=" + verifyCode + ", sendDate="
				+ sendDate + ", sendContent=" + sendContent + ", verifyCodeValidity=" + verifyCodeValidity
				+ ", sendType=" + sendType + ", sendStatus=" + sendStatus + ", sendChannel=" + sendChannel + ", userId="
				+ userId + ", userType=" + userType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sendChannel == null) ? 0 : sendChannel.hashCode());
		result = prime * result + ((sendContent == null) ? 0 : sendContent.hashCode());
		result = prime * result + ((sendDate == null) ? 0 : sendDate.hashCode());
		result = prime * result + ((sendMobile == null) ? 0 : sendMobile.hashCode());
		result = prime * result + ((sendStatus == null) ? 0 : sendStatus.hashCode());
		result = prime * result + ((sendType == null) ? 0 : sendType.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((verifyCode == null) ? 0 : verifyCode.hashCode());
		result = prime * result + ((verifyCodeValidity == null) ? 0 : verifyCodeValidity.hashCode());
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
		TSendMsg other = (TSendMsg) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sendChannel == null) {
			if (other.sendChannel != null)
				return false;
		} else if (!sendChannel.equals(other.sendChannel))
			return false;
		if (sendContent == null) {
			if (other.sendContent != null)
				return false;
		} else if (!sendContent.equals(other.sendContent))
			return false;
		if (sendDate == null) {
			if (other.sendDate != null)
				return false;
		} else if (!sendDate.equals(other.sendDate))
			return false;
		if (sendMobile == null) {
			if (other.sendMobile != null)
				return false;
		} else if (!sendMobile.equals(other.sendMobile))
			return false;
		if (sendStatus == null) {
			if (other.sendStatus != null)
				return false;
		} else if (!sendStatus.equals(other.sendStatus))
			return false;
		if (sendType == null) {
			if (other.sendType != null)
				return false;
		} else if (!sendType.equals(other.sendType))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (verifyCode == null) {
			if (other.verifyCode != null)
				return false;
		} else if (!verifyCode.equals(other.verifyCode))
			return false;
		if (verifyCodeValidity == null) {
			if (other.verifyCodeValidity != null)
				return false;
		} else if (!verifyCodeValidity.equals(other.verifyCodeValidity))
			return false;
		return true;
	}
	
	
	
	
}
