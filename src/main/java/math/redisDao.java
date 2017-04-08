/*package math;
import org.springframework.data.redis.core.RedisTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class redisDao {   
    
	@Autowired
	@Qualifier("redisTemplate")
   private static RedisTemplate redisTemplate;
 
   
    
   	public static Object getValue( final String key ) {
    	return redisTemplate.opsForValue().get( key );
	}

	public static void setValue( final String key, final String value ) {
    	redisTemplate.opsForValue().set( key, value );
	}
}
*/