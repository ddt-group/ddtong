package com.ddtong.service.passport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddtong.core.dao.conofig.annotation.ReadDataSource;
import com.ddtong.core.dao.conofig.annotation.WriteDataSource;
import com.ddtong.core.dao.mapper.passport.UserLoginInfoMapper;
import com.ddtong.core.entity.passport.TUserLoginInfo;
import com.ddtong.service.passport.UserLoginInfoService;

@Service
public class UserLoginInfoServiceImpl implements UserLoginInfoService {

	@Autowired
	private UserLoginInfoMapper userLoginInfoMapper;

	@ReadDataSource
	public TUserLoginInfo findOne(String clientId, int userType, long userId) {
		TUserLoginInfo param = new TUserLoginInfo();
		param.setClientId(clientId);
		param.setUserType(userType);
		param.setUserId(userId);
		return userLoginInfoMapper.selectLoginInfo(param);
	}

	@ReadDataSource
	public TUserLoginInfo selectLoginInfo(TUserLoginInfo paramLoginInfo) {
		return userLoginInfoMapper.selectLoginInfo(paramLoginInfo);
	}

	@WriteDataSource
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
	public TUserLoginInfo saveLoginInfo(TUserLoginInfo userLoginInfo) {
		TUserLoginInfo flinfo = findOne(userLoginInfo.getClientId(), userLoginInfo.getUserType(),
				userLoginInfo.getUserId());
		if (flinfo == null) {
			insertLoginInfo(userLoginInfo);
			return userLoginInfo;
		} else {
			updateLoginInfo(userLoginInfo);
			return userLoginInfo;
		}
	}

	@WriteDataSource
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
	public int insertLoginInfo(TUserLoginInfo userLoginInfo) {
		return userLoginInfoMapper.insertLoginInfo(userLoginInfo);
	}

	@WriteDataSource
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
	public int updateLoginInfo(TUserLoginInfo userLoginInfo) {
		return userLoginInfoMapper.updateLoginInfo(userLoginInfo);
	}
}
