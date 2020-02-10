package com.hardj.authentication.auth;

import com.hardj.authentication.storage.CredentialStorage;
import com.hardj.authentication.storage.MysqlCredentialStorage;

/**
 * 默认权限校验实现
 */
public class DefaultApiAuthenticatorImpl implements ApiAuthenticator {

    private CredentialStorage credentialStorage;

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.buildFromUrl(url);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String token = apiRequest.getToken();
        long timestamp = apiRequest.getTimestamp();
        String originalUrl = apiRequest.getOriginalUrl();

        AuthToken clientAuthToken = new AuthToken(token, timestamp);
        if (clientAuthToken.isExpired()) {
            throw new RuntimeException("Token is expired.");
        }

        String password = credentialStorage.getPasswordByAppId(appId);
        AuthToken serverAuthToken = AuthToken.generate(originalUrl, appId, password, timestamp);
        if (serverAuthToken == null || !serverAuthToken.match(clientAuthToken)) {
            throw new RuntimeException("Token verfication failed.");
        }
    }

    public DefaultApiAuthenticatorImpl() {
        this.credentialStorage = new MysqlCredentialStorage();
    }

    public DefaultApiAuthenticatorImpl(CredentialStorage credentialStorage) {
        this.credentialStorage = credentialStorage;
    }
}