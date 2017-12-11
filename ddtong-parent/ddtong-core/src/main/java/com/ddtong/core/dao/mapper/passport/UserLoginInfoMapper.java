package com.ddtong.core.dao.mapper.passport;

import org.apache.ibatis.annotations.Mapper;

import com.ddtong.core.entity.passport.TUserLoginInfo;

@Mapper
public interface UserLoginInfoMapper {

	TUserLoginInfo selectLoginInfo(TUserLoginInfo paramLoginInfo);

	int insertLoginInfo(TUserLoginInfo userLoginInfo);

}
