package org.app.server.cache;

public class ApiRedisKeyConstant {
	
	/**
	 * 登录token Key
	 */
	public final static String API_LOGIN_TOKEN_KEY = "api_login_token_key_";
	
	/**
	 * 已登录用户的userid对应的token
	 */
	public final static String API_LOGIN_USER_ID_TOKEN_KEY = "api_login_user_id_token_key_";
	
	/**
	 * 试玩账号登录记录
	 */
	public final static String API_LOGIN_TRY_PLAY_USER_ID_KEY = "api_login_try_play_user_id_key_";
	
	/**
	 * 登录token过期时间 
	 */
	public final static int API_LOGIN_TOKEN_TIME = 1800;
	
	
	/**
	 * 在线人数 Key 前缀
	 */
	public final static String API_ONLINE_INFO_KEY = "api_online_info_key";
	
	/**
	 *  在线人数 Key 前缀
	 */
	public final static String API_ONLINE_USER_KEY = "api_online_user_key_";
	
	/**
	 * Web签名Key
	 */
	public static final String API_SECRET_ACCESS_KEY_ID = "WEBSITE";
	
	/**
	 * 发送短信前的验证码凭证Key
	 */
	public final static String API_MESSAGE_BEFORE_KEY = "api_message_before_key_";
	
	/**
	 * 发送短信后的 短信验证码 凭证Key
	 */
	public final static String API_MESSAGE_AFTER_KEY = "api_message_after_key_";
	/**
	 * 凭证过期时间
	 */
	public final static int API_MESSAGE_TIME = 300;
	/**
	 * 用户点击游戏创建ticket缓存前缀
	 */
	public final static String TICKET_CACHE_KEY = "user_visit_game_ticket";
	/**
	 * 用户点击游戏创建ticket缓存时间
	 */
	public final static int TICKET_CACHE_KEY_TIME = 180;
	
	/**
	 * 重复提交的请求key前缀
	 */
	public final static String REPEAT_REQUEST_KEY = "repeat_request_key_";
	/**
	 * 重复提交的请求过期时间
	 */
	public final static int REPEAT_REQUEST_TIME = 5;
	
	/**
	 * 密码输入次数超过5次，即冻结该用户Key
	 */
	public final static String API_LOGIN_PASSWD_ERROR_KEY = "API_LOGIN_PASSWD_ERROR_KEY_";
	
	
	/**
	 * 转换器校验ticket后的缓存Key
	 */
	public final static String API_ADAPTER_TICKET_KEY = "API_ADAPTER_TICKET_KEY_";
	/**
	 * 转换器校验ticket后的缓存时间
	 */
	public final static int API_ADAPTER_TICKET_TIME = 1800;
	
	/**
	 * 转换器请求playgame接口时的访问token缓存Key
	 */
	public final static String API_ADAPTER_TO_PLAYGAME_KEY = "api_adapter_to_playgame_key_";
	/**
	 * 转换器请求playgame接口时的访问token过期时间
	 */
	public final static int API_ADAPTER_TO_PLAYGAME_TIME = 3600;
	
	/**
	 * 转换器对接所需要的认证数据Key
	 */
	public final static String API_SUPPLIER_AUTH_INFO_KEY = "api_supplier_auth_info_key_";
	/**
	 * 转换器对接所需要的认证数据Key
	 */
	public final static String API_SUPPLIER_AUTH_INFO_NAME = "api_supplier_auth_info_name_";
	/**
	 * 转换器对接所需要的认证数据Key过期时间
	 */
	public final static int API_SUPPLIER_AUTH_INFO_TIME = 86400;
	
	/**
	 * 站点首页充值记录
	 */
	public final static String QUERY_ACCOUNT_CHANGE_RECORD_RECHARGE_LIST = "query_account_change_record_recharge_list_";
	
	/**
	 * 站点首页提现记录
	 */
	public final static String QUERY_ACCOUNT_CHANGE_RECORD_WITHDRAW_LIST = "query_account_change_record_withdraw_list_";
	
	/**
	 * 站点首页其他信息四个模块
	 */
	public final static String DOMAIN_INFO_CONTENT= "domain_info_content_";
	
	
	/**
	 * cf-SPORT 下注记录抓取的截止时间
	 */
	public final static String API_ADAPTER_CF_SPORT_BET_TIME_KEY = "API_ADAPTER_CF_SPORT_BET_TIME_KEY";
	
	/**
	 * PG 下注记录抓取的截止时间
	 */
	public final static String API_ADAPTER_PG_BET_TIME_KEY = "API_ADAPTER_PG_BET_TIME_KEY";
	
	/**
	 * PT 下注记录抓取的截止时间
	 */
	public final static String API_ADAPTER_PT_BET_TIME_KEY = "API_ADAPTER_PT_BET_TIME_KEY";
	
	/**
	 * 首页优惠活动前20条缓存缓存
	 */
	public final static String API_ACTIVITY_INFO= "api_activity_info_";

	/**
	 * 平台管理在线用户信息
	 */
	public static final String API_ONLINE_INFO_ADMIN_KEY = "api_online_info_admin_key";

	/**
	 * 运营商app版本号
	 */
	public static final String API_APP_VERSION_KEY = "api_app_version_key_";
}
