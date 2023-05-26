package one.better;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/24 10:52
 */
public class Application {
    public static void main(String[] args) {

        Parent p = new Parent();

        p.templateMethod1(new MyInterfaceA() {
            @Override
            public void method1() {

            }

            @Override
            public void method2() {

            }
        });

    }

}