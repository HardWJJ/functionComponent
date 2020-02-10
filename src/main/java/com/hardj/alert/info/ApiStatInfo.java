package com.hardj.alert.info;

public class ApiStatInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;

    public String getApi() {
        return api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }
}