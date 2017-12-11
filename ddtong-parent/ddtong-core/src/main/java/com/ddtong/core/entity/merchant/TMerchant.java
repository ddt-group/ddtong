package com.ddtong.core.entity.merchant;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: TMerchant 
* @Description: 商家实体
* @author xc_qin
* @date 2017年12月6日 下午4:03:04 
*
 */
public class TMerchant implements Serializable{

	private static final long serialVersionUID = 3120716223024788418L;

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
	
	private String enterpriseName;
	
	private String shopName;
	
	private String industryType;
	
	private String address;
	
	private String webSite;
	
	private Long provinceId;
	
	private Long cityId;
	
	private Long areaId;
	
	private String longitude;
	
	private String latitude;
	
	private String enterpriseCode;
	
	private String legalName;
	
	private String email;
	
	private String businessLicense;
	
	private String positiveIdcard;
	
	private String negativeIdcard;
	
	private String logo;
	
	private String mainBusiness;
	
	private String shopMobile;
	
	
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

	
	/**
	 * 
	* @Title: getEnterpriseName 
	* @Description: 企业名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:54:42
	 */
	public String getEnterpriseName() {
		return enterpriseName;
	}

	/**
	 * 
	* @Title: setEnterpriseName 
	* @Description: 企业名称
	* @param enterpriseName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:54:53
	 */
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	/**
	 * 
	* @Title: getShopName 
	* @Description: 店铺名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:55:00
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * 
	* @Title: setShopName 
	* @Description: 店铺名称
	* @param shopName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:55:11
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * 
	* @Title: getIndustryType 
	* @Description: 行业类型
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:55:16
	 */
	public String getIndustryType() {
		return industryType;
	}

	/**
	 * 
	* @Title: setIndustryType 
	* @Description: 行业类型
	* @param industryType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:55:28
	 */
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	/**
	 * 
	* @Title: getAddress 
	* @Description: 地址
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:55:36
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 
	* @Title: setAddress 
	* @Description: 地址
	* @param address     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:55:45
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	* @Title: getWebSite 
	* @Description: 网址
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:55:50
	 */
	public String getWebSite() {
		return webSite;
	}

	/**
	 * 
	* @Title: setWebSite 
	* @Description:	网址
	* @param webSite     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:55:56
	 */
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	/**
	 * 
	* @Title: getProvinceId 
	* @Description: 省Id
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:56:11
	 */
	public Long getProvinceId() {
		return provinceId;
	}

	/**
	 * 
	* @Title: setProvinceId 
	* @Description: 省Id
	* @param provinceId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:56:19
	 */
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * 
	* @Title: getCityId 
	* @Description: 市ID
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:56:28
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
	* @date 2017年12月6日 下午3:56:38
	 */
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	/**
	 * 
	* @Title: getAreaId 
	* @Description: 区ID
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:56:46
	 */
	public Long getAreaId() {
		return areaId;
	}

	/**
	 * 
	* @Title: setAreaId 
	* @Description: 区ID
	* @param areaId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:56:53
	 */
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	/**
	 * 
	* @Title: getLongitude 
	* @Description: 经度
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:57:01
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * 
	* @Title: setLongitude 
	* @Description: 经度
	* @param longitude     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:57:09
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * 
	* @Title: getLatitude 
	* @Description: 纬度
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:57:21
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * 
	* @Title: setLatitude 
	* @Description: 纬度
	* @param latitude     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:57:33
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * 
	* @Title: getEnterpriseCode 
	* @Description: 统一信用代码
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:57:39
	 */
	public String getEnterpriseCode() {
		return enterpriseCode;
	}

	/**
	 * 
	* @Title: setEnterpriseCode 
	* @Description: 统一信用代码 
	* @param enterpriseCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:57:53
	 */
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	/**
	 * 
	* @Title: getLegalName 
	* @Description: 负责人姓名
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:57:59
	 */
	public String getLegalName() {
		return legalName;
	}

