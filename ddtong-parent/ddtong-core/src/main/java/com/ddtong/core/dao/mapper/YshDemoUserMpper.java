package com.ddtong.core.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ddtong.core.entity.YshDemoUserEntity;

@Mapper
public interface YshDemoUserMpper {

	@Insert("insert t_ysh_user(id,user_name) values(#{id},#{userName})")
	void insert(YshDemoUserEntity u);
	
	@Select("select id,user_name as userName from t_ysh_user where id=#{id} ")
	YshDemoUserEntity findById(@Param("id")String id);
	
	//注：方法名和要UserMapper.xml中的id一致
	// 复杂语句建议使用xml mapper
	List<YshDemoUserEntity> query(@Param("userName")String userName);
	
}
