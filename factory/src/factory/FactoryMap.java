package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-21 13:41
 **/
public class FactoryMap {

    private static final Map<String,Factory> map = new HashMap<>();

    static {
        map.put("one",new OneFactoryImpl());
    }

    public static Factory getFactory(String kindOfFactory){
        return map.get(kindOfFactory);
    }

}