package com.ddtong.core.dao.mapper.custom;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ddtong.core.entity.custom.TCustom;

@Mapper
public interface CustomInfoMapper {
	
	TCustom selectOneByid(@Param("id") long id);
}
