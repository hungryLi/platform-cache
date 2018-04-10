package org.app.server.cache;

public class WebsiteRedisKeyConstant {
	
	/**
	 * 首页验码码过期时间 
	 */
	public final static int WEBSITE_VALIDATECODE_EXPIRE_TIME = 3600;
	
	/**
	 * 首页模板基础信息  Key
	 */
	public final static String WEBSITE_BASE_INFO_KEY = "website_base_info_key_";
	
	/**
	 * 首页模板基础信息 过期时间 
	 */
	public final static int WEBSITE_BASE_INFO_TIME = 60;
	
	/**
	 * 获取全部的 银行信息-货币信息-国家信息
	 */
	public final static String WEBSITE_REGISTER_BASE_INFO = "website_register_base_info";
	
	/**
	 * 获取全部的 银行信息-货币信息-国家信息过期时间
	 */
	public final static int WEBSITE_REGISTER_BASE_TIME = 30;
	
	/**
	 * 获取导航数据缓存key
	 */
	public final static String WEBSITE_NAV_LIST_INFO_KEY = "website_nav_list_info_key";
	
	/**
	 * 获取导航数据缓存过期时间
	 */
	public final static int WEBSITE_NAV_LIST_INFO_TIME = 60;

	/**
	 * 获取页脚数据缓存key
	 */
	public final static String WEBSITE_FOOTER_LIST_INFO_KEY = "website_footer_list_info_key";
	
	/**
	 * 获取广告资讯信息缓存key
	 */
	public final static String WEBSITE_MSG_LIST_INFO_KEY = "website_msg_list_info_key";
	
	/**
	 * 获取礼品分类缓存key
	 */
	public final static String WEBSITE_Gift_ITEM_KEY = "website_gitf_item_key";
	
	
	
	/**
	 * 代理商登录session key
	 */
	public final static String WEBSITE_AGENT_LOGIN_KEY = "website_agent_login_key_";
	
	/**
	 * 用户收藏游戏key+userId
	 */
	public final static String WEBSITE_USER_GAME_COLLECT_KEY = "website_user_game_collect_key_";
	/**
	 * 代理商登录session 过期时间
	 */
	public final static int WEBSITE_AGENT_LOGIN_TIME = 1700;
	
	public final static int ONE = 1;
	public final static int TWO = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	
	/**
	 * 线下代理商添加会员的登录站点  Key
	 */
	public final static String OFFLINE_AGENT_ACCESS_DOMAIN_NAME_KEY = "offline_agent_access_domain_name_key";
	/**
	 * 线下代理商添加会员的登录站点  Key 过期时间 
	 */
	public final static int OFFLINE_AGENT_ACCESS_DOMAIN_NAME_TIME = 3600;
	/**
	 * 平台后台登录站点  Key
	 */
	public final static String PLATFROM_MANAGER_SYSTEM_ACCESS_DOMAIN_NAME_KEY = "platform_backstage_domain";
	
	/**
	 * LiveChat脚本信息 Key
	 */
	public final static String WEBSITE_LIVE_CHAT_INFO_KEY = "website_live_chat_info_key_";
	/**
	 * 平台后台登录站点  Key 过期时间 
	 */
	public final static int PLATFROM_MANAGER_SYSTEM_ACCESS_DOMAIN_NAME_KEY_TIME = 60*30;
	
	
}
