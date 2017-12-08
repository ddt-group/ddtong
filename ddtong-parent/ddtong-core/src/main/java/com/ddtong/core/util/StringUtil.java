package com.ddtong.core.util;


import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;





public class StringUtil {
	
	/**
	 * 获取后sublength位值
	 */
	public static String subLastStr(String sourceStr,int sublength){
		String newStr = null;
		if(StringUtils.isEmpty(sourceStr)){
			return null;
		}
		int sourceLength = sourceStr.length();
		if(sourceLength <= sublength){
			return sourceStr;
		}
		String tmpStr = sourceStr.substring(0, sourceLength-sublength);
		newStr = sourceStr.substring(tmpStr.length(),sourceLength);
		
		return newStr;
	}
	
	/**
	 * 将时间字符串截取为yyyy-MM-dd HH:mm:ss
	 * @param times
	 * @return
	 */
	public static String getTimeStr(String times){
		if(StringUtils.isEmpty(times)){
			return null;
		}
		String year = times.substring(0,4);
		String month = times.substring(4,6);
		String day = times.substring(6,8);
		String hour = times.substring(8,10);
		String minu = times.substring(10,12);
		String s = times.substring(12,14);
		return year + "-" + month+ "-" + day + " " +hour+":"+minu+":"+s;
	}
	
	/**
	 * 获取某个区间类的随机值
	 * randomStr "XX|XX" 最小值和最大值中间的随机数 竖线分割
	 * @param random
	 */
	public static int getRandomValue(String randomStr) {
		
		String ranStr[] = randomStr.split("\\|");
		int minVal = Integer.parseInt(ranStr[0]);
		int maxVal = Integer.parseInt(ranStr[1]);
		Random random=new Random();
		int top = random.nextInt(maxVal)%(maxVal-minVal+1) + minVal;
		return top;
	}
	
	/**
	 * 获取N位随机数
	 * @param random
	 * @return
	 */
	public static long getXRandom(int n){
		if(n<1){  
			n = 1;    
	    }  
	    return (long)(Math.random()*9*Math.pow(10,n-1)) + (long)Math.pow(10,n-1);  
	}
	
	/**
	 * 
	* @Title: isAllBlank 
	* @Description: 验证所有值是否都为空
	* @param strs
	* @return     false 有值不为空 true 都为空
	* @throws 
	* @author xc_qin
	* @date 2017年5月10日 下午9:23:03
	 */
	public static boolean isAllBlank(String...strs){
		if(null != strs){
			for (int i = 0; i < strs.length; i++) {
				if(StringUtils.isNotBlank(strs[i])){
					return false;
				}else{
					continue;
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	* @Title: isAllNotBlank 
	* @Description: 验证所有值是否都为空
	* @param strs
	* @return     false 有值为空 true 都不为空
	* @throws 
	* @author xc_qin
	* @date 2017年5月10日 下午9:23:03
	 */
	public static boolean isAllNotBlank(String...strs){
		if(null != strs){
			for (int i = 0; i < strs.length; i++) {
				if(StringUtils.isBlank(strs[i])){
					return false;
				}else{
					continue;
				}
			}
		}
		return true;
	}
	
}
