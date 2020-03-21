package com.hardj.metrics.storage;

import com.hardj.metrics.api.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * 存储层实现 redis
 */
public class RedisMetricsStorage implements MetricsStorage {

  //...省略属性和构造函数等...
  @Override
  public void saveRequestInfo(RequestInfo requestInfo) {
    //...
  }

  @Override
  public List<RequestInfo> getRequestInfos(String apiName, long startTimestamp, long endTimestamp) {
    //...
    return null;
  }

  @Override
  public Map<String, List<RequestInfo>> getRequestInfos(long startTimestamp, long endTimestamp) {
    //...
    return null;
  }
}