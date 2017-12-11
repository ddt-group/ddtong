package com.ddtong.controller.merchant;

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
* @ClassName: MerchantController 
* @Description: 商家信息
* @author xc_qin
* @date 2017年12月11日 下午1:56:07 
*
 */
@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/mer/")
public class MerchantController {

	/**
	 * 
	* @Title: findMerDetail 
	* @Description: 查询商家明细
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 下午1:56:13
	 */
	@RequestMapping("findMerDetail")
	@ResponseBody
	public ApiResponseResult findMerDetail(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> paramMap = MapUtil.formatRequest(request);
		String merchantId = !paramMap.containsKey("merchantId") ? "1" : paramMap.get("merchantId");	
		return ApiResponseResult.success().status("0");
	}
}