	/**
	 * 
	* @Title: setLegalName 
	* @Description: 负责人姓名
	* @param legalName     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:58:11
	 */
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	/**
	 * 
	* @Title: getEmail 
	* @Description: 邮箱
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:58:16
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	* @Title: setEmail 
	* @Description: 邮箱
	* @param email     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:58:23
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	* @Title: getBusinessLicense 
	* @Description: 营业执照
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:58:29
	 */
	public String getBusinessLicense() {
		return businessLicense;
	}

	/**
	 * 
	* @Title: setBusinessLicense 
	* @Description: 营业执照
	* @param businessLicense     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:58:43
	 */
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	/**
	 * 
	* @Title: getPositiveIdcard 
	* @Description: 身份证正面 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:58:49
	 */
	public String getPositiveIdcard() {
		return positiveIdcard;
	}

	/**
	 * 
	* @Title: setPositiveIdcard 
	* @Description: 身份证反面
	* @param positiveIdcard     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:58:57
	 */
	public void setPositiveIdcard(String positiveIdcard) {
		this.positiveIdcard = positiveIdcard;
	}

	/**
	 * 
	* @Title: getNegativeIdcard 
	* @Description: 身份证反面
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:59:07
	 */
	public String getNegativeIdcard() {
		return negativeIdcard;
	}

	/**
	 * 
	* @Title: setNegativeIdcard 
	* @Description: 身份证反面
	* @param negativeIdcard     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:59:29
	 */
	public void setNegativeIdcard(String negativeIdcard) {
		this.negativeIdcard = negativeIdcard;
	}
	
	/**
	 * 
	* @Title: getLogo 
	* @Description: 企业Logo/门头照
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午3:59:40
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * 
	* @Title: setLogo 
	* @Description: 企业Logo/门头照
	* @param logo     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:00:00
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * 
	* @Title: getMainBusiness 
	* @Description: 主营业务
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:00:05
	 */
	public String getMainBusiness() {
		return mainBusiness;
	}

