package com.hardj.alert.rule;

/**
 * @author wjiajun
 */
public class AlertRuleInfo {

    private long maxErrorCount;

    private long maxTps;

    public AlertRuleInfo(long maxErrorCount, long maxTps) {
        this.maxErrorCount = maxErrorCount;
        this.maxTps = maxTps;
    }

    public long getMaxErrorCount() {
        return maxErrorCount;
    }

    public long getMaxTps() {
        return maxTps;
    }
}
