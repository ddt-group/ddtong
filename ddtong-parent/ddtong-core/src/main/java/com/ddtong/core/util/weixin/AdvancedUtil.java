package com.ddtong.core.util.weixin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ddtong.core.util.httpclient.HttpContentTypes;
import com.ddtong.core.util.httpclient.HttpsClientBaseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 高级接口工具类
 * 
 * @author Administrator
 * 
 */
public class AdvancedUtil {
	private static Logger log = LoggerFactory.getLogger(AdvancedUtil.class);

	/**
	 * 获取网页授权凭证
	 * 
	 * @param appId
	 *            公众账号的唯一标识
	 * @param appSecret
	 *            公众账号的密钥
	 * @param code
	 * @return WeixinAouth2Token
	 */
	public static WeixinOauth2Token getOauth2AccessToken(String appId,
			String appSecret, String code) {
		WeixinOauth2Token wat = null;
		// 拼接请求地址
		String requestUrl = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
		requestUrl = requestUrl.replace("APPID", appId);
		requestUrl = requestUrl.replace("SECRET", appSecret);
		requestUrl = requestUrl.replace("CODE", code);
		try {
			// 获取网页授权凭证
			String responseContent = HttpsClientBaseUtil.get(requestUrl, null);
			JSONObject jsonObject = JSONObject.fromObject(responseContent);

			if (null != jsonObject) {
				try {
					wat = new WeixinOauth2Token();
					wat.setAccessToken(jsonObject.getString("access_token"));
					wat.setExpiresIn(jsonObject.getInt("expires_in"));
					wat.setRefreshToken(jsonObject.getString("refresh_token"));
					wat.setOpenId(jsonObject.getString("openid"));
					wat.setScope(jsonObject.getString("scope"));
				} catch (Exception e) {
					wat = null;
					int errorCode = jsonObject.getInt("errcode");
					String errorMsg = jsonObject.getString("errmsg");
					log.error("获取网页授权凭证失败 errcode:{} errmsg:{}", errorCode, errorMsg);
				}
			}
		} catch (Exception e) {
			log.error("获取网页授权凭证异常", e);
		}
		return wat;
	}

	/**
	 * 刷新网页授权凭证
	 * 
	 * @param appId
	 *            公众账号的唯一标识
	 * @param refreshToken
	 * @return WeixinAouth2Token
	 */
	public static WeixinOauth2Token refreshOauth2AccessToken(String appId,
			String refreshToken) {
		WeixinOauth2Token wat = null;
		// 拼接请求地址
		String requestUrl = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=APPID&grant_type=refresh_token&refresh_token=REFRESH_TOKEN";
		requestUrl = requestUrl.replace("APPID", appId);
		requestUrl = requestUrl.replace("REFRESH_TOKEN", refreshToken);
		try {
			// 刷新网页授权凭证
			String responseContent = HttpsClientBaseUtil.get(requestUrl, null);
			JSONObject jsonObject = JSONObject.fromObject(responseContent);
			if (null != jsonObject) {
				try {
					wat = new WeixinOauth2Token();
					wat.setAccessToken(jsonObject.getString("access_token"));
					wat.setExpiresIn(jsonObject.getInt("expires_in"));
					wat.setRefreshToken(jsonObject.getString("refresh_token"));
					wat.setOpenId(jsonObject.getString("openid"));
					wat.setScope(jsonObject.getString("scope"));
				} catch (Exception e) {
					wat = null;
					int errorCode = jsonObject.getInt("errcode");
					String errorMsg = jsonObject.getString("errmsg");
					log.error("刷新网页授权凭证失败 errcode:{} errmsg:{}", errorCode, errorMsg);
				}
			}
		} catch (Exception e) {
			log.error("刷新网页授权凭证异常", e);
		}
		return wat;
	}

	/**
	 * 通过网页授权获取用户信息
	 * 
	 * @param accessToken
	 *            网页授权接口调用凭证
	 * @param openId
	 *            用户标识
	 * @return SNSUserInfo
	 */
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static SNSUserInfo getSNSUserInfo(String accessToken, String openId) {
		SNSUserInfo snsUserInfo = null;
		// 拼接请求地址
		String requestUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID";
		requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken).replace(
				"OPENID", openId);
		
