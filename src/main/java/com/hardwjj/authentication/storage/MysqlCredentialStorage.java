package com.hardwjj.authentication.storage;

/**
 * @author wjiajun
 */
public class MysqlCredentialStorage implements CredentialStorage {

    @Override
    public String getPasswordByAppId(String appId) {
        return "123456";
    }
}
