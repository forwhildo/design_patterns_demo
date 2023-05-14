package fix;

import domain.AlertRule;
import domain.ApiStateInfo;
import domain.Notification;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 16:23
 **/
public class ErrorAlertHandler extends AlertHandler{

    public ErrorAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {
        if (apiStateInfo.getErrorCount() >alertRule.getMatchedRule(apiStateInfo.getApi()).getMaxErrorCount()){
            notification.notify("level","desc");
        }
    }
}