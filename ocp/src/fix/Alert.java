package fix;

import domain.ApiStateInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 16:11
 **/
public class Alert {

    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler){
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStateInfo apiStateInfo){
        for (AlertHandler alertHandler : alertHandlers) {
            alertHandler.check(apiStateInfo);
        }
    }

}