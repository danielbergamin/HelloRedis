import redis.clients.jedis.Jedis;

public class HelloRedis 
{
	public static void main (String args [])
	{
		Jedis jedis = new Jedis("redisdb");

		while (true) {	
			try {
				Thread.sleep(5000);
      			System.out.println("Linked to redis via hosts entry for redisdb: "+jedis.ping());
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
