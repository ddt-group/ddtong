package com.ddtong.service.passport;

import com.ddtong.core.enums.ClientApplicationEnum;
import com.ddtong.core.enums.TerminalTypeEnum;
import com.ddtong.core.enums.UserTypeEnum;
import com.ddtong.core.exception.ServiceException;
import com.ddtong.core.exception.UnLoginAccoutException;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.core.vo.LoginUserVO;

public interface LoginBusiService {

	public ApiResponseResult loginAcc(ClientApplicationEnum client, TerminalTypeEnum terminalTypeEnum,
			UserTypeEnum userTypeEnum, String account, String pwd) throws ServiceException;

	public LoginUserVO validateToken() throws UnLoginAccoutException;
}
