package com.ddtong.core.entity.awardDate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TAwardDate 
* @Description: 激励信息
* @author xc_qin
* @date 2017年12月6日 下午4:32:47 
*
 */
public class TAwardDate implements Serializable{

	private static final long serialVersionUID = 3515742245186935759L;

	private Long id;
	
	private String payDate;
	
	private Date systemDate;
	
	private BigDecimal totalAmt;
	
	private BigDecimal customTotalFb;
	
	private BigDecimal merchantTotalFb;
	
	private BigDecimal customRegulate;
	
	private BigDecimal customNotRegulate;
	
	private BigDecimal merRegulate;
	
	private BigDecimal merNotRegulate;
	
	private String regulateState;
	
	private BigDecimal totalDiscountAmt;
	
	private BigDecimal useDiscountAmt;
	
	private String diffDiscountAmt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getPayDate 
	* @Description: 交易日期,格式yyyyMMdd 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:47:26
	 */
	public String getPayDate() {
		return payDate;
	}

	/**
	 * 
	* @Title: setPayDate 
	* @Description: 交易日期,格式yyyyMMdd
	* @param payDate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:47:36
	 */
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	/**
	 * 
	* @Title: getSystemDate 
	* @Description: 系统时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:47:41
	 */
	public Date getSystemDate() {
		return systemDate;
	}

	/**
	 * 
	* @Title: setSystemDate 
	* @Description: 系统时间
	* @param systemDate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:47:51
	 */
	public void setSystemDate(Date systemDate) {
		this.systemDate = systemDate;
	}

	/**
	 * 
	* @Title: getTotalAmt 
	* @Description: 系统当日总消费金额
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:48:00
	 */
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	/**
	 * 
	* @Title: setTotalAmt 
	* @Description: 系统当日总消费金额
	* @param totalAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:48:07
	 */
	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	/**
	 * 
	* @Title: getCustomTotalFb 
	* @Description: 消费者分宝总数
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:48:12
	 */
	public BigDecimal getCustomTotalFb() {
		return customTotalFb;
	}

	/**
	 * 
	* @Title: setCustomTotalFb 
	* @Description: 消费者分宝总数
	* @param customTotalFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:48:22
	 */
	public void setCustomTotalFb(BigDecimal customTotalFb) {
		this.customTotalFb = customTotalFb;
	}

	/**
	 * 
	* @Title: getMerchantTotalFb 
	* @Description: 商家分宝总数
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:48:27
	 */
	public BigDecimal getMerchantTotalFb() {
		return merchantTotalFb;
	}

	/**
	 * 
	* @Title: setMerchantTotalFb 
	* @Description: 商家分宝总数
	* @param merchantTotalFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:48:36
	 */
	public void setMerchantTotalFb(BigDecimal merchantTotalFb) {
		this.merchantTotalFb = merchantTotalFb;
	}

	/**
	 * 
	* @Title: getCustomRegulate 
	* @Description: 消费者分宝单价,已调控后的值
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:48:43
	 */
	public BigDecimal getCustomRegulate() {
		return customRegulate;
	}

	/**
	 * 
	* @Title: setCustomRegulate 
	* @Description: 消费者分宝单价,已调控后的值
	* @param customRegulate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:48:58
	 */
	public void setCustomRegulate(BigDecimal customRegulate) {
		this.customRegulate = customRegulate;
	}

	/**
	 * 
	* @Title: getCustomNotRegulate 
	* @Description: 消费者分宝单价,未调控的值
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:49:03
	 */
	public BigDecimal getCustomNotRegulate() {
		return customNotRegulate;
	}

	/**
	 * 
	* @Title: setCustomNotRegulate 
	* @Description: 消费者分宝单价,未调控的值
	* @param customNotRegulate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:49:20
	 */
	public void setCustomNotRegulate(BigDecimal customNotRegulate) {
		this.customNotRegulate = customNotRegulate;
	}

	/**
	 * 
	* @Title: getMerRegulate 
	* @Description: 商家分宝单价,已调控的值
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:49:26
	 */
	public BigDecimal getMerRegulate() {
		return merRegulate;
	}

