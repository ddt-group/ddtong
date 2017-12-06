package com.ddtong.core.entity.teamAward;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
* @ClassName: TTeamAward 
* @Description: 团队奖励配置信息
* @author xc_qin
* @date 2017年12月6日 下午6:16:50 
*
 */
public class TTeamAward implements Serializable{

	private static final long serialVersionUID = -8103190066609349321L;
	
	private Long id;
	
	private Long indexStart;
	
	private Long indexEnd;
	
	private BigDecimal rate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	* @Title: getIndexStart 
	* @Description: 起始值
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:17:56
	 */
	public Long getIndexStart() {
		return indexStart;
	}

	/**
	 * 
	* @Title: setIndexStart 
	* @Description: 起始值
	* @param indexStart     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:18:04
	 */
	public void setIndexStart(Long indexStart) {
		this.indexStart = indexStart;
	}

	/**
	 * 
	* @Title: getIndexEnd 
	* @Description: 结束值
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:18:10
	 */
	public Long getIndexEnd() {
		return indexEnd;
	}

	/**
	 * 
	* @Title: setIndexEnd 
	* @Description: 结束值
	* @param indexEnd     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:18:18
	 */
	public void setIndexEnd(Long indexEnd) {
		this.indexEnd = indexEnd;
	}

	/**
	 * 
	* @Title: getRate 
	* @Description: 比例
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:18:24
	 */
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * 
	* @Title: setRate 
	* @Description: 比例
	* @param rate     
	* @throws 
	* @author xc_qin
	* @date 2017年12月6日 下午6:18:31
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public TTeamAward() {
		super();
	}

	public TTeamAward(Long id, Long indexStart, Long indexEnd, BigDecimal rate) {
		super();
		this.id = id;
		this.indexStart = indexStart;
		this.indexEnd = indexEnd;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "TTeamAward [id=" + id + ", indexStart=" + indexStart + ", indexEnd=" + indexEnd + ", rate=" + rate
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((indexEnd == null) ? 0 : indexEnd.hashCode());
		result = prime * result + ((indexStart == null) ? 0 : indexStart.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
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
		TTeamAward other = (TTeamAward) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (indexEnd == null) {
			if (other.indexEnd != null)
				return false;
		} else if (!indexEnd.equals(other.indexEnd))
			return false;
		if (indexStart == null) {
			if (other.indexStart != null)
				return false;
		} else if (!indexStart.equals(other.indexStart))
			return false;
		if (rate == null) {
			if (other.rate != null)
				return false;
		} else if (!rate.equals(other.rate))
			return false;
		return true;
	}
	
	
	

}
