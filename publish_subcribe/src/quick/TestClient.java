package quick;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuGuodong on 3/13/20.
 */
public class TestClient {

  public static void main(String[] args) {
    SubjectImpl subject = new SubjectImpl();

    List<Object> observers = new ArrayList<>();
    observers.add(new ObserverImpl());

    subject.setRegObservers(observers);

    subject.publish(2L);
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("1s后主线程执行");


  }
}