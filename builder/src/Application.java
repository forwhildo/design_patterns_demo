/**
 * @description:
 * @author: wxm
 * @create: 2023-05-22 16:45
 **/
public class Application {
    public static void main(String[] args) {

        ResourceConfig config = new ResourceConfig.Builder()
                .setMaxIdle(1)
                .setMinIdle(2)
                .setName("null")
                .build();
    }
}