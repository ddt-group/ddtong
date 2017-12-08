package com.ddtong.core.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

public class MapUtil {

	/**
	* @Title: setResultMap 
	* @Description: 格式Map参数
	* @param msg
	* @return Map<String, String>
	* @author xc_qin
	* @date 2017年4月1日 下午1:56:47
	 */
	public static Map<String, String> strMap(String msg, String...strs){
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("msg", msg);
		try {
			if(null != strs){
				boolean isIgnore = false;
				for (int i = 0; i < strs.length; i++) {
					if(isIgnore){
						isIgnore = false;
						continue;
					}else{
						resultMap.put(strs[i], strs[i+1]);
						isIgnore = true;
					}
				}
			}
		} catch (Exception e) {
			
		}
		return resultMap;
	}
	
	public static Map<String, Object> objMap(String msg, String...strs){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("msg", msg);
		try {
			if(null != strs){
				boolean isIgnore = false;
				for (int i = 0; i < strs.length; i++) {
					if(isIgnore){
						isIgnore = false;
						continue;
					}else{
						resultMap.put(strs[i], strs[i+1]);
						isIgnore = true;
					}
				}
			}
		} catch (Exception e) {
		}
		return resultMap;
	}
	
	/**
	 * 
	* @Title: formatRequest 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param request
	* @return     
	* @throws 
	* @author xc_qin
	* @date 2017年12月7日 下午3:40:00
	 */
	public static TreeMap<String, String> formatRequest(HttpServletRequest request){
		TreeMap<String, String> map = new TreeMap<String, String>();
		Map<String, String[]> reqMap = request.getParameterMap();
		for (Object key : reqMap.keySet()) {
			String value = ((String[]) reqMap.get(key))[0];
			map.put(key.toString(), value);
		}
		return map;
	}
}
