package com.hardj.authentication.storage;

/**
 * @author wjiajun
 */
public interface CredentialStorage {

    /**
     * 通过appId从数据库中获取密码
     * @param appId
     * @return
     */
    String getPasswordByAppId(String appId);
}
