package com.ddtong.controller.register;

import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddtong.core.common.DdtongConstant;
import com.ddtong.core.entity.merchant.TMerchant;
import com.ddtong.core.util.MapUtil;
import com.ddtong.core.vo.ApiResponseResult;

/**
 * 
* @ClassName: RegisterController 
* @Description: 注册
* @author xc_qin
* @date 2017年12月7日 下午6:49:38 
*
 */
@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/reg/")
public class RegisterController {
	
	/**
	 * 
	* @Title: regBasicInfo 
	* @Description: 注册初始化
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月7日 下午6:33:24
	 */
	@RequestMapping("regBasicInfo")
	@ResponseBody
	public ApiResponseResult regBasicInfo(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> paramMap = MapUtil.formatRequest(request);
		String recommendId = paramMap.containsKey("recommendId") ? "" : paramMap.get("recommendId");	// 推荐人
		String phone = paramMap.containsKey("phone") ? "" : paramMap.get("phone");					// 手机号
		String verifyCode = paramMap.containsKey("verifyCode") ? "" : paramMap.get("verifyCode");		// 验证码
		String sendType = paramMap.containsKey("sendType") ? "" : paramMap.get("sendType");			// 发送验证码类型
		// 1.校验参数 2.校验推荐人 3.校验手机号 4.校验短信验证码
		return ApiResponseResult.success("成功").status("0");
	}
	
	/**
	 * 
	* @Title: regMerchant 
	* @Description: 注册商家
	* @param request
	* @param response
	* @param merchant
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月7日 下午6:33:36
	 */
	@RequestMapping("regMerchant")
	@ResponseBody
	public ApiResponseResult regMerchant(HttpServletRequest request, HttpServletResponse response, TMerchant merchant){
		TreeMap<String, String> paramMap = MapUtil.formatRequest(request);
		// 1.校验参数 2.校验推荐人 3.校验手机号 4.校验工商注册名称 5.校验店铺名称 6.新增商家 7.新增账户信息 
		return ApiResponseResult.success("成功").status("0");
	}
	
	
}
