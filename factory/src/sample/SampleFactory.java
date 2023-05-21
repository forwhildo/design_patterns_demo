package sample;

/**
 * @description: 简单工厂
 * @author: wxm
 * @create: 2023-05-21 13:16
 **/

public class SampleFactory{
    public static Demo getInstance(String kind){
        Demo demo = null;
        if(kind.equals("one")){
            demo = new DemoOneImpl();
        }else if (kind.equals("two")){
            demo = new DemoTwoImpl();
        }//...
        return demo;
    }
}