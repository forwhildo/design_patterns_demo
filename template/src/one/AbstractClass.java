package one;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/24 10:42
 */
public abstract class AbstractClass {

    public final void templateMethod1(){
        method1();
        method2();
    }
    public final void templateMethod2(){}

    public abstract void method1();
    public abstract void method2();
}