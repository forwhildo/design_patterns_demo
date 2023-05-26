package two;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/24 10:46
 */
public class Application {
    public static void main(String[] args) {

        Template template = new Template();
        template.process(new Callback() {
            @Override
            public void method() {
                //do
            }
        });
    }

}