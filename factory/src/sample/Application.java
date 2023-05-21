package sample;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-21 13:26
 **/
public class Application {
    public static void main(String[] args) {
        Demo one = SampleFactory.getInstance("one");
        Demo one1 = SampleSingletonFactory.getInstacne("one");
    }
}