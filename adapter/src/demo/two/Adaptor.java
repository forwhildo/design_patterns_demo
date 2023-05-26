package demo.two;

import demo.Adaptee;
import demo.Target;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/25 16:42
 */
public class Adaptor implements Target {

    private Adaptee adaptee;

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {
        adaptee.f3();
    }
}