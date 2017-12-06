package com.ddtong.core.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestSendMsg {

	
	public static void main(String[] args) {
		String sendContent = "您正在进行oper操作，您的验证码是：code，您本次提现金额为:amt，请在time分钟内完成操作,切勿泄露。";
		TMsgTemplate msgTemplate = new TMsgTemplate(1L, "al001", 0L, "阿里发送注册短信", "oper,code,amt,time", "-,-,-,3", "您正在进行oper操作，您的验证码是：code，您本次提现金额为:amt，请在time分钟内完成操作,切勿泄露。", "1", "【店店通】", "1", "消费者注册模板", "0", 1L, "#{}");
		
		String[] msgTemParamVal = msgTemplate.getParamVal().split(",");
		String[] msgParam = msgTemplate.getTemplateParam().split(",");
		for (int i = 0; i < msgTemParamVal.length; i++) {
			if("-".equals(msgTemParamVal[i])){
				if("oper".equals(msgParam[i])){
					msgTemParamVal[i] = "[转赠]";
				}else if("code".equals(msgParam[i])){
					msgTemParamVal[i] = "123456";
				}else if("amt".equals(msgParam[i])){
					msgTemParamVal[i] = "12.22";
				}
			}
			System.out.println(msgParam[i] + " = " + msgTemParamVal[i]);
			sendContent = sendContent.replace(msgParam[i], msgTemParamVal[i]);
			System.out.println(sendContent);
		}
		
		
		
		System.out.println(msgTemplate);
		TSendMsg sendMsg = new TSendMsg();
		sendMsg.setId(1L);
		sendMsg.setSendMobile("18680667510");
		sendMsg.setSendDate(new Date());
		sendMsg.setSendContent(sendContent);
		sendMsg.setVerifyCodeValidity(3L);
		sendMsg.setSendType(1L);
		sendMsg.setSendStatus(1L);
		sendMsg.setSendChannel("1");
		sendMsg.setUserId(60005000L);
		sendMsg.setUserType(1L);
		System.out.println(sendMsg);
	}
}
