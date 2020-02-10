package com.hardj.authentication.auth;

public interface ApiAuthenticator {
    void auth(String url);

    void auth(ApiRequest apiRequest);
}