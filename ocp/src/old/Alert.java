package old;


import domain.AlertRule;
import domain.Notification;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 15:48
 **/
public class Alert {
    private AlertRule alertRule;
    private Notification notification;

    public Alert(AlertRule alertRule,Notification notification){
        this.alertRule = alertRule;
        this.notification = notification;
    }

    /**添加入口参数*/
    public void check(String api,long requestCount,long errorCount,long durationOfSeconds,long timeoutCount){
        long tps = requestCount / durationOfSeconds;

        if(tps > alertRule.getMatchedRule(api).getMaxTps()){
            notification.notify("NotificationLevel.URGENCY","....");
        }

        if (errorCount > alertRule.getMatchedRule(api).getMaxErrorCount()){
            notification.notify("NotificationLevel.SEVERE","....");
        }

        //添加逻辑
        long timeoutTps = timeoutCount / durationOfSeconds;
        if (timeoutTps > alertRule.getMatchedRule(api).getMaxTimeoutTps()){
            notification.notify("NotificationLevel.SEVERE","....");
        }
    }



}