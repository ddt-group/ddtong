package com.ddtong.service.passport.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ddtong.core.enums.ClientApplicationEnum;
import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;
import com.ddtong.core.exception.ServiceException;
import com.ddtong.core.exception.UnLoginAccoutException;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.core.vo.LoginUserVO;
import com.ddtong.service.passport.DdtLoginService;
import com.ddtong.service.passport.LoginBusiService;

@Service(value = "loginBusiService")
public class LoginBusiServiceImpl extends AbstractLoginService implements LoginBusiService {

	private static final Logger logger = LoggerFactory.getLogger(LoginBusiServiceImpl.class);

	@Resource(name = "appLoginService")
	private DdtLoginService appLoginService;

	@Resource(name = "frontLoginService")
	private DdtLoginService frontLoginService;

	public void login4Thirdparty(TerminalTypeEnum terminalTypeEnum, UserTypeEnum userTypeEnum, String accesstoken,
			String openid, int thirdpartyType) {

	}

	/**
	 * 通过账户登陆
	 * 
	 * @throws UnLoginAccoutException
	 */
	public ApiResponseResult loginAcc(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, String account, String pwd) throws ServiceException {

		if (client == ClientApplicationEnum.CUSTOM_APP) {
			return appLoginService.loginAcc(client, terminalTypeEnum, userTypeEnum, account, pwd);
		} else if (client == ClientApplicationEnum.MERCHANT_APP) {
			return appLoginService.loginAcc(client, terminalTypeEnum, userTypeEnum, account, pwd);
		} else if (client == ClientApplicationEnum.CUSTOM_WEB) {
			return frontLoginService.loginAcc(client, terminalTypeEnum, userTypeEnum, account, pwd);
		} else if (client == ClientApplicationEnum.MERCHANT_WEB) {
			return frontLoginService.loginAcc(client, terminalTypeEnum, userTypeEnum, account, pwd);
		} else {
			throw ServiceException.failure("参数错误");
		}
	}

	public LoginUserVO validateToken() throws UnLoginAccoutException {
		HttpServletRequest request = getRequest();
		int clientid = request.getIntHeader("ddtclientid");
		int terminalType = request.getIntHeader("ddtterminaltype");
		int userType = request.getIntHeader("ddtusertype");
		Long userid = new Long(request.getHeader("ddtuserid"));
		String ticket_md5 = request.getHeader("ddtticket");

		ClientApplicationEnum client = ClientApplicationEnum.getEnumByValue(clientid);
		TerminalTypeEnum terminalTypeEnum = TerminalTypeEnum.getEnumByValue(terminalType);
		UserTypeEnum userTypeEnum = UserTypeEnum.getEnumByValue(userType);

		return validateToken(client, terminalTypeEnum, userTypeEnum, userid, ticket_md5);

	}

	private LoginUserVO validateToken(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, Long userid, String ticket_md5) throws UnLoginAccoutException {
		if (client == ClientApplicationEnum.CUSTOM_APP) {
			return appLoginService.validateToken(client, terminalTypeEnum, userTypeEnum, userid, ticket_md5);
		} else if (client == ClientApplicationEnum.MERCHANT_APP) {
			return appLoginService.validateToken(client, terminalTypeEnum, userTypeEnum, userid, ticket_md5);
		} else if (client == ClientApplicationEnum.CUSTOM_WEB) {
			return frontLoginService.validateToken(client, terminalTypeEnum, userTypeEnum, userid, ticket_md5);
		} else if (client == ClientApplicationEnum.MERCHANT_WEB) {
			return frontLoginService.validateToken(client, terminalTypeEnum, userTypeEnum, userid, ticket_md5);
		} else {
			throw new UnLoginAccoutException("验证失败");
		}
	}
}
