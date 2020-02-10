package com.hardj.alert;

import com.hardj.alert.info.ApiStatInfo;

public class Client {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        // ...省略设置apiStatInfo数据值的代码
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}