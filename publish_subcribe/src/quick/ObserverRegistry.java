package quick;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class ObserverRegistry {
    //Observer 注册表
    private ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();


    public void register(Object observer) {
      Map<Class<?>, Collection<ObserverAction>> observerActions = findAllObserverActions(observer);
      for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observerActions.entrySet()) {
        Class<?> eventType = entry.getKey();
        Collection<ObserverAction> eventActions = entry.getValue();

        CopyOnWriteArraySet<ObserverAction> registeredEventActions = registry.get(eventType);
        if (registeredEventActions == null) {
          registry.putIfAbsent(eventType, new CopyOnWriteArraySet<>());
          registeredEventActions = registry.get(eventType);
        }
        registeredEventActions.addAll(eventActions);
      }
    }

    //根据key获取
    public List<ObserverAction> getMatchedObserverActions(Object event) {
      List<ObserverAction> matchedObservers = new ArrayList<>();
      Class<?> postedEventType = event.getClass();
      for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registry.entrySet()) {
        Class<?> eventType = entry.getKey();
        Collection<ObserverAction> eventActions = entry.getValue();
        if (postedEventType.isAssignableFrom(eventType)) {
          matchedObservers.addAll(eventActions);
        }
      }
      return matchedObservers;
    }

    //Map key是参数类型，value是执行对象
    private Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer) {
      Map<Class<?>, Collection<ObserverAction>> observerActions = new HashMap<>();
      Class<?> clazz = observer.getClass();
      for (Method method : getAnnotatedMethods(clazz)) {
        Class<?>[] parameterTypes = method.getParameterTypes();

        Class<?> eventType = parameterTypes[0];
        if (!observerActions.containsKey(eventType)) {
          observerActions.put(eventType, new ArrayList<>());
        }
        observerActions.get(eventType).add(new ObserverAction(observer, method));
      }
      return observerActions;
    }
    //获取clazz对象注解方法
    private List<Method> getAnnotatedMethods(Class<?> clazz) {
      List<Method> annotatedMethods = new ArrayList<>();
      for (Method method : clazz.getDeclaredMethods()) {
        if (method.isAnnotationPresent(Subscribe.class)) {
          //限制使用一个参数，由于不想引入过多依赖，注释掉
//          Class<?>[] parameterTypes = method.getParameterTypes();

  //        Preconditions.checkArgument(parameterTypes.length == 1,
  //                "Method %s has @Subscribe annotation but has %s parameters."
  //                        + "Subscriber methods must have exactly 1 parameter.",
  //                method, parameterTypes.length);
          annotatedMethods.add(method);
        }
      }
      return annotatedMethods;
    }
}