package com.hardj.authentication.auth;

import java.util.HashMap;
import java.util.Map;

/**
 * api请求类
 *
 * @author wjiajun
 */
public class ApiRequest {

    /**
     * 原始url
     */
    private String baseUrl;

    private String token;

    private String appId;

    /**
     * 应用传来的过期时间
     */
    private long timestamp;

    public ApiRequest(String baseUrl, String token, String appId, long timestamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    public static ApiRequest buildFromUrl(String url) {
        Map<String, String> map = parseUrl(url);
        return new ApiRequest(map.get("baseUrl"), map.get("token"), map.get("appId"), Long.parseLong(map.get("timestamp")));
    }

    private static Map<String, String> parseUrl(String url) {
        Map<String, String> parsedMap = new HashMap<>();
        // 解析url
        // ...
        return parsedMap;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getOriginalUrl() {
        return baseUrl;
    }
}
