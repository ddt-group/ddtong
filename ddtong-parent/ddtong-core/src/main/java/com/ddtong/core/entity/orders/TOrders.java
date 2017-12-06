package com.ddtong.core.entity.orders;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TOrders 
* @Description: 订单表
* @author xc_qin
* @date 2017年12月6日 下午5:46:47 
*
 */
public class TOrders implements Serializable{

	private static final long serialVersionUID = 8783244358813597853L;

	private Long id;
	
	private Long customId;
	
	private Long merchantId;
	
	private String orderNo;
	
	private BigDecimal orderMoney;
	
	private Integer orderRatio;
	
	private Integer state;
	
	private BigDecimal profitMoney;
	
	private BigDecimal customFb;
	
	private BigDecimal merchantFb;
	
	private Date createTime;
	
	private Date checkTime;
	
	private Long checkUserId;
	
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getCustomId 
	* @Description: 消费者id
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:52:04
	 */
	public Long getCustomId() {
		return customId;
	}

	/**
	 * 
	* @Title: setCustomId 
	* @Description: 消费者id
	* @param customId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:52:21
	 */
	public void setCustomId(Long customId) {
		this.customId = customId;
	}

	/**
	 * 
	* @Title: getMerchantId 
	* @Description: 商家用户id
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:52:28
	 */
	public Long getMerchantId() {
		return merchantId;
	}

	/**
	 * 
	* @Title: setMerchantId 
	* @Description: 商家用户id
	* @param merchantId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:52:44
	 */
	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * 
	* @Title: getOrderNo 
	* @Description: 订单号 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:52:49
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * 
	* @Title: setOrderNo 
	* @Description: 订单号
	* @param orderNo     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:52:57
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * 
	* @Title: getOrderMoney 
	* @Description: 商品价格
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:53:07
	 */
	public BigDecimal getOrderMoney() {
		return orderMoney;
	}

