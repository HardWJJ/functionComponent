package com.hardwjj.authentication;

import java.util.Map;

/**
 * @author wjiajun
 */
public class AuthToken {

    // 默认的最大超时时间
    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1 * 60 * 1000;

    private String token;

    private long createTime;

    private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;


    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
    }

    public static AuthToken create(String baseUrl, long createTime, Map<String, String> params) {
        return null;
    }

    public AuthToken getToken() {
        return null;
    }

    public boolean isExpired() {
        return false;
    }

    public boolean match(AuthToken authToken) {
        return false;
    }

    public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
        return null;
    }
}
