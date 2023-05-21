package sample;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 工厂模式
 * @author: wxm
 * @create: 2023-05-21 13:21
 **/
public class SampleSingletonFactory{
    private static final Map<String,Demo> factories = new HashMap<>();
    static {
        factories.put("one",new DemoOneImpl());
        factories.put("two",new DemoTwoImpl());
    }

    public static Demo getInstacne(String kind){
        return factories.get(kind);
    }
}