package com.ddtong.controller.passport;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddtong.core.common.DdtongConstant;
import com.ddtong.core.enums.ClientApplicationEnum;
import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;
import com.ddtong.core.exception.ServiceException;
import com.ddtong.core.exception.UnLoginAccoutException;
import com.ddtong.core.util.Des;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.core.vo.LoginUserVO;
import com.ddtong.service.passport.LoginBusiService;

@Controller
@RequestMapping(DdtongConstant.API_PATH + "/login")
public class LoginBusiController {

	@Autowired
	private ApplicationContext ctx;

	@Resource(name = "loginBusiService")
	private LoginBusiService loginBusiService;

	/**
	 * 通过账户登陆
	 * @param ddtclientid
	 * @param ddtterminaltype
	 * @param ddtusertype
	 * @param moblie
	 * @param pwd
	 * @return
	 */
	@RequestMapping(value = "/accLogin", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public ApiResponseResult accLogin(@RequestHeader(value = "ddtclientid", required = true) int ddtclientid,
			@RequestHeader(value = "ddtterminaltype", required = true) int ddtterminaltype,
			@RequestHeader(value = "ddtusertype", required = true) int ddtusertype,
			@RequestParam(value = "moblie", required = true) String moblie,
			@RequestParam(value = "pwd", required = true) String pwd) {

		try {
			ClientApplicationEnum client = ClientApplicationEnum.getEnumByValue(ddtclientid);
			TerminalTypeEnum terminalTypeEnum = TerminalTypeEnum.getEnumByValue(ddtterminaltype);
			UserTypeEnum userTypeEnum = UserTypeEnum.getEnumByValue(ddtusertype);

			return loginBusiService.accLogin(client, terminalTypeEnum, userTypeEnum, "", "");
		} catch (ServiceException e) {
			return e.getResult();
		} catch (Exception e) {
			return ApiResponseResult.failure("系统处理失败").debugMessage(e.getMessage());
		}

	}
	
	/**
	 * PC端跳转到微信授权,扫码登陆
	 * 
	 * @return
	 */
	@RequestMapping(value = "/weixin/toLogin")
	public String toPcWeixinLogin(@RequestHeader(value = "ddtclientid", required = true) int ddtclientid,
			@RequestHeader(value = "ddtterminaltype", required = true) int ddtterminaltype,
			@RequestHeader(value = "ddtusertype", required = true) int ddtusertype) {
		//https://open.weixin.qq.com/connect/qrconnect?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect
		//https://open.weixin.qq.com/connect/qrconnect?appid=wxbdc5610cc59c1631&redirect_uri=https%3A%2F%2Fpassport.yhd.com%2Fwechat%2Fcallback.do&response_type=code&scope=snsapi_login&state=d334811cc6041f05d31f58405676ceb5#wechat_redirect
		
		// 成为微信开发者 获取到appid , 组装微信OAuth2授权url , 打开微信扫码页面
		// 注: 微信授权的回调地址,参数只能携带一个,回调接口采用Resfull 路径传参
		
		
		return "redirect:";
	}
	
	/**
	 * PC端微信登陆回调地址, 微信用户扫码确认授权后,回调处理授权
	 * 注: 微信授权的回调地址,参数只能携带一个,回调接口采用Resfull 路径传参
	 * @param ddtclientid
	 * @param ddtterminaltype
	 * @param ddtusertype
	 * @return
	 */
	@RequestMapping(value = "/weixin/{ddtclientid}/{ddtterminaltype}/{ddtusertype}/loginCallback")
	public String doPcWeixinLogin(@PathVariable("ddtclientid") int ddtclientid,
			@PathVariable("ddtterminaltype") int ddtterminaltype, @PathVariable("ddtusertype") int ddtusertype) {
		
		ClientApplicationEnum client = ClientApplicationEnum.getEnumByValue(ddtclientid);
		TerminalTypeEnum terminalTypeEnum = TerminalTypeEnum.getEnumByValue(ddtterminaltype);
		UserTypeEnum userTypeEnum = UserTypeEnum.getEnumByValue(ddtusertype);
		
		
		// service - 第三方登陆
		
		
		// 跳转前端页面, 前端页面在调用后台接口获取系统登陆tokenInfo
		String sddtorg = client.getValue() + "&" + terminalTypeEnum.getValue() + "&" + userTypeEnum.getValue();
		Des des = new Des();
		String sddt = des.strEnc(sddtorg, "firstKey", "secondKey", "thirdKey");
		long datet = new Date().getTime();// 强制调用,避免前端使用缓存
		String redirectUrl = "xxxx.xx.xx/xxx.html" + "?sddt=" + sddt + "&d=" + datet;
		return "redirect:" + redirectUrl;
	}
	
	/**
	 * PC端获取登陆token信息,用于调取登陆后接口
	 * 
	 * @param ddtclientid
	 * @param ddtterminaltype
	 * @param ddtusertype
	 * @return
	 */
	@RequestMapping(value = "/front/isLogin")
	public ApiResponseResult isLoginFront(@RequestParam(value = "sddt", required = true) String sddt) {
		Des des = new Des();
		String sddtorg = des.strDec(sddt, "firstKey", "secondKey", "thirdKey");
		
		if (sddtorg == null || "".equals(sddtorg.trim())) {
			ApiResponseResult.failure("登陆失败");
		}
		
		
		
		
		
		
		
		return null;
	}
	
	
	/**
	 * app第三方登陆
	 * @param ddtclientid
	 * @param ddtterminaltype
	 * @param ddtusertype
	 * @return
	 */
	@RequestMapping(value = "/appThirdpartyLogin")
	public ApiResponseResult appThirdpartyLogin(@RequestHeader(value = "ddtclientid", required = true) int ddtclientid,
			@RequestHeader(value = "ddtterminaltype", required = true) int ddtterminaltype,
			@RequestHeader(value = "ddtusertype", required = true) int ddtusertype,
			@RequestParam(value = "accesstoken", required = true) String accesstoken,
			@RequestParam(value = "openid", required = true) String openid,
			@RequestParam(value = "unionid", required = false) String unionid,
			@RequestParam(value = "thridtype", required = true) int thridtype) {

		
		// service - 第三方登陆
		
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("ddtclientid", 1);
		retMap.put("ddtterminaltype", 1);
		retMap.put("ddtusertype", 1);
		retMap.put("ddtuserid", 1232142);
		retMap.put("ddtticket", "dfosdlefsfkjliweljsdf");
		return null;

	}
	

	

	/**
	 * 获取数据demo - 验证tickt
	 * 
	 * @param clientid
	 *            客户端 ClientApplicationEnum
	 * @param terminalType
	 *            终端类型 TerminalTypeEnum
	 * @param userType
	 *            用户类型 UserTypeEnum
	 * @param userId
	 * @param ticket
	 * @return
	 */
	@RequestMapping(value = "/userdata", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public ApiResponseResult userdata() {
		try {
			// 验证token登陆信息
			LoginUserVO loginuser = loginBusiService.validateToken();

			// 查询数据

			return ApiResponseResult.success("成功").data(loginuser);

		} catch (UnLoginAccoutException e) {
			return ApiResponseResult.failure("未登陆").status("401");
		} catch (Exception e) {
			return ApiResponseResult.failure("系统处理失败").debugMessage(e.getMessage());
		}
	}

}
