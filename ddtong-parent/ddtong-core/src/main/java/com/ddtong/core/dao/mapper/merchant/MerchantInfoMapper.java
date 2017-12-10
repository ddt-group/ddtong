package com.ddtong.core.dao.mapper.merchant;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ddtong.core.entity.custom.TCustom;
import com.ddtong.core.entity.merchant.TMerchant;

@Mapper
public interface MerchantInfoMapper {
	
	TMerchant selectOneByid(@Param("id") long id);
}
