package com.ddtong.controller.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddtong.core.common.DdtongConstant;
import com.ddtong.core.entity.userBank.TUserBank;
import com.ddtong.core.util.MapUtil;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.core.vo.Page;

/**
 * 
* @ClassName: AccountController 
* @Description: 账户信息
* @author xc_qin
* @date 2017年12月9日 下午12:06:39 
*
 */
@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/account/")
public class AccountController {

	/**
	 * 
	* @Title: initDonation 
	* @Description: 初始化转赠信息
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 下午12:06:46
	 */
	@RequestMapping("initDonation")
	@ResponseBody
	public ApiResponseResult initDonation(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 校验登录信息
		//loginBusiService.validateToken();
		// 支持的转赠类型
		List<String[]> wdTypeList = new ArrayList<String[]>();
		wdTypeList.add(new String[]{"1","红积分"});
		wdTypeList.add(new String[]{"1","蓝积分"});
		wdTypeList.add(new String[]{"1","绿积分"});
		resultMap.put("donationType", wdTypeList);
		// 可用积分
		resultMap.put("avaFbNum", "90000");
		return ApiResponseResult.success().status("0").data(resultMap);
	}
	
	/**
	 * 
	* @Title: donation 
	* @Description: 转赠
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 下午12:06:57
	 */
	@RequestMapping("donation")
	@ResponseBody
	public ApiResponseResult donation(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		// 校验登录信息
		//loginBusiService.validateToken();
		// 1.校验参数 2.校验转赠权限 3.校验可用积分 4.校验获赠人信息 5.校验验证码 6.校验支付密码 7.校验金额 
		return ApiResponseResult.success("成功").status("0");
	}
	
	/**
	 * 
	* @Title: findDonation 
	* @Description: 查询转赠记录
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 下午12:07:07
	 */
	@RequestMapping("findDonation")
	@ResponseBody
	public ApiResponseResult findDonation(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		// 校验登录信息
		//loginBusiService.validateToken();
		// 查询提现记录信息
		return ApiResponseResult.success("成功").status("0");
	}
	
	/**
	 * 
	* @Title: findReceive 
	* @Description: 查询获赠记录
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 下午12:07:16
	 */
	@RequestMapping("findReceive")
	@ResponseBody
	public ApiResponseResult findReceive(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> paramMap = MapUtil.formatRequest(request);
		System.out.println(paramMap.toString());
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 校验登录信息
		//loginBusiService.validateToken();
		// 查询提现记录信息
		Page page = new Page(1, 20);
		resultMap.put("page", page);
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("operTime", new Date());
		map.put("tradeUserId", 2L);
		map.put("tradeUserName", "前端");
		map.put("integral", "100");
		map.put("remark", "测试");
		mapList.add(map);
		mapList.add(map);
		mapList.add(map);
		resultMap.put("list", mapList);
		return ApiResponseResult.success("成功").status("0").data(resultMap);
	}
	
}
