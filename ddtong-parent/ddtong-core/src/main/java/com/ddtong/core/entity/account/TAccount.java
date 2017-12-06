package com.ddtong.core.entity.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @ClassName: TAccount 
* @Description: 资金账户信息
* @author xc_qin
* @date 2017年12月6日 下午4:25:24 
*
 */
public class TAccount implements Serializable{

	private static final long serialVersionUID = 3223000683664467248L;

	private Long id;
	
	private Long userId;
	
	private Long userType;
	
	private String actState;
	
	private String amtState;
	
	private BigDecimal totalFb;
	
	private BigDecimal fb;
	
	private BigDecimal avaFb;
	
	private BigDecimal freezeFb;
	
	private BigDecimal totalRedIntegral;
	
	private BigDecimal redIntegral;
	
	private BigDecimal avaRedIntegral;
	
	private BigDecimal freeRedIntegral;
	
	private BigDecimal totalBlueIntegral;
	
	private BigDecimal blueIntegral;
	
	private BigDecimal avaBlueIntegral;
	
	private BigDecimal freeBlueIntegral;
	
	private BigDecimal totalGreenIntegral;
	
	private BigDecimal greenIntegral;
	
	private BigDecimal avaGreenIntegral;
	
	private BigDecimal freeGreenIntegral;
	
	private Date upateTime;
	
	private String runbatTime;
	
	private BigDecimal avaFbUse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getUserId 
	* @Description: 用户编号
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:12:00
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
	* @date 2017年12月6日 下午4:12:10
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
	* @date 2017年12月6日 下午4:12:17
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
	* @date 2017年12月6日 下午4:12:36
	 */
	public void setUserType(Long userType) {
		this.userType = userType;
	}

	/**
	 * 
	* @Title: getActState 
	* @Description: 账户状态 0:正常 1:禁用
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:12:44
	 */
	public String getActState() {
		return actState;
	}

	/**
	 * 
	* @Title: setActState 
	* @Description: 账户状态 0:正常 1:禁用
	* @param actState     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:13:07
	 */
	public void setActState(String actState) {
		this.actState = actState;
	}

	/**
	 * 
	* @Title: getAmtState 
	* @Description: 资金状态,以","分开,如"1,2,3,4" 1:正常激励 2:可提现 3:可转赠 4:可消费
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:13:15
	 */
	public String getAmtState() {
		return amtState;
	}

	/**
	 * 
	* @Title: setAmtState 
	* @Description: 资金状态,以","分开,如"1,2,3,4" 1:正常激励 2:可提现 3:可转赠 4:可消费 
	* @param amtState     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:13:34
	 */
	public void setAmtState(String amtState) {
		this.amtState = amtState;
	}

	/**
	 * 
	* @Title: getTotalFb 
	* @Description: 累计分宝,该字段只增不减
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:13:42
	 */
	public BigDecimal getTotalFb() {
		return totalFb;
	}

	/**
	 * 
	* @Title: setTotalFb 
	* @Description: 累计分宝,该字段只增不减
	* @param totalFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:13:55
	 */
	public void setTotalFb(BigDecimal totalFb) {
		this.totalFb = totalFb;
	}

	/**
	 * 
	* @Title: getFb 
	* @Description: 当前分宝,当前=可用+冻结
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:14:01
	 */
	public BigDecimal getFb() {
		return fb;
	}

	/**
	 * 
	* @Title: setFb 
	* @Description: 当前分宝,当前=可用+冻结
	* @param fb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:14:31
	 */
	public void setFb(BigDecimal fb) {
		this.fb = fb;
	}

	/**
	 * 
	* @Title: getAvaFb 
	* @Description: 可用分宝 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:14:38
	 */
	public BigDecimal getAvaFb() {
		return avaFb;
	}

	/**
	 * 
	* @Title: setAvaFb 
	* @Description: 可用分宝
	* @param avaFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:14:51
	 */
	public void setAvaFb(BigDecimal avaFb) {
		this.avaFb = avaFb;
	}