	/**
	 * 
	* @Title: setMainBusiness 
	* @Description: 主营业务
	* @param mainBusiness     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:00:19
	 */
	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
	}

	/**
	 * 
	* @Title: getShopMobile 
	* @Description: 经营电话
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午3:13:37
	 */
	public String getShopMobile() {
		return shopMobile;
	}

	/**
	 * 
	* @Title: setShopMobile 
	* @Description: 经营电话
	* @param shopMobile     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午3:13:46
	 */
	public void setShopMobile(String shopMobile) {
		this.shopMobile = shopMobile;
	}

	public TMerchant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TMerchant(Long id, String nickName, String phone, String cid, String password, String realName, String state,
			String sourceUid, String sourceType, String headPic, Long recommendId, Date createTime, Date updateTime,
			String payPassword, String enterpriseName, String shopName, String industryType, String address,
			String webSite, Long provinceId, Long cityId, Long areaId, String longitude, String latitude,
			String enterpriseCode, String legalName, String email, String businessLicense, String positiveIdcard,
			String negativeIdcard, String logo, String mainBusiness, String shopMobile) {
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
		this.enterpriseName = enterpriseName;
		this.shopName = shopName;
		this.industryType = industryType;
		this.address = address;
		this.webSite = webSite;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.areaId = areaId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.enterpriseCode = enterpriseCode;
		this.legalName = legalName;
		this.email = email;
		this.businessLicense = businessLicense;
		this.positiveIdcard = positiveIdcard;
		this.negativeIdcard = negativeIdcard;
		this.logo = logo;
		this.mainBusiness = mainBusiness;
		this.shopMobile = shopMobile;
	}

	

	@Override
	public String toString() {
		return "TMerchant [id=" + id + ", nickName=" + nickName + ", phone=" + phone + ", cid=" + cid + ", password="
				+ password + ", realName=" + realName + ", state=" + state + ", sourceUid=" + sourceUid
				+ ", sourceType=" + sourceType + ", headPic=" + headPic + ", recommendId=" + recommendId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", payPassword=" + payPassword
				+ ", enterpriseName=" + enterpriseName + ", shopName=" + shopName + ", industryType=" + industryType
				+ ", address=" + address + ", webSite=" + webSite + ", provinceId=" + provinceId + ", cityId=" + cityId
				+ ", areaId=" + areaId + ", longitude=" + longitude + ", latitude=" + latitude + ", enterpriseCode="
				+ enterpriseCode + ", legalName=" + legalName + ", email=" + email + ", businessLicense="
				+ businessLicense + ", positiveIdcard=" + positiveIdcard + ", negativeIdcard=" + negativeIdcard
				+ ", logo=" + logo + ", mainBusiness=" + mainBusiness + ", shopMobile=" + shopMobile + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((areaId == null) ? 0 : areaId.hashCode());
		result = prime * result + ((businessLicense == null) ? 0 : businessLicense.hashCode());
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((enterpriseCode == null) ? 0 : enterpriseCode.hashCode());
		result = prime * result + ((enterpriseName == null) ? 0 : enterpriseName.hashCode());
		result = prime * result + ((headPic == null) ? 0 : headPic.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((industryType == null) ? 0 : industryType.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((legalName == null) ? 0 : legalName.hashCode());
		result = prime * result + ((logo == null) ? 0 : logo.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((mainBusiness == null) ? 0 : mainBusiness.hashCode());
		result = prime * result + ((negativeIdcard == null) ? 0 : negativeIdcard.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((payPassword == null) ? 0 : payPassword.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((positiveIdcard == null) ? 0 : positiveIdcard.hashCode());
		result = prime * result + ((provinceId == null) ? 0 : provinceId.hashCode());
		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
		result = prime * result + ((recommendId == null) ? 0 : recommendId.hashCode());
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		result = prime * result + ((sourceType == null) ? 0 : sourceType.hashCode());
		result = prime * result + ((sourceUid == null) ? 0 : sourceUid.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result + ((webSite == null) ? 0 : webSite.hashCode());
		result = prime * result + ((shopMobile == null) ? 0 : shopMobile.hashCode());
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
		TMerchant other = (TMerchant) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (areaId == null) {
			if (other.areaId != null)
				return false;
		} else if (!areaId.equals(other.areaId))
			return false;
		if (businessLicense == null) {
			if (other.businessLicense != null)
				return false;
		} else if (!businessLicense.equals(other.businessLicense))
			return false;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (cityId == null) {
			if (other.cityId != null)
				return false;
		} else if (!cityId.equals(other.cityId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enterpriseCode == null) {
			if (other.enterpriseCode != null)
				return false;
		} else if (!enterpriseCode.equals(other.enterpriseCode))
			return false;
		if (enterpriseName == null) {
			if (other.enterpriseName != null)
				return false;
		} else if (!enterpriseName.equals(other.enterpriseName))
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
		if (industryType == null) {
			if (other.industryType != null)
				return false;
		} else if (!industryType.equals(other.industryType))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (legalName == null) {
			if (other.legalName != null)
				return false;
		} else if (!legalName.equals(other.legalName))
			return false;
		if (logo == null) {
			if (other.logo != null)
				return false;
		} else if (!logo.equals(other.logo))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (mainBusiness == null) {
			if (other.mainBusiness != null)
				return false;
		} else if (!mainBusiness.equals(other.mainBusiness))
			return false;
		if (negativeIdcard == null) {
			if (other.negativeIdcard != null)
				return false;
		} else if (!negativeIdcard.equals(other.negativeIdcard))
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
		if (positiveIdcard == null) {
			if (other.positiveIdcard != null)
				return false;
		} else if (!positiveIdcard.equals(other.positiveIdcard))
			return false;
		if (provinceId == null) {
			if (other.provinceId != null)
				return false;
		} else if (!provinceId.equals(other.provinceId))
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
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
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
		if (webSite == null) {
			if (other.webSite != null)
				return false;
		} else if (!webSite.equals(other.webSite))
			return false;
		if (shopMobile == null) {
			if (other.shopMobile != null)
				return false;
		} else if (!shopMobile.equals(other.shopMobile))
			return false;
		return true;
	}
	
	
	
}
