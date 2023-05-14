package ioc.fix;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 20:35
 **/
public abstract class TestCase {

    public abstract boolean doTest();
    public void run(){
        if(doTest()){
            System.out.println("Test succeed");
        }else{
            System.out.println("Test failed");
        }
    }
}