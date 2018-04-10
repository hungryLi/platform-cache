package org.app.server.cache;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ShardedJedisUtils s = new ShardedJedisUtils();
    	s.set("test","test",1800);
    	System.out.println(s.getValueByeKey("test"));
    	
//        s.set(RedisKeyConstant.API_SECRETACCESSKEYID_ + "WEBSITE", "WEBSITE",1000000); 
       // s.addSet(RedisKeyConstant.API_SECRETACCESSKEYID_+"111111", "111111");
        /*Set<String> set = new HashSet<String>();
        
        s.addSet("set", "2");
        
        Set<String> list2 = s.getSet("set");
        for (String string : list2) {
			System.out.println(string);
		}*/
        
//        s.set(RedisKeyConstant.API_SECRETACCESSKEYID_+"111111", "000000");
//        System.out.println(s.getValueByeKey("afdafasfasdaafsadf"));
    }
}