	/**
	 * 
	* @Title: setMerRegulate 
	* @Description: 商家分宝单价,已调控的值
	* @param merRegulate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:49:38
	 */
	public void setMerRegulate(BigDecimal merRegulate) {
		this.merRegulate = merRegulate;
	}

	/**
	 * 
	* @Title: getMerNotRegulate 
	* @Description: 商家分宝单价,未调控的值
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:49:44
	 */
	public BigDecimal getMerNotRegulate() {
		return merNotRegulate;
	}

	/**
	 * 
	* @Title: setMerNotRegulate 
	* @Description: 商家分宝单价,未调控的值
	* @param merNotRegulate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:49:55
	 */
	public void setMerNotRegulate(BigDecimal merNotRegulate) {
		this.merNotRegulate = merNotRegulate;
	}

	/**
	 * 
	* @Title: getRegulateState 
	* @Description: 调控状态 0:已调控 1:未调控
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:50:01
	 */
	public String getRegulateState() {
		return regulateState;
	}

	/**
	 * 
	* @Title: setRegulateState 
	* @Description: 调控状态 0:已调控 1:未调控
	* @param regulateState     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:50:10
	 */
	public void setRegulateState(String regulateState) {
		this.regulateState = regulateState;
	}

	/**
	 * 
	* @Title: getTotalDiscountAmt 
	* @Description: 系统让利款金额
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:50:16
	 */
	public BigDecimal getTotalDiscountAmt() {
		return totalDiscountAmt;
	}

	/**
	 * 
	* @Title: setTotalDiscountAmt 
	* @Description: 系统让利款金额
	* @param totalDiscountAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:50:31
	 */
	public void setTotalDiscountAmt(BigDecimal totalDiscountAmt) {
		this.totalDiscountAmt = totalDiscountAmt;
	}

	/**
	 * 
	* @Title: getUseDiscountAmt 
	* @Description: 参与分配让利款金额
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:50:37
	 */
	public BigDecimal getUseDiscountAmt() {
		return useDiscountAmt;
	}

	/**
	 * 
	* @Title: setUseDiscountAmt 
	* @Description: 参与分配让利款金额
	* @param useDiscountAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:50:48
	 */
	public void setUseDiscountAmt(BigDecimal useDiscountAmt) {
		this.useDiscountAmt = useDiscountAmt;
	}

	/**
	 * 
	* @Title: getDiffDiscountAmt 
	* @Description: 调配资金池金额,总让利款-参与分配的让利款,如为正放入资金池,为负从资金池减去
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:50:53
	 */
	public String getDiffDiscountAmt() {
		return diffDiscountAmt;
	}

	/**
	 * 
	* @Title: setDiffDiscountAmt 
	* @Description: 调配资金池金额,总让利款-参与分配的让利款,如为正放入资金池,为负从资金池减去
	* @param diffDiscountAmt     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:51:05
	 */
	public void setDiffDiscountAmt(String diffDiscountAmt) {
		this.diffDiscountAmt = diffDiscountAmt;
	}

	public TAwardDate() {
		super();
	}

	public TAwardDate(Long id, String payDate, Date systemDate, BigDecimal totalAmt, BigDecimal customTotalFb,
			BigDecimal merchantTotalFb, BigDecimal customRegulate, BigDecimal customNotRegulate, BigDecimal merRegulate,
			BigDecimal merNotRegulate, String regulateState, BigDecimal totalDiscountAmt, BigDecimal useDiscountAmt,
			String diffDiscountAmt) {
		super();
		this.id = id;
		this.payDate = payDate;
		this.systemDate = systemDate;
		this.totalAmt = totalAmt;
		this.customTotalFb = customTotalFb;
		this.merchantTotalFb = merchantTotalFb;
		this.customRegulate = customRegulate;
		this.customNotRegulate = customNotRegulate;
		this.merRegulate = merRegulate;
		this.merNotRegulate = merNotRegulate;
		this.regulateState = regulateState;
		this.totalDiscountAmt = totalDiscountAmt;
		this.useDiscountAmt = useDiscountAmt;
		this.diffDiscountAmt = diffDiscountAmt;
	}

