package com.ddtong.core.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
	
	/** 
     * 
     * @param params 
     * @return 
     */
	
	/**
	 * 
	* @Title: createLinkString 
	* @Description: 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
	* @param params	需要排序并参与字符拼接的参数组
	* @return  拼接后字符串,如:xx=xx&yy=yy&zz=zz   
	* @throws 
	* @author xc_qin
	* @date 2017年12月11日 上午11:28:28
	 */
    public static String createLinkString(Map<String, String> params) {

        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);

            if (i == keys.size() - 1) {//拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }

        return prestr;
    }
    
}
