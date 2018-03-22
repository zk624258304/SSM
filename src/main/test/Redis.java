import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Redis {

    @Test
    public void datatest(){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        System.out.println(calendar.getTime());
    }
    @Test
    public void redisTest(){
        Jedis jedis=new Jedis("localhost");
        System.out.println("服务器正在运行");
        System.out.println("服务器正在运行"+jedis.ping());
    }
    @Test
    public void redisString(){
        Jedis jedis=new Jedis("localhost");
        jedis.set("whk","王槐堃");
        System.out.println("获取的字符串是"+jedis.get("whk"));
    }
    @Test
    public void redislist(){
        Jedis jedis=new Jedis("localhost");
        jedis.lpush("haha","1");
        jedis.lpush("haha","2");
        List<String> list=jedis.lrange("haha",0,1);
        for (String haha:list) {
            System.out.println(haha);
        }
    }
    @Test
    public void rediskeys(){
        Jedis jedis=new Jedis("localhost");
        Set<String> set=jedis.keys("*");
       Iterator<String> iterator=set.iterator();
       while (iterator.hasNext()){
           String key=iterator.next();
           System.out.println(key);
       }
        System.out.println(jedis.get("whk"));
    }
    @Test
    public void deleteredis(){
        Jedis jedis=new Jedis("localhost");
        jedis.del("whk");
        jedis.del("haha");
    }

}
