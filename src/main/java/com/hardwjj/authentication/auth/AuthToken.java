package com.hardwjj.authentication.auth;

import com.hardwjj.authentication.storage.MD5;

/**
 * @author wjiajun
 */
public class AuthToken {

    /**
     * 默认的最大超时时间
     */
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
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
        String newToken;
        try {
            newToken = md5(new StringBuilder().append(originalUrl).append(appId).append(password).append(timestamp).toString());
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return new AuthToken(newToken, timestamp);
    }

    private static String md5(String str) throws Exception {
        MD5 md5 = new MD5();
        return md5.digestByteToString(str.getBytes());
    }

    /**
     * 判断当前token是否已过期
     * @return
     */
    public boolean isExpired() {
        if(createTime + DEFAULT_EXPIRED_TIME_INTERVAL > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public String getToken() {
        return token;
    }

    /**
     * 判断生成的token和客户端token是否匹配
     * @param authToken
     * @return
     */
    public boolean match(AuthToken authToken) {
        if(token.equals(authToken.token)) {
            return true;
        }
        return false;
    }
}
