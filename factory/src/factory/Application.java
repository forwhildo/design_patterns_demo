package factory;

import sample.Demo;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-21 13:43
 **/
public class Application {
    public static void main(String[] args) {
        Factory factory = FactoryMap.getFactory("one");
        Demo one = factory.createDemo();
    }
}