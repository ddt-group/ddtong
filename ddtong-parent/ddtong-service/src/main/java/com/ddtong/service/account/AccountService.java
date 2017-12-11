package com.ddtong.service.account;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 
* @ClassName: AccountService 
* @Description: 账户信息
* @author xc_qin
* @date 2017年12月11日 下午3:45:00 
*
 */
public interface AccountService {

	/**
	 * 
	* @Title: receiveIncome 
	* @Description: 获赠转入
	* @param userId			用户ID
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param integral
	* @param integralType
	* @param tradeUserId
	* @param remark
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午5:00:49
	 */
	public Map<String, String> receiveIncome(Long userId, Long userType, BigDecimal integral, String integralType, Long tradeUserId, String remark);
	
	/**
	 * 
	* @Title: shoppingIncome 
	* @Description: 消费转入
	* @param userId			用户ID
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param tradeAmt
	* @param feeAmt
	* @param integral
	* @param integralType
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午5:01:13
	 */
	public Map<String, String> shoppingIncome(Long userId, Long userType, BigDecimal tradeAmt, BigDecimal feeAmt, BigDecimal integral, String integralType);
	
	/**
	 * 
	* @Title: recommendIncome 
	* @Description: 推荐转入 / 产品推荐转入
	* @param userId		用户ID
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param integral
	* @param integralType
	* @param incomeType		
	* 	转入类型 04:推荐转入 05:产品推荐转入
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午4:09:35
	 */
	public Map<String, String> recommendIncome(Long userId, Long userType, BigDecimal integral, String integralType, String incomeType);
	
	/**
	 * 
	* @Title: withDrawExpend 
	* @Description: 提现转出
	* @param userId		用户ID
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param integral
	* @param integralType
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午4:12:20
	 */
	public Map<String, String> withDrawExpend(Long userId, Long userType, BigDecimal integral, String integralType, String remark);
	
	/**
	 * 
	* @Title: receiveExpend 
	* @Description: 转赠转出
	* @param userId		用户ID
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param integral
	* @param integralType
	* @param tradeUserId
	* @param remark
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午4:15:11
	 */
	public Map<String, String> receiveExpend(Long userId, Long userType, BigDecimal integral, String integralType, Long tradeUserId, String remark);
	
	/**
	 * 
	* @Title: shoppingExpend 
	* @Description: 消费转出
	* @param userId		用户ID
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param tradeAmt
	* @param feeAmt
	* @param integral
	* @param integralType
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午4:18:08
	 */
	public Map<String, String> shoppingExpend(Long userId, Long userType, BigDecimal tradeAmt, BigDecimal feeAmt, BigDecimal integral, String integralType);
	
	/**
	 * 
	* @Title: manageExpend 
	* @Description: 管理费转出
	* @param userId		用户ID
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @param integral
	* @param integralType
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午4:19:13
	 */
	public Map<String, String> manageExpend(Long userId, Long userType, BigDecimal integral, String integralType);
	
	/**
	 * 
	* @Title: openAccount 
	* @Description: 开户
	* @param userId		用户ID
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午4:20:30
	 */
	public Map<String, String> openAccount(Long userId, Long userType);
	
}
