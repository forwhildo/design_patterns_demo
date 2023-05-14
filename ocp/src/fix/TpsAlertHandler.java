package fix;

import domain.AlertRule;
import domain.ApiStateInfo;
import domain.Notification;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 16:19
 **/
public class TpsAlertHandler extends AlertHandler{

    public TpsAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {
        long tps = apiStateInfo.getRequestCount() / apiStateInfo.getDurationOfSeconds();
        if (tps > alertRule.getMatchedRule(apiStateInfo.getApi()).getMaxTps()){
            notification.notify("level","desc");
        }
    }
}