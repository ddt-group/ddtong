package com.ddtong.controller.message;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddtong.core.common.DdtongConstant;
import com.ddtong.core.vo.ApiResponseResult;

@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/sms/")
public class SmsController {

	@RequestMapping("send")
	@ResponseBody
	public ApiResponseResult send(HttpServletRequest request, HttpServletResponse response){
		return null;
	}
}
