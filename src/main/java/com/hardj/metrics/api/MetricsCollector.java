package com.hardj.metrics.api;

import com.hardj.metrics.storage.MetricsStorage;
import com.hardj.metrics.utils.StringUtils;

/**
 * 负责采集接口请求的原始数据
 */
public class MetricsCollector {

  // 基于接口而非实现编程
  private MetricsStorage metricsStorage;

  // 依赖注入
  public MetricsCollector(MetricsStorage metricsStorage) {
    this.metricsStorage = metricsStorage;
  }

  // 用一个函数代替了最小原型中的两个函数
  public void recordRequest(RequestInfo requestInfo) {
    if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
      return;
    }
    metricsStorage.saveRequestInfo(requestInfo);
  }
}