	/**
	 * 
	* @Title: getFreezeFb 
	* @Description: 冻结分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:14:58
	 */
	public BigDecimal getFreezeFb() {
		return freezeFb;
	}

	/**
	 * 
	* @Title: setFreezeFb 
	* @Description: 冻结分宝
	* @param freezeFb     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:15:15
	 */
	public void setFreezeFb(BigDecimal freezeFb) {
		this.freezeFb = freezeFb;
	}
	
	/**
	 * 
	* @Title: getTotalRedIntegral 
	* @Description: 累计红积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:19:20
	 */
	public BigDecimal getTotalRedIntegral() {
		return totalRedIntegral;
	}

	/**
	 * 
	* @Title: setTotalRedIntegral 
	* @Description: 累计红积分
	* @param totalRedIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:19:26
	 */
	public void setTotalRedIntegral(BigDecimal totalRedIntegral) {
		this.totalRedIntegral = totalRedIntegral;
	}

	/**
	 * 
	* @Title: getRedIntegral 
	* @Description: 当前总红积分 
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:19:32
	 */
	public BigDecimal getRedIntegral() {
		return redIntegral;
	}

	/**
	 * 
	* @Title: setRedIntegral 
	* @Description: 当前总红积分
	* @param redIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:19:45
	 */
	public void setRedIntegral(BigDecimal redIntegral) {
		this.redIntegral = redIntegral;
	}

	/**
	 * 
	* @Title: getAvaRedIntegral 
	* @Description: 可用红积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:19:53
	 */
	public BigDecimal getAvaRedIntegral() {
		return avaRedIntegral;
	}

	/**
	 * 
	* @Title: setAvaRedIntegral 
	* @Description: 可用红积分
	* @param avaRedIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:20:03
	 */
	public void setAvaRedIntegral(BigDecimal avaRedIntegral) {
		this.avaRedIntegral = avaRedIntegral;
	}

	/**
	 * 
	* @Title: getFreeRedIntegral 
	* @Description: 冻结红积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:15:21
	 */
	public BigDecimal getFreeRedIntegral() {
		return freeRedIntegral;
	}

	/**
	 * 
	* @Title: setFreeRedIntegral 
	* @Description: 冻结红积分
	* @param freeRedIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:20:17
	 */
	public void setFreeRedIntegral(BigDecimal freeRedIntegral) {
		this.freeRedIntegral = freeRedIntegral;
	}

	/**
	 * 
	* @Title: getTotalBlueIntegral 
	* @Description: 累计蓝积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:20:22
	 */
	public BigDecimal getTotalBlueIntegral() {
		return totalBlueIntegral;
	}

	/**
	 * 
	* @Title: setTotalBlueIntegral 
	* @Description: 累计蓝积分
	* @param totalBlueIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:20:33
	 */
	public void setTotalBlueIntegral(BigDecimal totalBlueIntegral) {
		this.totalBlueIntegral = totalBlueIntegral;
	}

	/**
	 * 
	* @Title: getBlueIntegral 
	* @Description: 当前总蓝积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:20:38
	 */
	public BigDecimal getBlueIntegral() {
		return blueIntegral;
	}

	/**
	 * 
	* @Title: setBlueIntegral 
	* @Description: 当前总蓝积分
	* @param blueIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:20:50
	 */
	public void setBlueIntegral(BigDecimal blueIntegral) {
		this.blueIntegral = blueIntegral;
	}

	/**
	 * 
	* @Title: getAvaBlueIntegral 
	* @Description: 可用蓝积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:20:55
	 */
	public BigDecimal getAvaBlueIntegral() {
		return avaBlueIntegral;
	}

	/**
	 * 
	* @Title: setAvaBlueIntegral 
	* @Description: 可用蓝积分 
	* @param avaBlueIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:21:06
	 */
	public void setAvaBlueIntegral(BigDecimal avaBlueIntegral) {
		this.avaBlueIntegral = avaBlueIntegral;
	}

	/**
	 * 
	* @Title: getFreeBlueIntegral 
	* @Description: 冻结蓝积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:21:13
	 */
	public BigDecimal getFreeBlueIntegral() {
		return freeBlueIntegral;
	}

