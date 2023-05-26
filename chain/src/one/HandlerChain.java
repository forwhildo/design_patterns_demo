package one;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/23 10:02
 */
public class HandlerChain {

    private Handler head,tail;

    public void addHandler(Handler handler){
        handler.setSuccessor(null);

        if(head == null){
            head = handler;
            tail = handler;
        }else {
            tail.setSuccessor(handler);
            tail = handler;
        }
    }

    public void handle(){
        if(head != null){
            head.handle();
        }
    }

}