	/**
	 * 
	* @Title: setOrderMoney 
	* @Description: 商品价格
	* @param orderMoney     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:53:15
	 */
	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}

	/**
	 * 
	* @Title: getOrderRatio 
	* @Description: 订单让利系数(不含%)
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:53:22
	 */
	public Integer getOrderRatio() {
		return orderRatio;
	}

	/**
	 * 
	* @Title: setOrderRatio 
	* @Description: 订单让利系数(不含%)
	* @param orderRatio     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:53:32
	 */
	public void setOrderRatio(Integer orderRatio) {
		this.orderRatio = orderRatio;
	}

	/**
	 * 
	* @Title: getState 
	* @Description: 订单状态 1让利款待审核 2让利款审核通过 3让利款审核未通过 4撤单 5无效
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:53:37
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * 
	* @Title: setState 
	* @Description: 订单状态 1让利款待审核 2让利款审核通过 3让利款审核未通过 4撤单 5无效
	* @param state     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:53:48
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 
	* @Title: getProfitMoney 
	* @Description: 应让利金额
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:53:54
	 */
	public BigDecimal getProfitMoney() {
		return profitMoney;
	}

	/**
	 * 
	* @Title: setProfitMoney 
	* @Description: 应让利金额
	* @param profitMoney     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:54:08
	 */
	public void setProfitMoney(BigDecimal profitMoney) {
		this.profitMoney = profitMoney;
	}

	/**
	 * 
	* @Title: getCustomFb 
	* @Description: 消费者获得的分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:54:13
	 */
	public BigDecimal getCustomFb() {
		return customFb;
	}

	/**
	 * 
	* @Title: setCustomFb 
	* @Description: 消费者获得的分宝
	* @param customFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:54:21
	 */
	public void setCustomFb(BigDecimal customFb) {
		this.customFb = customFb;
	}

	/**
	 * 
	* @Title: getMerchantFb 
	* @Description: 商家获得的分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:54:29
	 */
	public BigDecimal getMerchantFb() {
		return merchantFb;
	}

	/**
	 * 
	* @Title: setMerchantFb 
	* @Description: 商家获得的分宝
	* @param merchantFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:54:53
	 */
	public void setMerchantFb(BigDecimal merchantFb) {
		this.merchantFb = merchantFb;
	}

	/**
	 * 
	* @Title: getCreateTime 
	* @Description: 创建时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:54:58
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
	* @date 2017年12月6日 下午5:55:05
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 
	* @Title: getCheckTime 
	* @Description: 审核时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:55:10
	 */
	public Date getCheckTime() {
		return checkTime;
	}

	/**
	 * 
	* @Title: setCheckTime 
	* @Description: 审核时间
	* @param checkTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:55:18
	 */
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	/**
	 * 
	* @Title: getCheckUserId 
	* @Description: 审核人id
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:55:23
	 */
	public Long getCheckUserId() {
		return checkUserId;
	}

	/**
	 * 
	* @Title: setCheckUserId 
	* @Description: 审核人id
	* @param checkUserId     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:55:31
	 */
	public void setCheckUserId(Long checkUserId) {
		this.checkUserId = checkUserId;
	}

	/**
	 * 
	* @Title: getRemark 
	* @Description: 审核备注
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:55:36
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 
	* @Title: setRemark 
	* @Description: 审核备注
	* @param remark     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午5:55:45
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public TOrders() {
		super();
	}

	public TOrders(Long id, Long customId, Long merchantId, String orderNo, BigDecimal orderMoney, Integer orderRatio,
			Integer state, BigDecimal profitMoney, BigDecimal customFb, BigDecimal merchantFb, Date createTime,
			Date checkTime, Long checkUserId, String remark) {
		super();
		this.id = id;
		this.customId = customId;
		this.merchantId = merchantId;
		this.orderNo = orderNo;
		this.orderMoney = orderMoney;
		this.orderRatio = orderRatio;
		this.state = state;
		this.profitMoney = profitMoney;
		this.customFb = customFb;
		this.merchantFb = merchantFb;
		this.createTime = createTime;
		this.checkTime = checkTime;
		this.checkUserId = checkUserId;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "TOrders [id=" + id + ", customId=" + customId + ", merchantId=" + merchantId + ", orderNo=" + orderNo
				+ ", orderMoney=" + orderMoney + ", orderRatio=" + orderRatio + ", state=" + state + ", profitMoney="
				+ profitMoney + ", customFb=" + customFb + ", merchantFb=" + merchantFb + ", createTime=" + createTime
				+ ", checkTime=" + checkTime + ", checkUserId=" + checkUserId + ", remark=" + remark + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkTime == null) ? 0 : checkTime.hashCode());
		result = prime * result + ((checkUserId == null) ? 0 : checkUserId.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((customFb == null) ? 0 : customFb.hashCode());
		result = prime * result + ((customId == null) ? 0 : customId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((merchantFb == null) ? 0 : merchantFb.hashCode());
		result = prime * result + ((merchantId == null) ? 0 : merchantId.hashCode());
		result = prime * result + ((orderMoney == null) ? 0 : orderMoney.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + ((orderRatio == null) ? 0 : orderRatio.hashCode());
		result = prime * result + ((profitMoney == null) ? 0 : profitMoney.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		TOrders other = (TOrders) obj;
		if (checkTime == null) {
			if (other.checkTime != null)
				return false;
		} else if (!checkTime.equals(other.checkTime))
			return false;
		if (checkUserId == null) {
			if (other.checkUserId != null)
				return false;
		} else if (!checkUserId.equals(other.checkUserId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (customFb == null) {
			if (other.customFb != null)
				return false;
		} else if (!customFb.equals(other.customFb))
			return false;
		if (customId == null) {
			if (other.customId != null)
				return false;
		} else if (!customId.equals(other.customId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (merchantFb == null) {
			if (other.merchantFb != null)
				return false;
		} else if (!merchantFb.equals(other.merchantFb))
			return false;
		if (merchantId == null) {
			if (other.merchantId != null)
				return false;
		} else if (!merchantId.equals(other.merchantId))
			return false;
		if (orderMoney == null) {
			if (other.orderMoney != null)
				return false;
		} else if (!orderMoney.equals(other.orderMoney))
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (orderRatio == null) {
			if (other.orderRatio != null)
				return false;
		} else if (!orderRatio.equals(other.orderRatio))
			return false;
		if (profitMoney == null) {
			if (other.profitMoney != null)
				return false;
		} else if (!profitMoney.equals(other.profitMoney))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	
	
	
}
