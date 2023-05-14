package com.one.dao;

/**
 * @author 州牧
 * @description 从数据库读取pwd
 * @since 2023-05-14 10:35
 */
public interface CredentialStorage {

    String getPasswordByAppId(String appId);
}
