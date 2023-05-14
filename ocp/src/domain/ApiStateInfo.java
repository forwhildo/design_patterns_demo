package domain;

/**
 * @description:
 * @author: wxm
 * @create: 2023-05-14 16:15
 **/
public class ApiStateInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
    private long timeoutCount;

    public String getApi() {
        return api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }

    public long getTimeoutCount(){
        return  timeoutCount;
    }



}