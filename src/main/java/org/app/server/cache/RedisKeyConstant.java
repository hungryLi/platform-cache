package org.app.server.cache;

/**
 * redis KEY 值定义
 * 后台运营管理的KEY，以CONSOLE开头
 * 前台用户侧的KEY，以API开头
 * 公共的值KEY，以COMM开头
 * 
 * @author longsq
 *
 */
public class RedisKeyConstant {

	/**
	 * 系统默认语言
	 */
	public final static String DEFAULT_LANGUAGE = "en_US";
	
	/**
	 * 后台运管理平台的用户token，前缀值
	 */
	public final static String CONSOLE_TOKEN_KEY = "console_token_";
	/**
	 * token 过期值 单位S
	 */
	public final static int CONSOLE_TOKEN_EXPIRE_TIME = 7200;
	
	/**
	 * 后台登录首页验码码过期时间 
	 */
	public final static int CONSOLE_LOGIN_VALIDATECODE_EXPIRE_TIME = 3600;
	
	
	/**
	 * 用户角色列表(shiro用)前缀
	 */
	public final static String CONSOLE_USER_ROLE_AUTH_KEY = "console_user_role_auth_key_";
	/**
	 * 用户角色列表(shiro用)过期时间
	 */
	public final static int CONSOLE_USER_ROLE_AUTH_EXPIRE_TIME = 3600;
	/**
	 * 用户权限菜单列表(shiro用)前缀
	 */
	public final static String CONSOLE_USER_PER_AUTH_KEY = "console_user_per_auth_key_";
	/**
	 * 用户权限菜单列表(shiro用)过期时间
	 */
	public final static int CONSOLE_USER_PER_AUTH_EXPIRE_TIME = 3600;
	
	/**
	 * 用户权限菜单列表(菜单树用) 前缀
	 */
	public final static String CONSOLE_USER_MENU_KEY = "console_user_menu_key_";
	/**
	 * 用户权限菜单列表(菜单树用)过期时间
	 */
	public final static int CONSOLE_USER_MENU_EXPIRE_TIME = 1800;
	
	/**
	 * 在线的运营商会员列表
	 */
	public final static String OPERATOR_ON_LINE_USER_KEY = "operator_on_line_user_key";
	/**
	 * 在线的代理商会员列表
	 */
	public final static String AGENT_ON_LINE_USER_KEY = "agent_on_line_user_key";
	/**
	 * 在线的运营商列表
	 */
	public final static String OPERATOR_ON_LINE_KEY = "operator_on_line_key";
	/**
	 * 在线的代理商列表
	 */
	public final static String AGENT_ON_LINE_KEY = "agent_on_line_key";
	/**
	 * 在线的供应商列表
	 */
	public final static String SUPPLIER_ON_LINE_KEY = "supplier_on_line_key";
	/**
	 * 在线的用户(会员)
	 */
	public final static String ON_LINE_USER_KEY = "on_line_user_key";
	
	/**
	 * 根据域名获取对应的代理商或运营商ID
	 */
	public static final String CONSOLE_DOMAIN_NAME_KEY = "console_domain_name_key_";
	public final static int CONSOLE_DOMAIN_NAME_TIME_OUT = 60;
	
	/**
	 * 根据域名获取对应的Logo信息
	 */
	public static final String CONSOLE_DOMAIN_LOGO_INFO_KEY = "console_domain_logo_info_key_";
	public final static int CONSOLE_DOMAIN_LOGO_INFO_TIME_OUT = 60;
	
	
	/**
	 *  API 访问的SecretAccessKeyID  对应的 SecretAccessKey
	 */
	public static final String API_SECRETACCESSKEYID_ = "api_secretaccesskeyid_";
	
	/**
	 *  API 访问的SecretAccessKeyID  对应的 Token
	 */
	public static final String API_SECRETACCESSKEYID_TOKEN_ = "api_secretaccesskeyid_token_";
	
	/**
	 * 后台的代理商或运营商对应的域名数据 value中存储的是一个map集合 包含域名信息
	 */
	public static final String DOMAIN_INFO_KEY = "console_domain_info_";
	
	/**
	 * admin管理operator agent 供应商的权限信息，auth表做缓存，此处存主键集合
	 */
	public static final String AUTH_INFO_LIST_KEY = "console_auth_key_list_info";
	
