package fix;

import domain.AlertRule;
import domain.Notification;

/**
 * @description: 提供环境
 * @author: wxm
 * @create: 2023-05-14 16:25
 **/
public class ApplicationText {

    private Notification notification;
    private Alert alert;

    public void initializeBeans(){
        notification = new Notification();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(new AlertRule("args1"),notification));
        alert.addAlertHandler(new ErrorAlertHandler(new AlertRule("args2"),notification));
        alert.addAlertHandler(new TimeoutTpsAlertHandler(new AlertRule("args3"),notification));
    }

    public Alert getAlert(){
        return this.alert;
    }

    //单例
    private static final ApplicationText applicationText = new ApplicationText();

    private ApplicationText(){
        applicationText.initializeBeans();
    }

    public static ApplicationText getApplicationText(){
        return applicationText;
    }
}