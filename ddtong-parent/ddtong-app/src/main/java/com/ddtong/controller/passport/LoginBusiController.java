package com.ddtong.controller.passport;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
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
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.core.vo.LoginUserVO;
import com.ddtong.service.passport.LoginBusiService;

@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/login")
public class LoginBusiController {

	@Autowired
	private ApplicationContext ctx;

	@Resource(name = "loginBusiService")
	private LoginBusiService loginBusiService;

	@RequestMapping(value = "/loginIn", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public ApiResponseResult loginIn(@RequestHeader(value = "ddtclientid", required = true) int ddtclientid,
			@RequestHeader(value = "ddtterminaltype", required = true) int ddtterminaltype,
			@RequestHeader(value = "ddtusertype", required = true) int ddtusertype,
			@RequestParam(value = "moblie", required = true) String moblie,
			@RequestParam(value = "pwd", required = true) String pwd) {

		try {
			ClientApplicationEnum client = ClientApplicationEnum.getEnumByValue(ddtclientid);
			TerminalTypeEnum terminalTypeEnum = TerminalTypeEnum.getEnumByValue(ddtterminaltype);
			UserTypeEnum userTypeEnum = UserTypeEnum.getEnumByValue(ddtusertype);

			return loginBusiService.loginAcc(client, terminalTypeEnum, userTypeEnum, "", "");
		} catch (ServiceException e) {
			return e.getResult();
		} catch (Exception e) {
			return ApiResponseResult.failure("系统处理失败").debugMessage(e.getMessage());
		}

	}

	/**
	 * 获取数据 - 验证tickt
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