	/**
	 * admin管理operator agent 供应商的权限信息，auth表做缓存，此处存权限信息
	 */
	public static final String AUTH_INFO_HASH_KEY = "console_auth_value_hash_info";
	
	/**
	 * 平台游戏信息缓存
	 */
	public static final String PLATFORM_GAME_INFO_CACHE_KEY="t_platform_game_info";
	/**
	 * 平台推荐游戏信息缓存
	 */
	public static final String PLATFORM_GAME_INFO_CACHE_RECO_GAME_KEY="t_platform_game_info_reco_game";
	
	/**
	 * 平台合作伙伴信息
	 */
	public static final String PLATFROM_PARTNER_CACHE_KEY="t_cooperative_partner_info";
	/**
	 * 平台合作伙伴信息缓存时间
	 */
	public static final int PLATFROM_PARTNER_CACHE_TIME=3600*24;
	/**
	 * 平台游戏分类信息缓存
	 */
	public static final String PLATFROM_GAME_ITEM_CACHE_KEY="platform_game_item_cache_";
	/**
	 * 平台游戏分类信息缓存时间
	 */
	public static final int PLATFROM_GAME_ITEM_CACHE_KEY_TIME=3600*24;
	/**
	 * 平台模板数据信息缓存
	 */
	public static final String PLATFROM_SITE_TEMP_CACHE_KEY="platform_web_site_temp_cache_";
	/**
	 * 平台模板数据缓存时间
	 */
	public static final int PLATFROM_SITE_TEMP_TIME=120;
	
	
	/** t_user 表的缓存记录  */
	public static final String CONSOLE_TABLET_T_USER="console_tablet_t_user_";

	/** t_agent_info 表的缓存记录  */
	public static final String CONSOLE_TABLET_T_AGENT="console_tablet_t_agent_";
	
	/** t_operator_info 表的缓存记录  */
	public static final String CONSOLE_TABLET_T_OPERATOR="console_tablet_t_operator_";
	
	
	/** 表数据的统一失效时间 */
	public static final int CONSOLE_TABLE_TIME = 60*60;
	
	/**后台货币缓存key**/
	public static final String CONSOLE_BASE_CURRENCY_INFO = "console_base_currency_info";
	
	
	/**
	 * 域名加入nginx 配置记录
	 */
	public static String CONSOLE_DOMAIN_TO_NGINX_CONFIG = "console_domain_to_nginx_config";
	
	/**
	 * 缓存平台游戏列表
	 */
	public static String PLATFORM_ALL_GAME_LIST = "platform_all_game_list";
	/**
	 * 缓存平台游戏列表时间
	 */
	public static int PLATFORM_ALL_GAME_LIST_TIME = 60*2;
	
	public static final String CONSOLE_SUPPLIER_INFO_KEY = "console_supplier_info_key_";
	
	/**
	 * 游戏信息缓存
	 */
	public static final String CONSOLE_GAME_INFO_CACHE_KEY="console_game_info_cache_key_";
	
	public static final int CONSOLE_GAME_INFO_CACHE_TIME=60*30;
	/**
	 * 厂商信息缓存
	 */
	public static final String  SUPPLIER_INFO_CACHE_KEY="supplier_info_cache_key_";
	
	public static final int SUPPLIER_INFO_CACHE_TIME=60*30;
	
	/**
	 * 运营商提交支付信息缓存
	 */
	public static final String  SUBMIT_ORDER_PAY_INFO_CACHE_KEY="submit_order_pay_info_cache_key_";
	
	public static final int SUBMIT_ORDER_PAY_INFO_CACHE_TIME=60*60*24;
	
	/**
	 * 厂查报表缓存运营商的信息
	 */
	public static final String  SUPPLIER_REPORT_NEET_OPERATOR_INFO_CACHE_KEY="supplier_report_neet_operator_info_cache_key_";
	
	public static final int SUPPLIER_REPORT_NEET_OPERATOR_INFO_CACHE_TIME=60*60;
	
	/**
	 * 查询副账号余额
	 */
	public static final String  SYNCHRONIZATION_DEPUTY_BALANCE_KEY="synchronization_deputy_balance_key_";
	
	
	
}
