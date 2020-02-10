package com.hardj.alert.rule;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wjiajun
 */
public class AlertRule {

    private Map<String, AlertRuleInfo> ruleMap = new ConcurrentHashMap<>();

    public AlertRule() {
        // init
        ruleMap.put("api", null);
        // ...
    }

    public AlertRuleInfo getMatchedRule(String api) {
        return ruleMap.get(api);
    }
}
