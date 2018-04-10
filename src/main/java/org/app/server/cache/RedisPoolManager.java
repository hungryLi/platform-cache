package org.app.server.cache;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.ShardedJedisPool;
import redis.clients.jedis.exceptions.JedisException;


/**
 * redis服务类
 */
public class RedisPoolManager {
	private final static Logger logger      = Logger.getLogger(RedisPoolManager.class);
    private static JedisPool pool;
    static {
        ResourceBundle bundle = ResourceBundle.getBundle("conf.redis");
        if (bundle == null)
            throw new IllegalArgumentException("[redis.properties] is not found");

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMinIdle(Integer.valueOf(bundle.getString("redis.pool.minIdle")));
      //  config.setMaxActive(Integer.valueOf(bundle.getString("redis.pool.maxActive")));
        config.setMaxIdle(Integer.valueOf(bundle.getString("redis.pool.maxIdle")));
     //   config.setMaxWait(Long.valueOf(bundle.getString("redis.pool.maxWait")));
        config.setTestOnBorrow(Boolean.valueOf(bundle.getString("redis.pool.testOnBorrow")));
        config.setTestOnReturn(Boolean.valueOf(bundle.getString("redis.pool.testOnReturn")));
//        pool = new JedisPool(config, bundle.getString("redis.ip"), Integer.valueOf(bundle.getString("redis.port")), 2000, bundle.getString("redis.pass"));
        pool = new JedisPool(config, bundle.getString("redis.ip"), Integer.valueOf(bundle.getString("redis.port")), 2000);
    }

    /**
     * Get Jedis resource from the pool
     * @return
     */
    public static Jedis createInstance() {
        if (pool != null) {
            Jedis jedis = null;
            try {
                jedis = pool.getResource();
                return jedis; //模板方法
            } catch (JedisException e) {
                returnBrokenResource(jedis);
                return null;
            }
        } else
            return null;
    }

    /**
     * Return the resource to pool
     * @param jedis
     */
    public static void returnResource(Jedis jedis) {
        if (jedis != null)
            pool.returnResource(jedis);
    }

    /**
     * Return broken resource
     * */
    public static void returnBrokenResource(Jedis jedis)
    {
        if(jedis != null)
            pool.returnBrokenResource(jedis);
    }

}
