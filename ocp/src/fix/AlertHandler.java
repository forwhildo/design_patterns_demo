package fix;

import domain.AlertRule;
import domain.ApiStateInfo;
import domain.Notification;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 16:12
 **/
public abstract class AlertHandler {

    protected AlertRule alertRule;
    protected Notification notification;

    public AlertHandler(AlertRule alertRule,Notification notification){
        this.alertRule = alertRule;
        this.notification = notification;
    }

    public abstract void check(ApiStateInfo apiStateInfo);
}