package com.ddtong.core.dao.mapper.passport;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ddtong.core.entity.passport.VLoginUser;

@Mapper
public interface VLoginUserMapper {

	/**
	 *  校验通过账户登录 
	 * @param userType UserTypeEnum
	 * @param phone
	 * @param password
	 * @return
	 */
	VLoginUser getLoginAcc(@Param("userType") int userType, @Param("phone") String phone,
			@Param("password") String password);
	
	/**
	 * 第三方登录
	 * @param userType UserTypeEnum
	 * @param source_uid
	 * @param source_type
	 * @return
	 */
	VLoginUser getLoginThridparty(@Param("userType") int userType, @Param("source_uid") String source_uid,
			@Param("source_type") String source_type);

}
