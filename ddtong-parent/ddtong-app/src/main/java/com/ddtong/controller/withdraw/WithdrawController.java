package com.ddtong.controller.withdraw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddtong.core.common.DdtongConstant;
import com.ddtong.core.entity.integralLog.TIntegralLog;
import com.ddtong.core.entity.userBank.TUserBank;
import com.ddtong.core.entity.withdraw.TWithdraw;
import com.ddtong.core.util.MapUtil;
import com.ddtong.core.vo.ApiResponseResult;
import com.ddtong.service.passport.LoginBusiService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(DdtongConstant.APP_API_PATH + "/withdraw/")
public class WithdrawController {
	
	@Autowired
	private LoginBusiService loginBusiService;

	/**
	 * 
	* @Title: initWithdraw 
	* @Description: 初始化提现信息
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 上午9:54:19
	 */
	@RequestMapping("initWithdraw")
	@ResponseBody
	public ApiResponseResult initWithdraw(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 校验登录信息
		//loginBusiService.validateToken();
		// 总分宝
		resultMap.put("integralNum", "100000");
		// 支持的提现类型
		List<String> wdTypeList = new ArrayList<String>();
		wdTypeList.add("红积分");
		resultMap.put("withdrawType", wdTypeList);
		// 可用积分
		resultMap.put("avaIntegral", "900000");
		// 银行卡
		List<TUserBank> userBankList = new ArrayList<TUserBank>();
		TUserBank userBank = new TUserBank(1L, 123456L, 1L, "测试银行", "前端支行", "123456", "测试银行塑料卡", "13888888888", null, null, null, null, "1", "0");
		userBankList.add(userBank);
		userBank = new TUserBank(2L, 654321L, 1L, "测试银行1", "前端支行1", "654321", "测试银行塑料卡1", "13777777777", null, null, null, null, "1", "0");
		userBankList.add(userBank);
		resultMap.put("userBank", userBankList);
		// 提现手续费
		resultMap.put("wdFeeAmt", "5");
		return ApiResponseResult.success().status("0").data(resultMap);
	}
	
	/**
	 * 
	* @Title: doWithdraw 
	* @Description: 提现
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 上午9:54:35
	 */
	@RequestMapping("doWithdraw")
	@ResponseBody
	public ApiResponseResult doWithdraw(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		// 校验登录信息
		//loginBusiService.validateToken();
		// 0.校验参数 1.校验银行卡信息 2.校验支付密码 3.校验提现金额最大值,最小值 4.校验金额倍数 5.校验账户提现权限 6.记录提现信息 
		return ApiResponseResult.success("提现成功").status("0");
	}
	
	/**
	 * 
	* @Title: findWithdraw 
	* @Description: 查询提现记录
	* @param request
	* @param response
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月9日 下午12:06:25
	 */
	@RequestMapping("findWithdraw")
	@ResponseBody
	public ApiResponseResult findWithdraw(HttpServletRequest request, HttpServletResponse response){
		TreeMap<String, String> map = MapUtil.formatRequest(request);
		System.out.println(map.toString());
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 校验登录信息
		//loginBusiService.validateToken();
		// 查询提现记录信息
		PageInfo<TIntegralLog> page = new PageInfo<TIntegralLog>();
		page.setPageNum(1);
		page.setPageSize(20);
		page.setSize(20);
		page.setTotal(100);
		page.setPages(5);
		resultMap.put("page", page);
		List<TWithdraw> withdrawList = new ArrayList<TWithdraw>();
		TWithdraw wd = new TWithdraw(1L, 1L, 1L, "123456", "1", new BigDecimal(1000.00), new BigDecimal(5.00), new BigDecimal(995.00), 123456L, "前端", "测试银行", "0", "0", new Date(), 1L, new Date(), "1", new Date());
		withdrawList.add(wd);
		wd = new TWithdraw(2L, 2L, 2L, "223456", "1", new BigDecimal(1000.00), new BigDecimal(5.00), new BigDecimal(995.00), 223456L, "前端", "测试银行", "0", "0", new Date(), 1L, new Date(), "1", new Date());
		withdrawList.add(wd);
		withdrawList.add(wd);
		resultMap.put("list", withdrawList);
		return ApiResponseResult.success("成功").status("0").data(resultMap);
	}
}
