package org.app.server.cache;

import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;
/**
 * 非集群redis环境缓存
 * @author longsq
 *
 */
public class RedisUtils {
	private static Logger logger = Logger.getLogger(RedisUtils.class);

	/**
	 * 设置缓存值
	 * @param key
	 * @param value
	 * @param seconds
	 */
	public static void setCache(String key, String value, int seconds) {
		Jedis jedis = null;
		try {
			jedis = RedisPoolManager.createInstance();
		    jedis.setex(key, seconds, value);
		} catch (JedisConnectionException e) {
			RedisPoolManager.returnBrokenResource(jedis);
			logger.error("RedisUtils.setCache exception :", e);
		} catch (Exception e) {
			RedisPoolManager.returnBrokenResource(jedis);
			logger.error("RedisUtils.setCache exception :", e);
		} finally {
			RedisPoolManager.returnResource(jedis);
		}
	}
	/**
	 * 查询缓存值
	 * @param key
	 */
	public static String getCacheByKey(String key) {
		Jedis jedis = null;
		String value = null;
		try {
			jedis = RedisPoolManager.createInstance();
			value = jedis.get(key);
		} catch (JedisConnectionException e) {
			RedisPoolManager.returnBrokenResource(jedis);
			logger.error("RedisUtils.getCacheByKey exception :", e);
		} catch (Exception e) {
			RedisPoolManager.returnBrokenResource(jedis);
			logger.error("RedisUtils.getCacheByKey exception :", e);
		} finally {
			RedisPoolManager.returnResource(jedis);
		}
		return value;
	}
	
	/**
	 * 删除缓存值
	 * @param key
	 */
	public static void delCache(String key) {
		Jedis jedis = null;
		try {
			jedis = RedisPoolManager.createInstance();
			jedis.del(key);
		} catch (JedisConnectionException e) {
			RedisPoolManager.returnBrokenResource(jedis);
			logger.error("RedisUtils.delCache exception :", e);
		} catch (Exception e) {
			RedisPoolManager.returnBrokenResource(jedis);
			logger.error("RedisUtils.delCache exception :", e);
		} finally {
			RedisPoolManager.returnResource(jedis);
		}
	}
}