	/**
	 * 
	* @Title: setFreeBlueIntegral 
	* @Description: 冻结蓝积分
	* @param freeBlueIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:21:24
	 */
	public void setFreeBlueIntegral(BigDecimal freeBlueIntegral) {
		this.freeBlueIntegral = freeBlueIntegral;
	}

	/**
	 * 
	* @Title: getTotalGreenIntegral 
	* @Description: 累计绿积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:22:09
	 */
	public BigDecimal getTotalGreenIntegral() {
		return totalGreenIntegral;
	}

	/**
	 * 
	* @Title: setTotalGreenIntegral 
	* @Description: 累计绿积分
	* @param totalGreenIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:22:20
	 */
	public void setTotalGreenIntegral(BigDecimal totalGreenIntegral) {
		this.totalGreenIntegral = totalGreenIntegral;
	}

	/**
	 * 
	* @Title: getGreenIntegral 
	* @Description: 当前总绿积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:22:26
	 */
	public BigDecimal getGreenIntegral() {
		return greenIntegral;
	}

	/**
	 * 
	* @Title: setGreenIntegral 
	* @Description: 当前总绿积分
	* @param greenIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:22:33
	 */
	public void setGreenIntegral(BigDecimal greenIntegral) {
		this.greenIntegral = greenIntegral;
	}
	
	/**
	 * 
	* @Title: getAvaGreenIntegral 
	* @Description: 可用绿积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:22:45
	 */
	public BigDecimal getAvaGreenIntegral() {
		return avaGreenIntegral;
	}

	/**
	 * 
	* @Title: setAvaGreenIntegral 
	* @Description: 可用绿积分
	* @param avaGreenIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:22:54
	 */
	public void setAvaGreenIntegral(BigDecimal avaGreenIntegral) {
		this.avaGreenIntegral = avaGreenIntegral;
	}

	/**
	 * 
	* @Title: getFreeGreenIntegral 
	* @Description: 冻结绿积分
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:22:59
	 */
	public BigDecimal getFreeGreenIntegral() {
		return freeGreenIntegral;
	}

	/**
	 * 
	* @Title: setFreeGreenIntegral 
	* @Description: 冻结绿积分
	* @param freeGreenIntegral     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:23:08
	 */
	public void setFreeGreenIntegral(BigDecimal freeGreenIntegral) {
		this.freeGreenIntegral = freeGreenIntegral;
	}

	/**
	 * 
	* @Title: getUpateTime 
	* @Description: 更新时间,除跑批之外变更
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:23:14
	 */
	public Date getUpateTime() {
		return upateTime;
	}

	/**
	 * 
	* @Title: setUpateTime 
	* @Description: 更新时间,除跑批之外变更
	* @param upateTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:23:24
	 */
	public void setUpateTime(Date upateTime) {
		this.upateTime = upateTime;
	}

	/**
	 * 
	* @Title: getRunbatTime 
	* @Description: 跑批时间
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:23:29
	 */
	public String getRunbatTime() {
		return runbatTime;
	}

	/**
	 * 
	* @Title: setRunbatTime 
	* @Description: 跑批时间
	* @param runbatTime     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:23:39
	 */
	public void setRunbatTime(String runbatTime) {
		this.runbatTime = runbatTime;
	}

	/**
	 * 
	* @Title: getAvaFbUse 
	* @Description: 当天参与激励的分宝
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:23:44
	 */
	public BigDecimal getAvaFbUse() {
		return avaFbUse;
	}

	/**
	 * 
	* @Title: setAvaFbUse 
	* @Description: 当天参与激励的分宝
	* @param avaFbUse     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午4:23:53
	 */
	public void setAvaFbUse(BigDecimal avaFbUse) {
		this.avaFbUse = avaFbUse;
	}

	public TAccount() {
		super();
	}

