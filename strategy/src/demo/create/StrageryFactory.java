package demo.create;

import demo.define.Strategy;
import demo.define.StrategyA;
import demo.define.StrategyB;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 通过此类也可去除大量的if else
 * @author: wxm
 * @create: 2023-05-23 22:59
 **/
public class StrageryFactory {

    private static final Map<String, Strategy> strageries = new HashMap<>();

    static {
        strageries.put("A",new StrategyA());
        strageries.put("B",new StrategyB());
    }

    public static Strategy getStragery(String type){
        return strageries.get(type);
    }

}