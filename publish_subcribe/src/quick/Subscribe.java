package quick;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 表示 @Subscribe 注解的方法，其中，target 表示观察者类，method 表示方法。
 * 它主要用在 ObserverRegistry 观察者注册表中
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Subscribe {}