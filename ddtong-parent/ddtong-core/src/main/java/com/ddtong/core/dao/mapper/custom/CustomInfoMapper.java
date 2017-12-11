package com.ddtong.core.dao.mapper.custom;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.ddtong.core.entity.custom.TCustom;

@Mapper
public interface CustomInfoMapper {
	
	TCustom selectOneByid(@Param("id") long id);
	
	@Update(value = "update t_custom set `password`=#{password}, update_time=NOW() where id=#{id}")
	int updatePwd(@Param("id") long id, @Param("password") String password);

	@Update(value = "update t_custom set `pay_password`=#{payPassword}, update_time=NOW() where id=#{id}")
	int updatePayPwd(@Param("id") long id, @Param("payPassword") String payPassword);
}
