package ioc.fix;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 20:36
 **/
public class JunitApplication {

    private static final List<TestCase> testcases = new ArrayList<>();

    public static void register(TestCase testCase){
        testcases.add(testCase);
    }

    public static void doAllTest(){
        for (TestCase testcase : testcases) {
            testcase.run();
        }
    }


}
class Demo{
    public static void main(String[] args) {
        TestCase testCase = new TestCaseUnitOne();
        JunitApplication.register(testCase);
        JunitApplication.doAllTest();
    }
}

