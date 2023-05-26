package one.better;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/24 10:48
 */
public class Parent {

    //如此便可以按需实现

    public void templateMethod1(MyInterfaceA a){
        a.method1();
        a.method2();
    }

    public void templateMethod2(MyInterfaceB b){
        b.method3();
        b.method4();
    }



}