	public TAccount(Long id, Long userId, Long userType, String actState, String amtState, BigDecimal totalFb,
			BigDecimal fb, BigDecimal avaFb, BigDecimal freezeFb, BigDecimal totalRedIntegral, BigDecimal redIntegral,
			BigDecimal avaRedIntegral, BigDecimal freeRedIntegral, BigDecimal totalBlueIntegral,
			BigDecimal blueIntegral, BigDecimal avaBlueIntegral, BigDecimal freeBlueIntegral,
			BigDecimal totalGreenIntegral, BigDecimal greenIntegral, BigDecimal avaGreenIntegral,
			BigDecimal freeGreenIntegral, Date upateTime, String runbatTime, BigDecimal avaFbUse) {
		super();
		this.id = id;
		this.userId = userId;
		this.userType = userType;
		this.actState = actState;
		this.amtState = amtState;
		this.totalFb = totalFb;
		this.fb = fb;
		this.avaFb = avaFb;
		this.freezeFb = freezeFb;
		this.totalRedIntegral = totalRedIntegral;
		this.redIntegral = redIntegral;
		this.avaRedIntegral = avaRedIntegral;
		this.freeRedIntegral = freeRedIntegral;
		this.totalBlueIntegral = totalBlueIntegral;
		this.blueIntegral = blueIntegral;
		this.avaBlueIntegral = avaBlueIntegral;
		this.freeBlueIntegral = freeBlueIntegral;
		this.totalGreenIntegral = totalGreenIntegral;
		this.greenIntegral = greenIntegral;
		this.avaGreenIntegral = avaGreenIntegral;
		this.freeGreenIntegral = freeGreenIntegral;
		this.upateTime = upateTime;
		this.runbatTime = runbatTime;
		this.avaFbUse = avaFbUse;
	}

