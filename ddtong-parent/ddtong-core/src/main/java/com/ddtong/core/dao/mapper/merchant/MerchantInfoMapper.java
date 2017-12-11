package com.ddtong.core.dao.mapper.merchant;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.ddtong.core.entity.merchant.TMerchant;

@Mapper
public interface MerchantInfoMapper {

	TMerchant selectOneByid(@Param("id") long id);

	@Update(value = "update t_merchant set `password`=#{password}, update_time=NOW() where id=#{id}")
	int updatePwd(@Param("id") long id, @Param("password") String password);

	@Update(value = "update t_merchant set `pay_password`=#{payPassword}, update_time=NOW() where id=#{id}")
	int updatePayPwd(@Param("id") long id, @Param("payPassword") String payPassword);
}
