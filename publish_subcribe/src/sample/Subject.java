package sample;

/**
 * @program: publish_subscribe
 * @ClassName Subject
 * @description:
 * @author: wxm
 * @create: 2023-05-20 20:53
 **/
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
