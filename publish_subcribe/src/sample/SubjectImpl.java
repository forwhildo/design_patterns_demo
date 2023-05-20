package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-20 20:55
 **/
public class SubjectImpl implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.consumer(message);
        }
    }
}