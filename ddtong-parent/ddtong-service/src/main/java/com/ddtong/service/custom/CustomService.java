package com.ddtong.service.custom;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddtong.core.dao.conofig.annotation.ReadDataSource;
import com.ddtong.core.dao.mapper.custom.CustomInfoMapper;
import com.ddtong.core.dao.mapper.merchant.MerchantInfoMapper;
import com.ddtong.core.entity.custom.TCustom;
import com.ddtong.core.entity.merchant.TMerchant;

@Service
public class CustomService {
	
	private static Logger loger = LoggerFactory.getLogger(CustomService.class);
	
	@Autowired
	private CustomInfoMapper customInfoMapper;
	@Autowired
	private MerchantInfoMapper merchantInfoMapper;
	
	@ReadDataSource
	public TCustom selectById(long id)
	{
		TCustom tCustom = customInfoMapper.selectOneByid(id);
		if(!"".equals(tCustom.getRecommendId())&&null!=tCustom.getRecommendId())
		{
			TMerchant tMerchant = merchantInfoMapper.selectOneByid(tCustom.getRecommendId());
			tCustom.settMerchant(tMerchant);
		}
		else
		{
			loger.info("用户："+tCustom.getId()+"没有推荐人ID");
		}
		return tCustom;
	}
}
