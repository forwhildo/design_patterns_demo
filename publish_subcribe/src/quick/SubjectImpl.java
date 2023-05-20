package quick;

import java.util.List;
import java.util.concurrent.Executors;


public class SubjectImpl {

  private EventBus eventBus;
  private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 1;

  public SubjectImpl() {
    //eventBus = new EventBus(); // 同步阻塞模式
    eventBus = new AsyncEventBus(
        Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE)); // 异步非阻塞模式
  }

  public void setRegObservers(List<Object> observers) {
    for (Object observer : observers) {
      eventBus.register(observer);
    }
  }

  public void publish(Long id) {
    eventBus.post(id);
    System.out.println("任务已经发布");
  }
}