	@Override
	public String toString() {
		return "TAwardDate [id=" + id + ", payDate=" + payDate + ", systemDate=" + systemDate + ", totalAmt=" + totalAmt
				+ ", customTotalFb=" + customTotalFb + ", merchantTotalFb=" + merchantTotalFb + ", customRegulate="
				+ customRegulate + ", customNotRegulate=" + customNotRegulate + ", merRegulate=" + merRegulate
				+ ", merNotRegulate=" + merNotRegulate + ", regulateState=" + regulateState + ", totalDiscountAmt="
				+ totalDiscountAmt + ", useDiscountAmt=" + useDiscountAmt + ", diffDiscountAmt=" + diffDiscountAmt
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customNotRegulate == null) ? 0 : customNotRegulate.hashCode());
		result = prime * result + ((customRegulate == null) ? 0 : customRegulate.hashCode());
		result = prime * result + ((customTotalFb == null) ? 0 : customTotalFb.hashCode());
		result = prime * result + ((diffDiscountAmt == null) ? 0 : diffDiscountAmt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((merNotRegulate == null) ? 0 : merNotRegulate.hashCode());
		result = prime * result + ((merRegulate == null) ? 0 : merRegulate.hashCode());
		result = prime * result + ((merchantTotalFb == null) ? 0 : merchantTotalFb.hashCode());
		result = prime * result + ((payDate == null) ? 0 : payDate.hashCode());
		result = prime * result + ((regulateState == null) ? 0 : regulateState.hashCode());
		result = prime * result + ((systemDate == null) ? 0 : systemDate.hashCode());
		result = prime * result + ((totalAmt == null) ? 0 : totalAmt.hashCode());
		result = prime * result + ((totalDiscountAmt == null) ? 0 : totalDiscountAmt.hashCode());
		result = prime * result + ((useDiscountAmt == null) ? 0 : useDiscountAmt.hashCode());
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
		TAwardDate other = (TAwardDate) obj;
		if (customNotRegulate == null) {
			if (other.customNotRegulate != null)
				return false;
		} else if (!customNotRegulate.equals(other.customNotRegulate))
			return false;
		if (customRegulate == null) {
			if (other.customRegulate != null)
				return false;
		} else if (!customRegulate.equals(other.customRegulate))
			return false;
		if (customTotalFb == null) {
			if (other.customTotalFb != null)
				return false;
		} else if (!customTotalFb.equals(other.customTotalFb))
			return false;
		if (diffDiscountAmt == null) {
			if (other.diffDiscountAmt != null)
				return false;
		} else if (!diffDiscountAmt.equals(other.diffDiscountAmt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (merNotRegulate == null) {
			if (other.merNotRegulate != null)
				return false;
		} else if (!merNotRegulate.equals(other.merNotRegulate))
			return false;
		if (merRegulate == null) {
			if (other.merRegulate != null)
				return false;
		} else if (!merRegulate.equals(other.merRegulate))
			return false;
		if (merchantTotalFb == null) {
			if (other.merchantTotalFb != null)
				return false;
		} else if (!merchantTotalFb.equals(other.merchantTotalFb))
			return false;
		if (payDate == null) {
			if (other.payDate != null)
				return false;
		} else if (!payDate.equals(other.payDate))
			return false;
		if (regulateState == null) {
			if (other.regulateState != null)
				return false;
		} else if (!regulateState.equals(other.regulateState))
			return false;
		if (systemDate == null) {
			if (other.systemDate != null)
				return false;
		} else if (!systemDate.equals(other.systemDate))
			return false;
		if (totalAmt == null) {
			if (other.totalAmt != null)
				return false;
		} else if (!totalAmt.equals(other.totalAmt))
			return false;
		if (totalDiscountAmt == null) {
			if (other.totalDiscountAmt != null)
				return false;
		} else if (!totalDiscountAmt.equals(other.totalDiscountAmt))
			return false;
		if (useDiscountAmt == null) {
			if (other.useDiscountAmt != null)
				return false;
		} else if (!useDiscountAmt.equals(other.useDiscountAmt))
			return false;
		return true;
	}
	
	
}
