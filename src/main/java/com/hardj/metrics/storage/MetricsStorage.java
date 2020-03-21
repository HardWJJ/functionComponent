package com.hardj.metrics.storage;

import com.hardj.metrics.api.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * 接口数据存储
 */
public interface MetricsStorage {

  /**
   * 存储请求信息
   * @param requestInfo
   */
  void saveRequestInfo(RequestInfo requestInfo);

  /**
   * 请求信息获取
   */
  List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

  /**
   * 请求信息获取
   */
  Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}

