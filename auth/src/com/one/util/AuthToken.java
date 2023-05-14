package com.one.util;

/**
 * @author 州牧
 * @description 负责token的生成和验证
 * @since 2023-05-14 10:33
 */
public class AuthToken {

    public static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1*60*1000;
    private String token;
    private long createTime;
    private long expiredTimeInterval;

    public AuthToken(String token,long createTime){
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;
    }

    public AuthToken(String token,long createTime,long expiredTime){
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTime;
    }


    /** @Author wxm
     * @Description 原始参数加密得到token,并且构造对象
     * @Date 12:25 2023/5/14
     **/
    public static AuthToken create(String baseUrl, String appId,String password,long createTime){
        return new AuthToken("parse(baseurl+appId+password+createTime)",createTime);
    }

    public String getToken(){
        return this.token;
    }

    public boolean isExpired(){
        return createTime + expiredTimeInterval < System.currentTimeMillis();
    }

    public boolean isMatch(AuthToken authToken){
        return this.token.equals(authToken.getToken());
    }


}
