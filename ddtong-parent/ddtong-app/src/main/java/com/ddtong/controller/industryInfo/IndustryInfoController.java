package com.ddtong.controller.industryInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddtong.core.common.DdtongConstant;
import com.ddtong.core.entity.industryInfo.TIndustryInfo;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.service.redis.DdtRedisClient;
import com.ddtong.service.redis.RedisCacheConfig;
import com.ddtong.service.redis.RedisClient;

/**
 * 
* @ClassName: IndustryInfoController 
* @Description: 行业信息
* @author xc_qin
* @date 2017年12月7日 下午6:05:13 
*
 */
@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/industry/")
public class IndustryInfoController {
	
	@Autowired
	private DdtRedisClient ddtReidsClient;

	/**
	 * 
	* @Title: findIndustryList 
	* @Description: 获取所有行业信息
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月7日 下午6:34:07
	 */
	@RequestMapping("findIndustryList")
	@ResponseBody
	public ApiResponseResult findIndustryList(HttpServletRequest request, HttpServletResponse response){
		List<TIndustryInfo> list = new ArrayList<TIndustryInfo>();
		list = ((List<TIndustryInfo>) ddtReidsClient.get("industry"));
		if(null == list || list.isEmpty() || list.size() < 0){
			list = new ArrayList<TIndustryInfo>();
			TIndustryInfo ind = new TIndustryInfo(1L, "美食", "http://www.baidu.com");
			list.add(ind);
			ind = new TIndustryInfo(2L, "酒店", "http://www.baidu.com");
			list.add(ind);
			ind = new TIndustryInfo(3L, "生活旅行", "http://www.baidu.com");
			list.add(ind);
			ind = new TIndustryInfo(4L, "超市", "http://www.baidu.com");
			list.add(ind);
			ind = new TIndustryInfo(5L, "手机数码", "http://www.baidu.com");
			list.add(ind);
			ind = new TIndustryInfo(6L, "家用电器", "http://www.baidu.com");
			list.add(ind);
			ind = new TIndustryInfo(7L, "电脑办公", "http://www.baidu.com");
			list.add(ind);
			ddtReidsClient.set("industry", list);
		}
		return ApiResponseResult.success("成功").status("0").data(list);
		
	}
}
