package com.one.enter;


import com.one.util.ApiRequest;

/**
 * @author 州牧
 * @description 鉴权入口
 * @since 2023-05-14 11:02
 */
public interface ApiAuthenticator {
    //拼接好的url请求鉴权
    void auth(String fullUrl);
    //构造ApiRequest鉴权
    void auth(ApiRequest apiRequest);
}
