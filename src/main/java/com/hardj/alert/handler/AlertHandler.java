package com.hardj.alert.handler;

import com.hardj.alert.info.ApiStatInfo;
import com.hardj.alert.rule.AlertRule;
import com.hardj.alert.info.Notification;

public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}