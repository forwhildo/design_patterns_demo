package one;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/23 10:05
 */
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }

}