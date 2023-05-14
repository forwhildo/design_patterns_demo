package fix;

import domain.AlertRule;
import domain.ApiStateInfo;
import domain.Notification;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 16:24
 **/
public class TimeoutTpsAlertHandler extends AlertHandler{

    public TimeoutTpsAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {
        long timeoutTps = apiStateInfo.getTimeoutCount() / apiStateInfo.getDurationOfSeconds();
        if(timeoutTps > alertRule.getMatchedRule(apiStateInfo.getApi()).getMaxTimeoutTps()){
            notification.notify("level","desc");
        }
    }
}