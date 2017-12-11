package com.ddtong.service.passport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddtong.core.dao.conofig.annotation.ReadDataSource;
import com.ddtong.core.dao.mapper.passport.VLoginUserMapper;
import com.ddtong.core.entity.passport.VLoginUser;
import com.ddtong.service.passport.VLoginUserService;

@Service
public class VLoginUserServiceImpl implements VLoginUserService {

	@Autowired
	protected VLoginUserMapper vloginUserMapper;

	/**
	 * 校验通过账户登录
	 * 
	 * @param userType
	 *            UserTypeEnum
	 * @param phone
	 * @param password
	 * @return
	 */
	@ReadDataSource
	public VLoginUser getLoginAcc(int userType, String phone, String password) {
		return vloginUserMapper.getLoginAcc(userType, phone, password);
	}

	/**
	 * 第三方登录
	 * 
	 * @param userType
	 *            UserTypeEnum
	 * @param source_uid
	 * @param source_type
	 * @return
	 */
	@ReadDataSource
	public VLoginUser getLoginThridparty(int userType, String source_uid, String source_type) {
		return vloginUserMapper.getLoginThridparty(userType, source_uid, source_type);
	}

}
