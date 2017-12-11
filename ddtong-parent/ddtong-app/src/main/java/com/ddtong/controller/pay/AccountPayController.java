package com.ddtong.controller.pay;

import java.util.HashMap;
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

/**
 * 
* @ClassName: AccountPayController 
* @Description: 账户内支付
* @author xc_qin
* @date 2017年12月11日 上午10:53:18 
*
 */
@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/actPay/")
public class AccountPayController {

	/**
	 * 
	* @Title: merchantPayCode 
	* @Description: 生产付款码地址参数
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 上午11:41:54
	 */
	@RequestMapping("merchantPayCode")
	@ResponseBody
	public ApiResponseResult merchantPayCode(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> paramMap = MapUtil.formatRequest(request);
		String integralType = paramMap.containsKey("integralType") ? paramMap.get("integralType") : "1" ;	
		String merchantId = paramMap.containsKey("merchantId") ? paramMap.get("merchantId") : "1";	
		String integralAmt = paramMap.containsKey("integralAmt") ? paramMap.get("integralAmt") : "10000";	
		Map<String, String> map = new HashMap<String, String>();
		map.put("integralType", integralType);
		map.put("merchantId", merchantId);
		map.put("integralAmt", integralAmt);
		String url = DdtongConstant.APP_API_PATH + "/actPay/basicIntegralPay?" + MapUtil.createLinkString(map);
		System.out.println(url);
		return ApiResponseResult.success().status("0").data(url);
	}
	
	/**
	 * 
	* @Title: basicIntegralPay 
	* @Description: 扫码初始化
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 上午11:42:17
	 */
	@RequestMapping("basicIntegralPay")
	@ResponseBody
	public ApiResponseResult basicIntegralPay(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> paramMap = MapUtil.formatRequest(request);
		String integralType = !paramMap.containsKey("integralType") ? "1" : paramMap.get("integralType");	
		String merchantId = !paramMap.containsKey("merchantId") ? "1" : paramMap.get("merchantId");	
		String integralAmt = !paramMap.containsKey("integralAmt") ? "10000" : paramMap.get("integralAmt");	
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("integralType", integralType);
		map.put("merchantId", merchantId);
		map.put("merchantName", "测试商家");
		map.put("merchantPhone", "13888888888");
		map.put("integralAmt", integralAmt);
		map.put("avaIntegral", "1000000");
		return ApiResponseResult.success().status("0").data(map);
	}
	
	@RequestMapping("integralPay")
	@ResponseBody
	public ApiResponseResult integralPay(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> paramMap = MapUtil.formatRequest(request);
		String integralType = !paramMap.containsKey("integralType") ? "1" : paramMap.get("integralType");	
		String merchantId = !paramMap.containsKey("merchantId") ? "1" : paramMap.get("merchantId");	
		String constomId = !paramMap.containsKey("constomId") ? "1" : paramMap.get("constomId");	
		String payAmt = !paramMap.containsKey("payAmt") ? "10000" : paramMap.get("payAmt");	
		String payPassword = !paramMap.containsKey("payPassword") ? "10000" : paramMap.get("payPassword");	
		Map<String, Object> map = new HashMap<String, Object>();
		return ApiResponseResult.success().status("0");
	}
}
