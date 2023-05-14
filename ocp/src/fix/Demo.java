package fix;

import domain.ApiStateInfo;

/**
 * @description: 使用例子
 * @author: wxm
 * @create: 2023-05-14 16:32
 **/
public class Demo {
    public static void main(String[] args) {
        ApiStateInfo apiStateInfo = new ApiStateInfo();
        ApplicationText.getApplicationText().getAlert().check(apiStateInfo);
    }
}