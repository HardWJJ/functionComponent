package com.hardwjj.authentication;

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

    public String getToken() {
        return token;
    }

    public long getCreateTime() {
        return createTime;
    }
}
