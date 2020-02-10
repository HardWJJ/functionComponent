package com.hardj.alert.handler;

import com.hardj.alert.info.ApiStatInfo;
import com.hardj.alert.rule.AlertRule;
import com.hardj.alert.info.Notification;
import com.hardj.alert.info.NotificationEmergencyLevel;

public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}