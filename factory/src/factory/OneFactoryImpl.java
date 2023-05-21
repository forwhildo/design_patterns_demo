package factory;

import sample.Demo;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-21 13:40
 **/
public class OneFactoryImpl implements Factory{

    @Override
    public Demo createDemo() {
        //进行对象的构造构成，相比较简单工厂 不是简单的new
        return null;
    }
}