package com.ddtong.service.account.impl;

import java.math.BigDecimal;
import java.util.Map;

import com.ddtong.service.account.AccountService;

public class AccountServiceImpl implements AccountService {

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
	@Override
	public Map<String, String> openAccount(Long userId, Long userType) {
		return null;
	}
	
	

}
