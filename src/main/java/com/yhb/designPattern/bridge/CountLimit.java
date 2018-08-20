package com.yhb.designPattern.bridge;

import java.util.Random;

/**
 * Created by yanghongbo on 2018/8/20.
 */
public class CountLimit extends ImpLimit {
    @Override
    public boolean limit(Object param) {
        int currentCount = new Random().nextInt(20);
        boolean result = currentCount>10;
        System.out.println(String.format("已发送:%d条，%s。",currentCount,result?"禁止发送":"允许发送"));
        return result;
    }
}
