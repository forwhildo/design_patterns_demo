package use;

import com.google.common.eventbus.Subscribe;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-20 22:26
 **/
public class Observer {

    @Subscribe
    public void consumer(String param){
        System.out.println("param:" + param);
    }

}