	@Override
	public String toString() {
		return "TAccount [id=" + id + ", userId=" + userId + ", userType=" + userType + ", actState=" + actState
				+ ", amtState=" + amtState + ", totalFb=" + totalFb + ", fb=" + fb + ", avaFb=" + avaFb + ", freezeFb="
				+ freezeFb + ", totalRedIntegral=" + totalRedIntegral + ", redIntegral=" + redIntegral
				+ ", avaRedIntegral=" + avaRedIntegral + ", freeRedIntegral=" + freeRedIntegral + ", totalBlueIntegral="
				+ totalBlueIntegral + ", blueIntegral=" + blueIntegral + ", avaBlueIntegral=" + avaBlueIntegral
				+ ", freeBlueIntegral=" + freeBlueIntegral + ", totalGreenIntegral=" + totalGreenIntegral
				+ ", greenIntegral=" + greenIntegral + ", avaGreenIntegral=" + avaGreenIntegral + ", freeGreenIntegral="
				+ freeGreenIntegral + ", upateTime=" + upateTime + ", runbatTime=" + runbatTime + ", avaFbUse="
				+ avaFbUse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actState == null) ? 0 : actState.hashCode());
		result = prime * result + ((amtState == null) ? 0 : amtState.hashCode());
		result = prime * result + ((avaBlueIntegral == null) ? 0 : avaBlueIntegral.hashCode());
		result = prime * result + ((avaFb == null) ? 0 : avaFb.hashCode());
		result = prime * result + ((avaFbUse == null) ? 0 : avaFbUse.hashCode());
		result = prime * result + ((avaGreenIntegral == null) ? 0 : avaGreenIntegral.hashCode());
		result = prime * result + ((avaRedIntegral == null) ? 0 : avaRedIntegral.hashCode());
		result = prime * result + ((blueIntegral == null) ? 0 : blueIntegral.hashCode());
		result = prime * result + ((fb == null) ? 0 : fb.hashCode());
		result = prime * result + ((freeBlueIntegral == null) ? 0 : freeBlueIntegral.hashCode());
		result = prime * result + ((freeGreenIntegral == null) ? 0 : freeGreenIntegral.hashCode());
		result = prime * result + ((freeRedIntegral == null) ? 0 : freeRedIntegral.hashCode());
		result = prime * result + ((freezeFb == null) ? 0 : freezeFb.hashCode());
		result = prime * result + ((greenIntegral == null) ? 0 : greenIntegral.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((redIntegral == null) ? 0 : redIntegral.hashCode());
		result = prime * result + ((runbatTime == null) ? 0 : runbatTime.hashCode());
		result = prime * result + ((totalBlueIntegral == null) ? 0 : totalBlueIntegral.hashCode());
		result = prime * result + ((totalFb == null) ? 0 : totalFb.hashCode());
		result = prime * result + ((totalGreenIntegral == null) ? 0 : totalGreenIntegral.hashCode());
		result = prime * result + ((totalRedIntegral == null) ? 0 : totalRedIntegral.hashCode());
		result = prime * result + ((upateTime == null) ? 0 : upateTime.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		TAccount other = (TAccount) obj;
		if (actState == null) {
			if (other.actState != null)
				return false;
		} else if (!actState.equals(other.actState))
			return false;
		if (amtState == null) {
			if (other.amtState != null)
				return false;
		} else if (!amtState.equals(other.amtState))
			return false;
		if (avaBlueIntegral == null) {
			if (other.avaBlueIntegral != null)
				return false;
		} else if (!avaBlueIntegral.equals(other.avaBlueIntegral))
			return false;
		if (avaFb == null) {
			if (other.avaFb != null)
				return false;
		} else if (!avaFb.equals(other.avaFb))
			return false;
		if (avaFbUse == null) {
			if (other.avaFbUse != null)
				return false;
		} else if (!avaFbUse.equals(other.avaFbUse))
			return false;
		if (avaGreenIntegral == null) {
			if (other.avaGreenIntegral != null)
				return false;
		} else if (!avaGreenIntegral.equals(other.avaGreenIntegral))
			return false;
		if (avaRedIntegral == null) {
			if (other.avaRedIntegral != null)
				return false;
		} else if (!avaRedIntegral.equals(other.avaRedIntegral))
			return false;
		if (blueIntegral == null) {
			if (other.blueIntegral != null)
				return false;
		} else if (!blueIntegral.equals(other.blueIntegral))
			return false;
		if (fb == null) {
			if (other.fb != null)
				return false;
		} else if (!fb.equals(other.fb))
			return false;
		if (freeBlueIntegral == null) {
			if (other.freeBlueIntegral != null)
				return false;
		} else if (!freeBlueIntegral.equals(other.freeBlueIntegral))
			return false;
		if (freeGreenIntegral == null) {
			if (other.freeGreenIntegral != null)
				return false;
		} else if (!freeGreenIntegral.equals(other.freeGreenIntegral))
			return false;
		if (freeRedIntegral == null) {
			if (other.freeRedIntegral != null)
				return false;
		} else if (!freeRedIntegral.equals(other.freeRedIntegral))
			return false;
		if (freezeFb == null) {
			if (other.freezeFb != null)
				return false;
		} else if (!freezeFb.equals(other.freezeFb))
			return false;
		if (greenIntegral == null) {
			if (other.greenIntegral != null)
				return false;
		} else if (!greenIntegral.equals(other.greenIntegral))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (redIntegral == null) {
			if (other.redIntegral != null)
				return false;
		} else if (!redIntegral.equals(other.redIntegral))
			return false;
		if (runbatTime == null) {
			if (other.runbatTime != null)
				return false;
		} else if (!runbatTime.equals(other.runbatTime))
			return false;
		if (totalBlueIntegral == null) {
			if (other.totalBlueIntegral != null)
				return false;
		} else if (!totalBlueIntegral.equals(other.totalBlueIntegral))
			return false;
		if (totalFb == null) {
			if (other.totalFb != null)
				return false;
		} else if (!totalFb.equals(other.totalFb))
			return false;
		if (totalGreenIntegral == null) {
			if (other.totalGreenIntegral != null)
				return false;
		} else if (!totalGreenIntegral.equals(other.totalGreenIntegral))
			return false;
		if (totalRedIntegral == null) {
			if (other.totalRedIntegral != null)
				return false;
		} else if (!totalRedIntegral.equals(other.totalRedIntegral))
			return false;
		if (upateTime == null) {
			if (other.upateTime != null)
				return false;
		} else if (!upateTime.equals(other.upateTime))
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
		return true;
	}

	
}
