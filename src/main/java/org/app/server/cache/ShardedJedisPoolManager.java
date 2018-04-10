package org.app.server.cache;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

public class ShardedJedisPoolManager {
	private static JedisShardInfo jedisShardInfo_slaver ;
	private static JedisShardInfo jedisShardInfo_master ;
	private static String SHARDINFO_SLAVER = "slaver";
	private static String SHARDINFO_MASTER = "master";
	
	private static ShardedJedisPool    shardedJedisPool;
	private static GenericObjectPoolConfig poolConfig;
	
//	private static JedisCluster jedisCluster;
	static {
        ResourceBundle bundle = ResourceBundle.getBundle("conf.redis");
        if (bundle == null)
            throw new IllegalArgumentException("[redis.properties] is not found");
        poolConfig = new GenericObjectPoolConfig() ;
        poolConfig.setMaxIdle(Integer.valueOf(bundle.getString("redis.pool.maxIdle")));
        poolConfig.setMinIdle(Integer.valueOf(bundle.getString("redis.pool.minIdle")));
        poolConfig.setTestOnBorrow(Boolean.valueOf(bundle.getString("redis.pool.testOnBorrow")));
        poolConfig.setTestOnReturn(Boolean.valueOf(bundle.getString("redis.pool.testOnReturn")));
        String pass = bundle.getString("redis.pass");
        jedisShardInfo_master = new JedisShardInfo(bundle.getString("redis.ip"), Integer.valueOf(bundle.getString("redis.port")), SHARDINFO_MASTER);
        /*if(null!=pass && pass.length()>0){
        	jedisShardInfo_master.setPassword(pass);
        }*/
        jedisShardInfo_slaver = new JedisShardInfo(bundle.getString("redis.ip"), Integer.valueOf(bundle.getString("redis.port")), SHARDINFO_SLAVER);
       /*if(null!=pass && pass.length()>0){
    	   jedisShardInfo_slaver.setPassword(pass);
       }*/
      //  HostAndPort hostAndPort = new HostAndPort(bundle.getString("redis.ip"), Integer.valueOf(bundle.getString("redis.port")));
     //   Set<HostAndPort> hostAndPortSet = new HashSet<HostAndPort>();
     //   hostAndPortSet.add(hostAndPort);
     //   jedisCluster = new JedisCluster(hostAndPortSet);
    }
	
	public static ShardedJedisPool getInstance(){
		if (shardedJedisPool==null) {
			List<JedisShardInfo> list = new ArrayList<JedisShardInfo>();
			list.add(jedisShardInfo_master);
			//list.add(jedisShardInfo_slaver);
			shardedJedisPool = new ShardedJedisPool(poolConfig,list);
		}
		return shardedJedisPool;
	}
	
//	public static JedisCluster getJedisClusterInstance(){
//		return jedisCluster;
//	}
	
	
	
	
}
