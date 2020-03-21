package com.hardj.metrics;

import com.hardj.metrics.api.MetricsCollector;
import com.hardj.metrics.api.RequestInfo;
import com.hardj.metrics.reporter.ConsoleReporter;
import com.hardj.metrics.reporter.EmailReporter;
import com.hardj.metrics.storage.MetricsStorage;
import com.hardj.metrics.storage.RedisMetricsStorage;

public class Demo {
  public static void main(String[] args) {

    // 入口1统计原始数据生成统计数据输出
    // 初始化统计存储
    MetricsStorage storage = new RedisMetricsStorage();

    // 选择控制台输出
    ConsoleReporter consoleReporter = new ConsoleReporter(storage);
    // 1. 根据给定的时间区间，从数据库中拉取数据；
    // 2. 根据原始数据，计算得到统计数据
    // 3. 将统计数据显示到终端（命令行或邮件）；
    consoleReporter.startRepeatedReport(60, 60);

    // 选择邮件输出
    EmailReporter emailReporter = new EmailReporter(storage);
    emailReporter.addToAddress(".....................");
    // 1. 根据给定的时间区间，从数据库中拉取数据；
    // 2. 根据原始数据，计算得到统计数据
    // 3. 将统计数据显示到终端（命令行或邮件）；
    emailReporter.startDailyReport();


    // 入口2 原始数据采集
    MetricsCollector collector = new MetricsCollector(storage);
    collector.recordRequest(new RequestInfo("register", 123, 10234));
    collector.recordRequest(new RequestInfo("register", 223, 11234));
    collector.recordRequest(new RequestInfo("register", 323, 12334));
    collector.recordRequest(new RequestInfo("login", 23, 12434));
    collector.recordRequest(new RequestInfo("login", 1223, 14234));

  }
}