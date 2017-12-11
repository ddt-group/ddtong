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
