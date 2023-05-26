package one;

/**
 * @author: wxm
 * @description: TODO
 * @date: 2023/5/23 9:58
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public final void handle(){
        boolean handled = doHandle();
        if(successor!=null && !handled){
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}