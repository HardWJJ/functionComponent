package com.hardj.alert.handler;

import com.hardj.alert.info.ApiStatInfo;
import com.hardj.alert.rule.AlertRule;
import com.hardj.alert.info.Notification;
import com.hardj.alert.info.NotificationEmergencyLevel;

public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}