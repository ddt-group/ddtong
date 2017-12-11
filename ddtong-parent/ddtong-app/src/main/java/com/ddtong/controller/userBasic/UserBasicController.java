package com.ddtong.controller.userBasic;

import java.util.ArrayList;
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
import com.ddtong.core.util.MapUtil;
import com.ddtong.core.vo.ApiResponseResult;

@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/basic/")
public class UserBasicController {

	
	/**
	 * 
	* @Title: basicBindPhone 
	* @Description: 初始化变更手机号
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 下午12:26:51
	 */
	@RequestMapping("basicBindPhone")
	@ResponseBody
	public ApiResponseResult basicBindPhone(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		// 1.校验登录信息 2.校验短信验证码
		return ApiResponseResult.success().status("0");
	}
	
	/**
	 * 
	* @Title: bindPhone 
	* @Description: 绑定手机号
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 下午12:09:46
	 */
	@RequestMapping("bindPhone")
	@ResponseBody
	public ApiResponseResult bindPhone(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		// 1.校验登录信息 2.校验手机号 3.校验短信验证码 4.变更用户手机号 5.登出
		return ApiResponseResult.success().status("0");
	}
	
	@RequestMapping("checkVerifyCode")
	@ResponseBody
	public ApiResponseResult checkVerifyCode(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		// 1.校验登录信息 2.校验手机号 3.校验图文验证码 4.校验短信验证码
		return ApiResponseResult.success().status("0");
	}
}
