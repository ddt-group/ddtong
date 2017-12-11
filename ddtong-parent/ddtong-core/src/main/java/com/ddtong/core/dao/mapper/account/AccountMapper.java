package com.ddtong.core.dao.mapper.account;

import org.apache.ibatis.annotations.Mapper;

import com.ddtong.core.entity.account.TAccount;

/**
 * 
* @ClassName: AccountMapper 
* @Description: 资金账户
* @author xc_qin
* @date 2017年12月11日 下午4:23:15 
*
 */
@Mapper
public interface AccountMapper {

	
	/**
	 * 
	* @Title: findAccount 
	* @Description: 查询资金账户信息
	* @param userId		用户编号
	* @param userType	用户类型 1:消费者 2:商家 3:服务商 4:管理中心
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午5:26:57
	 */
	public TAccount findAccount(Long userId, Long userType);
	
	/**
	 * 
	* @Title: insertAccount 
	* @Description: 新增资金账户信息
	* @param account
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午4:29:32
	 */
	public int insertAccount(TAccount account);
}
