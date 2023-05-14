package com.one.dao.impl;


import com.one.dao.CredentialStorage;

/**
 * @author 州牧
 * @description 根据appid查找对应的密码
 * @since 2023-05-14 10:59
 */
public class MysqlCredentialStorageImpl implements CredentialStorage {
    @Override
    public String getPasswordByAppId(String appId) {
        return "appId->password";
    }
}
