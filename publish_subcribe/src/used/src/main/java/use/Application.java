package use;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-20 22:25
 **/
public class Application {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus("sync");
//        AsyncEventBus async = new AsyncEventBus("async");
        eventBus.register(new Observer());
        //可传递的是一个object对象
        eventBus.post("参数");


    }
}