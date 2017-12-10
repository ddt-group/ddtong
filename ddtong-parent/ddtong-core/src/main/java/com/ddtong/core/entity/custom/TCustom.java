package com.ddtong.core.entity.custom;

import java.io.Serializable;
import java.util.Date;

import com.ddtong.core.entity.merchant.TMerchant;

/**
 * 
* @ClassName: TCustom 
* @Description: 消费者实体
* @author xc_qin
* @date 2017年12月6日 下午3:36:02 
*
 */
public class TCustom implements Serializable{

	private static final long serialVersionUID = -7626829689956295392L;
	
	private Long id;
	
	private String nickName;
	
	private String phone;
	
	private String cid;
	
	private String password;
	
	private String realName;
	
	private String state;
	
	private String sourceUid;
	
	private String sourceType;
	
	private String headPic;
	
	private Long recommendId;
	
	private Date createTime;
	
	private Date updateTime;
	
	private String payPassword;
	
	private TMerchant tMerchant;//推荐人信息
	
	public TMerchant gettMerchant() {
		return tMerchant;
	}

	public void settMerchant(TMerchant tMerchant) {
		this.tMerchant = tMerchant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getNickName 
	* @Description: 昵称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:39:20
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * 
	* @Title: setNickName 
	* @Description: 昵称
	* @param nickName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:39:31
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * 
	* @Title: getPhone 
	* @Description: 手机号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:39:36
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	* @Title: setPhone 
	* @Description: 手机号
	* @param phone     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:39:50
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 
	* @Title: getCid 
	* @Description: 身份证
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:39:57
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * 
	* @Title: setCid 
	* @Description: 身份证
	* @param cid     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:40:02
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}

	/**
	 * 
	* @Title: getPassword 
	* @Description: 登录密码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:40:09
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	* @Title: setPassword 
	* @Description: 登录密码
	* @param password     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:40:17
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	* @Title: getRealName 
	* @Description: 真实姓名
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:40:25
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * 
	* @Title: setRealName 
	* @Description: 真实姓名
	* @param realName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:40:35
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * 
	* @Title: getState 
	* @Description: 状态 0:正常 1:停用
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:40:42
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	* @Title: setState 
	* @Description: 状态 0:正常 1:停用
	* @param state     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:41:03
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	* @Title: getSourceUid 
	* @Description:	来源Id,如:unionId、openId、aliId
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:41:10
	 */
	public String getSourceUid() {
		return sourceUid;
	}

	/**
	 * 
	* @Title: setSourceUid 
	* @Description: 来源Id,如:unionId、openId、aliId
	* @param sourceUid     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:41:53
	 */
	public void setSourceUid(String sourceUid) {
		this.sourceUid = sourceUid;
	}

	/**
	 * 
	* @Title: getSourceType 
	* @Description: 来源类型 1：微信 2：支付宝 3：QQ
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:42:02
	 */
	public String getSourceType() {
		return sourceType;
	}

	/**
	 * 
	* @Title: setSourceType 
	* @Description: 来源类型 1：微信 2：支付宝 3：QQ
	* @param sourceType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:42:32
	 */
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	/**
	 * 
	* @Title: getHeadPic 
	* @Description: 头像地址
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:42:39
	 */
	public String getHeadPic() {
		return headPic;
	}

	/**
	 * 
	* @Title: setHeadPic 
	* @Description: 头像地址
	* @param headPic     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:42:53
	 */
	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}

	/**
	 * 
	* @Title: getRecommendId 
	* @Description: 推荐人ID
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:42:58
	 */
	public Long getRecommendId() {
		return recommendId;
	}

	/**
	 * 
	* @Title: setRecommendId 
	* @Description: 推荐人ID
	* @param recommendId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:43:10
	 */
	public void setRecommendId(Long recommendId) {
		this.recommendId = recommendId;
	}

	/**
	 * 
	* @Title: getCreateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:43:17
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
	* @date 2017年12月6日 下午3:43:26
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 
	* @Title: getUpdateTime 
	* @Description: 最后更新时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:43:33
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 
	* @Title: setUpdateTime 
	* @Description: 最后更新时间
	* @param updateTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:43:43
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 
	* @Title: getPayPassword 
	* @Description: 支付密码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:43:48
	 */
	public String getPayPassword() {
		return payPassword;
	}

	/**
	 * 
	* @Title: setPayPassword 
	* @Description: 支付密码
	* @param payPassword     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:43:57
	 */
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	
	
	public TCustom() {
		super();
	}

	public TCustom(Long id, String nickName, String phone, String cid, String password, String realName, String state,
			String sourceUid, String sourceType, String headPic, Long recommendId, Date createTime, Date updateTime,
			String payPassword) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.phone = phone;
		this.cid = cid;
		this.password = password;
		this.realName = realName;
		this.state = state;
		this.sourceUid = sourceUid;
		this.sourceType = sourceType;
		this.headPic = headPic;
		this.recommendId = recommendId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.payPassword = payPassword;
	}

	@Override
	public String toString() {
		return "TCustom [id=" + id + ", nickName=" + nickName + ", phone=" + phone + ", cid=" + cid + ", password="
				+ password + ", realName=" + realName + ", state=" + state + ", sourceUid=" + sourceUid
				+ ", sourceType=" + sourceType + ", headPic=" + headPic + ", recommendId=" + recommendId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", payPassword=" + payPassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((headPic == null) ? 0 : headPic.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((payPassword == null) ? 0 : payPassword.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
		result = prime * result + ((recommendId == null) ? 0 : recommendId.hashCode());
		result = prime * result + ((sourceType == null) ? 0 : sourceType.hashCode());
		result = prime * result + ((sourceUid == null) ? 0 : sourceUid.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
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
		TCustom other = (TCustom) obj;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (headPic == null) {
			if (other.headPic != null)
				return false;
		} else if (!headPic.equals(other.headPic))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (payPassword == null) {
			if (other.payPassword != null)
				return false;
		} else if (!payPassword.equals(other.payPassword))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (realName == null) {
			if (other.realName != null)
				return false;
		} else if (!realName.equals(other.realName))
			return false;
		if (recommendId == null) {
			if (other.recommendId != null)
				return false;
		} else if (!recommendId.equals(other.recommendId))
			return false;
		if (sourceType == null) {
			if (other.sourceType != null)
				return false;
		} else if (!sourceType.equals(other.sourceType))
			return false;
		if (sourceUid == null) {
			if (other.sourceUid != null)
				return false;
		} else if (!sourceUid.equals(other.sourceUid))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}
	
	

	

}
