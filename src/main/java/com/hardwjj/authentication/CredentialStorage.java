package com.hardwjj.authentication;

/**
 * @author wjiajun
 */
public interface CredentialStorage {
    String getPasswordByAppId(String appId);
}
