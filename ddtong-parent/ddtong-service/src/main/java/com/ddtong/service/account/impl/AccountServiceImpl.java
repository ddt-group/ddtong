package com.ddtong.service.account.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddtong.core.dao.conofig.annotation.WriteDataSource;
import com.ddtong.core.dao.mapper.account.AccountMapper;
import com.ddtong.core.entity.account.TAccount;
import com.ddtong.core.util.MapUtil;
import com.ddtong.service.account.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private static Logger loger = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public Map<String, String> receiveIncome(Long userId, Long userType, BigDecimal integral, String integralType,
			Long tradeUserId, String remark) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> shoppingIncome(Long userId, Long userType, BigDecimal tradeAmt, BigDecimal feeAmt,
			BigDecimal integral, String integralType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> recommendIncome(Long userId, Long userType, BigDecimal integral, String integralType,
			String incomeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> withDrawExpend(Long userId, Long userType, BigDecimal integral, String integralType,
			String remark) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> receiveExpend(Long userId, Long userType, BigDecimal integral, String integralType,
			Long tradeUserId, String remark) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> shoppingExpend(Long userId, Long userType, BigDecimal tradeAmt, BigDecimal feeAmt,
			BigDecimal integral, String integralType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> manageExpend(Long userId, Long userType, BigDecimal integral, String integralType) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 资金账户开户
	 */
	@WriteDataSource
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
	@Override
	public Map<String, String> openAccount(Long userId, Long userType) {
		if((null == userId || userId < 0) || (null == userType || userType < 0))
			return MapUtil.strMap("1", "非法请求");
		
		TAccount account = new TAccount();
		account = accountMapper.findAccount(userId, userType);
		if(null != account){
			return MapUtil.strMap("2", "资金账户已存在");
		}
		account = new TAccount();
		account.setUserId(userId);
		account.setUserType(userType);
		account.setUpateTime(new Date());
		int result = accountMapper.insertAccount(account);
		if(result < 0){
			loger.error("资金账户开户失败,desc : " + account);
		}
		return MapUtil.strMap("0", "开户成功");
	}
	
	

}
