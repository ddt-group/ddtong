package com.ddtong.service.passport;

import com.ddtong.core.entity.passport.VLoginUser;

public interface VLoginUserService {

	public VLoginUser getLoginAcc(int userType, String phone, String password);

	public VLoginUser getLoginThridparty(int userType, String source_uid, String source_type);
}
