package com.one.util;

/**
 * @author 州牧
 * @description 处理请求的url
 * @since 2023-05-14 10:34
 */
public class ApiRequest {
    private String baseUrl;
    private String token;
    private String appId;
    private long timestamp;

    public ApiRequest(String baseUrl,String token,String appId,long timestamp){
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }


    /** @Author wxm
     * @Description 解析fullUrl得到baseurl,appid,timestamp,token 并且构造
     * @Date 12:26 2023/5/14
     **/
    public static ApiRequest createFromFullUrl(String fullUrl){
        return new ApiRequest("baseUrl","token","appId",System.currentTimeMillis());
    }

    public String getBaseUrl(){
        return baseUrl;
    }

    public String getToken(){
        return token;
    }

    public String getAppId(){
        return appId;
    }

    public long getTimestamp(){
        return timestamp;
    }
}
