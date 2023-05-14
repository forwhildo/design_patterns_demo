package com.one.enter.impl;


import com.one.dao.CredentialStorage;
import com.one.dao.impl.MysqlCredentialStorageImpl;
import com.one.enter.ApiAuthenticator;
import com.one.util.ApiRequest;
import com.one.util.AuthToken;

/**
 * @author 州牧
 * @description
 * @since 2023-05-14 11:04
 */
public class DefaultApiAuthenticatorImpl implements ApiAuthenticator {


    private CredentialStorage credentialStorage;

    public DefaultApiAuthenticatorImpl(){
        credentialStorage = new MysqlCredentialStorageImpl();
    }

    public DefaultApiAuthenticatorImpl(CredentialStorage credentialStorage){
        this.credentialStorage = credentialStorage;
    }


    @Override
    public void auth(String fullUrl) {
        ApiRequest apiRequest = ApiRequest.createFromFullUrl(fullUrl);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        long timestamp = apiRequest.getTimestamp();
        String baseUrl = apiRequest.getBaseUrl();

        String token = apiRequest.getToken();
        AuthToken clientAuthToken = new AuthToken(token,timestamp);

        if(clientAuthToken.isExpired()){
            throw new RuntimeException("Token is expired");
        }

        String password = credentialStorage.getPasswordByAppId(appId);
        AuthToken serverAuthToken = AuthToken.create(baseUrl,appId,password,timestamp);

        if(!serverAuthToken.isMatch(clientAuthToken)){
            throw new RuntimeException("Token verification failed");
        }
    }
}
