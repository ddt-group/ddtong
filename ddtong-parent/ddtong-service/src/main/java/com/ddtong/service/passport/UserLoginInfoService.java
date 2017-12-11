package com.ddtong.service.passport;

import com.ddtong.core.entity.passport.TUserLoginInfo;

public interface UserLoginInfoService {

	public TUserLoginInfo findOne(String clientId, int userType, long userId);
	
	public TUserLoginInfo saveLoginInfo(TUserLoginInfo userLoginInfo);
	
	
}
