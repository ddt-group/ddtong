package com.ddtong.core.entity.awardRate;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
* @ClassName: TAwardRate 
* @Description: 奖励比例配置信息
* @author xc_qin
* @date 2017年12月6日 下午4:52:25 
*
 */
public class TAwardRate implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	* @author xc_qin
	* @date 2017年12月6日 下午4:52:54 
	*/ 
	private static final long serialVersionUID = -1693089374182447194L;

	private Long id;
	
	private BigDecimal customAward;
	
	private BigDecimal merchantAward;
	
	private BigDecimal customReProduct;
	
	private BigDecimal merReCustom;
	
	private BigDecimal agentReMer;
	
	private BigDecimal managerCenterAward;
	
	private BigDecimal fundAward;
	
	private BigDecimal platformAward;
	
	private BigDecimal payPoundage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getCustomAward 
	* @Description: 消费者奖励
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:55:37
	 */
	public BigDecimal getCustomAward() {
		return customAward;
	}

	/**
	 * 
	* @Title: setCustomAward 
	* @Description: 消费者奖励
	* @param customAward     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:55:47
	 */
	public void setCustomAward(BigDecimal customAward) {
		this.customAward = customAward;
	}

	/**
	 * 
	* @Title: getMerchantAward 
	* @Description: 商家奖励
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:55:57
	 */
	public BigDecimal getMerchantAward() {
		return merchantAward;
	}

	/**
	 * 
	* @Title: setMerchantAward 
	* @Description: 商家奖励
	* @param merchantAward     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:56:11
	 */
	public void setMerchantAward(BigDecimal merchantAward) {
		this.merchantAward = merchantAward;
	}

	/**
	 * 
	* @Title: getCustomReProduct 
	* @Description: 消费者推荐产品奖励
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:56:17
	 */
	public BigDecimal getCustomReProduct() {
		return customReProduct;
	}

	/**
	 * 
	* @Title: setCustomReProduct 
	* @Description: 消费者推荐产品奖励
	* @param customReProduct     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:56:27
	 */
	public void setCustomReProduct(BigDecimal customReProduct) {
		this.customReProduct = customReProduct;
	}

	/**
	 * 
	* @Title: getMerReCustom 
	* @Description: 商家推荐消费者奖励
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:56:33
	 */
	public BigDecimal getMerReCustom() {
		return merReCustom;
	}

	/**
	 * 
	* @Title: setMerReCustom 
	* @Description: 商家推荐消费者奖励
	* @param merReCustom     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:56:47
	 */
	public void setMerReCustom(BigDecimal merReCustom) {
		this.merReCustom = merReCustom;
	}

	/**
	 * 
	* @Title: getAgentReMer 
	* @Description: 服务商推荐商家奖励
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:56:53
	 */
	public BigDecimal getAgentReMer() {
		return agentReMer;
	}

	/**
	 * 
	* @Title: setAgentReMer 
	* @Description: 服务商推荐商家奖励
	* @param agentReMer     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:57:03
	 */
	public void setAgentReMer(BigDecimal agentReMer) {
		this.agentReMer = agentReMer;
	}

	/**
	 * 
	* @Title: getManagerCenterAward 
	* @Description: 管理中心奖励
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:57:13
	 */
	public BigDecimal getManagerCenterAward() {
		return managerCenterAward;
	}

	/**
	 * 
	* @Title: setManagerCenterAward 
	* @Description: 管理中心奖励
	* @param managerCenterAward     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:57:20
	 */
	public void setManagerCenterAward(BigDecimal managerCenterAward) {
		this.managerCenterAward = managerCenterAward;
	}

	/**
	 * 
	* @Title: getFundAward 
	* @Description: 扶贫基金奖励
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:57:25
	 */
	public BigDecimal getFundAward() {
		return fundAward;
	}

	/**
	 * 
	* @Title: setFundAward 
	* @Description: 扶贫基金奖励
	* @param fundAward     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:57:34
	 */
	public void setFundAward(BigDecimal fundAward) {
		this.fundAward = fundAward;
	}

	/**
	 * 
	* @Title: getPlatformAward 
	* @Description: 平台奖励
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:57:40
	 */
	public BigDecimal getPlatformAward() {
		return platformAward;
	}

	/**
	 * 
	* @Title: setPlatformAward 
	* @Description: 平台奖励
	* @param platformAward     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:57:49
	 */
	public void setPlatformAward(BigDecimal platformAward) {
		this.platformAward = platformAward;
	}

	/**
	 * 
	* @Title: getPayPoundage 
	* @Description: 支付手续费
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:57:54
	 */
	public BigDecimal getPayPoundage() {
		return payPoundage;
	}

	/**
	 * 
	* @Title: setPayPoundage 
	* @Description: 支付手续费
	* @param payPoundage     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:58:03
	 */
	public void setPayPoundage(BigDecimal payPoundage) {
		this.payPoundage = payPoundage;
	}

	public TAwardRate() {
		super();
	}

	public TAwardRate(Long id, BigDecimal customAward, BigDecimal merchantAward, BigDecimal customReProduct,
			BigDecimal merReCustom, BigDecimal agentReMer, BigDecimal managerCenterAward, BigDecimal fundAward,
			BigDecimal platformAward, BigDecimal payPoundage) {
		super();
		this.id = id;
		this.customAward = customAward;
		this.merchantAward = merchantAward;
		this.customReProduct = customReProduct;
		this.merReCustom = merReCustom;
		this.agentReMer = agentReMer;
		this.managerCenterAward = managerCenterAward;
		this.fundAward = fundAward;
		this.platformAward = platformAward;
		this.payPoundage = payPoundage;
	}

	@Override
	public String toString() {
		return "TAwardRate [id=" + id + ", customAward=" + customAward + ", merchantAward=" + merchantAward
				+ ", customReProduct=" + customReProduct + ", merReCustom=" + merReCustom + ", agentReMer=" + agentReMer
				+ ", managerCenterAward=" + managerCenterAward + ", fundAward=" + fundAward + ", platformAward="
				+ platformAward + ", payPoundage=" + payPoundage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agentReMer == null) ? 0 : agentReMer.hashCode());
		result = prime * result + ((customAward == null) ? 0 : customAward.hashCode());
		result = prime * result + ((customReProduct == null) ? 0 : customReProduct.hashCode());
		result = prime * result + ((fundAward == null) ? 0 : fundAward.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((managerCenterAward == null) ? 0 : managerCenterAward.hashCode());
		result = prime * result + ((merReCustom == null) ? 0 : merReCustom.hashCode());
		result = prime * result + ((merchantAward == null) ? 0 : merchantAward.hashCode());
		result = prime * result + ((payPoundage == null) ? 0 : payPoundage.hashCode());
		result = prime * result + ((platformAward == null) ? 0 : platformAward.hashCode());
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
		TAwardRate other = (TAwardRate) obj;
		if (agentReMer == null) {
			if (other.agentReMer != null)
				return false;
		} else if (!agentReMer.equals(other.agentReMer))
			return false;
		if (customAward == null) {
			if (other.customAward != null)
				return false;
		} else if (!customAward.equals(other.customAward))
			return false;
		if (customReProduct == null) {
			if (other.customReProduct != null)
				return false;
		} else if (!customReProduct.equals(other.customReProduct))
			return false;
		if (fundAward == null) {
			if (other.fundAward != null)
				return false;
		} else if (!fundAward.equals(other.fundAward))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (managerCenterAward == null) {
			if (other.managerCenterAward != null)
				return false;
		} else if (!managerCenterAward.equals(other.managerCenterAward))
			return false;
		if (merReCustom == null) {
			if (other.merReCustom != null)
				return false;
		} else if (!merReCustom.equals(other.merReCustom))
			return false;
		if (merchantAward == null) {
			if (other.merchantAward != null)
				return false;
		} else if (!merchantAward.equals(other.merchantAward))
			return false;
		if (payPoundage == null) {
			if (other.payPoundage != null)
				return false;
		} else if (!payPoundage.equals(other.payPoundage))
			return false;
		if (platformAward == null) {
			if (other.platformAward != null)
				return false;
		} else if (!platformAward.equals(other.platformAward))
			return false;
		return true;
	}
	
	
	
}
