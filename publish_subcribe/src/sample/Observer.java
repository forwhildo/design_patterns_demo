package sample;

/**
 * @program: publish_subscribe
 * @ClassName Observer
 * @description:
 * @author: wxm
 * @create: 2023-05-20 20:53
 **/
public interface Observer {
    void consumer(Message message);
}
