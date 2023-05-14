package domain;


/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 15:49
 **/
public class AlertRule {

    private String api;
    private Long maxTps;
    private Long maxErrorCount;
    private Long timeoutCount;

    public AlertRule(String api){
        this.api = api;
    }



    public AlertRule getMatchedRule(String api) {
        //找到对应的api对应的 AlertRule
        return new AlertRule(api);
    }

    public long getMaxTps() {
        return this.maxTps;
    }

    public long getMaxErrorCount() {
        return this.maxErrorCount;
    }

    public long getMaxTimeoutTps() {
        return this.timeoutCount;
    }
}