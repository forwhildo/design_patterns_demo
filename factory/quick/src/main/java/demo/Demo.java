package demo;

import demo.excute.ApplicationContext;
import demo.excute.ClassPathXmlApplicationContext;
import demo.myObject.RateLimiter;
import demo.myObject.RedisCounter;

public class Demo {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
    rateLimiter.test();
    RedisCounter redisCounter = rateLimiter.getRedisCounter();
    System.out.println(redisCounter);

  }
}