package com.ddtong.controller.message;

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
* @ClassName: SmsController 
* @Description: 短信
* @author xc_qin
* @date 2017年12月7日 下午4:53:07 
*
 */
@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/sms/")
public class SmsController {

	/**
	 * 
	* @Title: sendMsg 
	* @Description: 发送短信
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月7日 下午4:53:24
	 */
	@RequestMapping("sendMsg")
	@ResponseBody
	public ApiResponseResult sendMsg(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		String recommendId = map.containsKey("recommendId") ? "" : map.get("recommendId");	// 推荐人ID
		String phone = map.containsKey("phone") ? "" : map.get("phone");					// 手机号
		String imgCode = map.containsKey("imgCode") ? "" : map.get("imgCode");				// 图文验证码
		String verifyCode = map.containsKey("verifyCode") ? "" : map.get("verifyCode");		// 短信验证码
		String sendType = map.containsKey("sendType") ? "" : map.get("sendType");			// 短信发送类型 1:消费者注册 2:商家注册
		// 1.校验参数 2.校验图文验证码 3.校验推荐人 4.校验手机号 5.校验短信发送类型 6.发送短信
		return ApiResponseResult.failure("失败").status("1").data(MapUtil.strMap("图文验证错误"));
		
	}
}
