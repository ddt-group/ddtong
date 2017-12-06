package com.ddtong.core.entity.runBat;

import java.io.Serializable;

/**
 * 
* @ClassName: TRunBat 
* @Description: 跑批类型统计信息
* @author xc_qin
* @date 2017年12月6日 下午5:59:31 
*
 */
public class TRunBat implements Serializable{

	private static final long serialVersionUID = 3985222180356943545L;

	private String batDate;
	
	private String batCode;
	
	private String batType;
	
	private String batState;
	
	private String batDesc;

	/**
	 * 
	* @Title: getBatDate 
	* @Description: 跑批日期
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:00:45
	 */
	public String getBatDate() {
		return batDate;
	}

	/**
	 * 
	* @Title: setBatDate 
	* @Description: 跑批日期
	* @param batDate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:00:54
	 */
	public void setBatDate(String batDate) {
		this.batDate = batDate;
	}

	/**
	 * 
	* @Title: getBatCode 
	* @Description: 批处理名称
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:00:59
	 */
	public String getBatCode() {
		return batCode;
	}

	/**
	 * 
	* @Title: setBatCode 
	* @Description: 批处理名称
	* @param batCode     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:01:11
	 */
	public void setBatCode(String batCode) {
		this.batCode = batCode;
	}

	/**
	 * 
	* @Title: getBatType 
	* @Description: 跑批类型 
	* 	1:计算当日激励分宝 2:统计商家日营业额 3:计算商家营业额峰值 4:统计消费者推荐产品奖励比例 
	* 	5:计算消费者分宝和商家分宝价值 6:分佣 7:奖励消费者推荐产品 8:奖励消费者分宝 9:奖励商家分宝'
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:01:17
	 */
	public String getBatType() {
		return batType;
	}

	/**
	 * 
	* @Title: setBatType 
	* @Description: 跑批类型 
	* 	1:计算当日激励分宝 2:统计商家日营业额 3:计算商家营业额峰值 4:统计消费者推荐产品奖励比例 
	* 	5:计算消费者分宝和商家分宝价值 6:分佣 7:奖励消费者推荐产品 8:奖励消费者分宝 9:奖励商家分宝'
	* @param batType     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:01:40
	 */
	public void setBatType(String batType) {
		this.batType = batType;
	}

	/**
	 * 
	* @Title: getBatState 
	* @Description: 跑批状态 0:已成功跑批 1:跑批失败 2:初始化
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:01:46
	 */
	public String getBatState() {
		return batState;
	}

	/**
	 * 
	* @Title: setBatState 
	* @Description: 跑批状态 0:已成功跑批 1:跑批失败 2:初始化
	* @param batState     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:01:55
	 */
	public void setBatState(String batState) {
		this.batState = batState;
	}

	/**
	 * 
	* @Title: getBatDesc 
	* @Description: 跑批描述
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:02:01
	 */
	public String getBatDesc() {
		return batDesc;
	}

	/**
	 * 
	* @Title: setBatDesc 
	* @Description: 跑批描述
	* @param batDesc     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:02:08
	 */
	public void setBatDesc(String batDesc) {
		this.batDesc = batDesc;
	}

	public TRunBat() {
		super();
	}

	public TRunBat(String batDate, String batCode, String batType, String batState, String batDesc) {
		super();
		this.batDate = batDate;
		this.batCode = batCode;
		this.batType = batType;
		this.batState = batState;
		this.batDesc = batDesc;
	}

	@Override
	public String toString() {
		return "TRunBat [batDate=" + batDate + ", batCode=" + batCode + ", batType=" + batType + ", batState="
				+ batState + ", batDesc=" + batDesc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batCode == null) ? 0 : batCode.hashCode());
		result = prime * result + ((batDate == null) ? 0 : batDate.hashCode());
		result = prime * result + ((batDesc == null) ? 0 : batDesc.hashCode());
		result = prime * result + ((batState == null) ? 0 : batState.hashCode());
		result = prime * result + ((batType == null) ? 0 : batType.hashCode());
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
		TRunBat other = (TRunBat) obj;
		if (batCode == null) {
			if (other.batCode != null)
				return false;
		} else if (!batCode.equals(other.batCode))
			return false;
		if (batDate == null) {
			if (other.batDate != null)
				return false;
		} else if (!batDate.equals(other.batDate))
			return false;
		if (batDesc == null) {
			if (other.batDesc != null)
				return false;
		} else if (!batDesc.equals(other.batDesc))
			return false;
		if (batState == null) {
			if (other.batState != null)
				return false;
		} else if (!batState.equals(other.batState))
			return false;
		if (batType == null) {
			if (other.batType != null)
				return false;
		} else if (!batType.equals(other.batType))
			return false;
		return true;
	}
	
	
	
}