		try {
			// 通过网页授权获取用户信息
			String responseContent = HttpsClientBaseUtil.get(requestUrl, null);
			JSONObject jsonObject = JSONObject.fromObject(responseContent);

			if (null != jsonObject) {
				try {
					snsUserInfo = new SNSUserInfo();
					// 用户的标识
					snsUserInfo.setOpenId(jsonObject.getString("openid"));
					// 昵称
					snsUserInfo.setNickname(jsonObject.getString("nickname"));
					// 性别（1是男性，2是女性，0是未知）
					snsUserInfo.setSex(jsonObject.getInt("sex"));
					// 用户所在国家
					snsUserInfo.setCountry(jsonObject.getString("country"));
					// 用户所在省份
					snsUserInfo.setProvince(jsonObject.getString("province"));
					// 用户所在城市
					snsUserInfo.setCity(jsonObject.getString("city"));
					// 用户头像
					snsUserInfo.setHeadImgUrl(jsonObject.getString("headimgurl"));
					// 用户特权信息
					snsUserInfo.setPrivilegeList(JSONArray.toList(jsonObject.getJSONArray("privilege"), List.class));
				} catch (Exception e) {
					snsUserInfo = null;
					int errorCode = jsonObject.getInt("errcode");
					String errorMsg = jsonObject.getString("errmsg");
					log.error("获取用户信息失败 errcode:{} errmsg:{}", errorCode, errorMsg);
				}
			}
		} catch (Exception e) {
			log.error("获取用户信息异常", e);
		}
		return snsUserInfo;
	}

	/**
	 * 获取用户信息
	 * 
	 * @param accessToken
	 *            接口访问凭证
	 * @param openId
	 *            用户标识
	 * @return WeixinUserInfo
	 */
	public static WeixinUserInfo getUserInfo(String accessToken, String openId) {
		WeixinUserInfo weixinUserInfo = null;
		// 拼接请求地址
		String requestUrl = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID";
		requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken).replace(
				"OPENID", openId);
		
		try {
			// 获取用户信息
			String responseContent = HttpsClientBaseUtil.get(requestUrl, null);
			JSONObject jsonObject = JSONObject.fromObject(responseContent);

			if (null != jsonObject) {
				try {
					weixinUserInfo = new WeixinUserInfo();
					// 用户的标识
					weixinUserInfo.setOpenId(jsonObject.getString("openid"));
					// 关注状态（1是关注，0是未关注），未关注时获取不到其余信息
					weixinUserInfo.setSubscribe(jsonObject.getInt("subscribe"));
					// 用户关注时间
					weixinUserInfo.setSubscribeTime(jsonObject.getString("subscribe_time"));
					// 昵称
					weixinUserInfo.setNickname(jsonObject.getString("nickname"));
					// 用户的性别（1是男性，2是女性，0是未知）
					weixinUserInfo.setSex(jsonObject.getInt("sex"));
					// 用户所在国家
					weixinUserInfo.setCountry(jsonObject.getString("country"));
					// 用户所在省份
					weixinUserInfo.setProvince(jsonObject.getString("province"));
					// 用户所在城市
					weixinUserInfo.setCity(jsonObject.getString("city"));
					// 用户的语言，简体中文为zh_CN
					weixinUserInfo.setLanguage(jsonObject.getString("language"));
					// 用户头像
					weixinUserInfo.setHeadImgUrl(jsonObject.getString("headimgurl"));
				} catch (Exception e) {
					if (0 == weixinUserInfo.getSubscribe()) {
						log.error("用户{}已取消关注", weixinUserInfo.getOpenId());
					} else {
						int errorCode = jsonObject.getInt("errcode");
						String errorMsg = jsonObject.getString("errmsg");
						log.error("获取用户信息失败 errcode:{} errmsg:{}", errorCode, errorMsg);
					}
				}
			}
		} catch (Exception e) {
			log.error("获取用户信息异常", e);
		}
		return weixinUserInfo;
	}
	/**
	 * 发送模板消息
	 * @param token
	 * @param msg
	 * @return
	 */
	public static boolean sendTemplateMessage(String token, String msg) {
		boolean result = false;
		String url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
		url = url.replace("ACCESS_TOKEN", token);
		log.info("发送模板消息：" + "url = " + url + "\n" + " msg = " + msg);

		try {
			String responseContent = HttpsClientBaseUtil.postBody(url, null, HttpContentTypes.text_xml, msg);
			JSONObject jsonObject = JSONObject.fromObject(responseContent);

			if (null != jsonObject) {
				int errorCode = jsonObject.getInt("errcode");
				String errorMsg = jsonObject.getString("errmsg");
				if (0 == errorCode) {
					result = true;
					log.info("模板消息发送成功 errcode:{} errmsg:{}", errorCode, errorMsg);
				} else {
					log.error("模板消息发送失败 errcode:{} errmsg:{}", errorCode, errorMsg);
				}
			}
		} catch (Exception e) {
			log.error("模板消息发送异常", e);
		}
		return result;
	}
	
	/**
	 * 发送客服消息  -(文本,图文)
	 * 
	 * @param accessToken
	 *            接口访问凭证
	 * @param jsonMsg
	 *            json格式的客服消息（包括touser、msgtype和消息内容）
	 * @return true | false
	 */
	public static boolean sendCustomMessage(String accessToken, String jsonMsg) {
		log.info("消息内容：{}", jsonMsg);
		boolean result = false;
		// 拼接请求地址
		String requestUrl = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
		requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken);
		try {
			// 发送客服消息
			String responseContent = HttpsClientBaseUtil.postBody(requestUrl, null, HttpContentTypes.text_xml,
					jsonMsg);
			JSONObject jsonObject = JSONObject.fromObject(responseContent);

			if (null != jsonObject) {
				int errorCode = jsonObject.getInt("errcode");
				String errorMsg = jsonObject.getString("errmsg");
				if (0 == errorCode) {
					result = true;
					log.info("客服消息发送成功 errcode:{} errmsg:{}", errorCode, errorMsg);
				} else {
					log.error("客服消息发送失败 errcode:{} errmsg:{}", errorCode, errorMsg);
				}
			}
		} catch (Exception e) {
			log.error("客服消息发送异常", e);
		}
		return result;
	}
	
	
	
	/**
	 * 发送客户文本消息
	 * 
	 * @param accessToken
	 * @param openid
	 * @param content
	 * @return
	 * @author lihangang
	 */
	public static boolean sendCustomTextMsg(String accessToken, String openid, String content) {

		String jsonmsg = "{\"touser\":\"%s\",\"msgtype\":\"text\",\"text\":{\"content\":\"%s\"}}";
		jsonmsg = String.format(jsonmsg, openid, content);

		return sendCustomMessage(accessToken, jsonmsg);
	}
	
	
	/**
	 * 公众号自定义菜单
	 * 
	 * @param accessToken
	 * @param inputJsonString
	 * @return
	 * @author lihangang
	 */
	public static boolean customMenuCreate(String accessToken, String inputJsonString) {
		boolean result = false;
		try {
			String requestUrl = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
			requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken);
			log.info("请求地址: {}", requestUrl);
			log.info("请求内容：{}", inputJsonString);

			// 发送客服消息
			String responseContent = HttpsClientBaseUtil.postBody(requestUrl, null, HttpContentTypes.text_xml,
					inputJsonString);
			JSONObject jsonObject = JSONObject.fromObject(responseContent);
			if (null != jsonObject) {
				int errorCode = jsonObject.getInt("errcode");
				String errorMsg = jsonObject.getString("errmsg");
				if (0 == errorCode) {
					result = true;
					log.info("客服消息发送成功 errcode:{} errmsg:{}", errorCode, errorMsg);
				} else {
					log.error("客服消息发送失败 errcode:{} errmsg:{}", errorCode, errorMsg);
				}
			}
		} catch (Exception e) {
			log.error("客服消息发送异常", e);
		}
		return result;
	}
	
	
	
}
