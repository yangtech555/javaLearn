package com.yhb.designPattern.bridge;

import java.util.Calendar;

/**
 * Created by yanghongbo on 2018/8/20.
 */
public class TimeLimit extends ImpLimit {

    @Override
    public boolean limit(Object param) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        boolean result =  9 > hour || hour > 22;
        System.out.println(String.format("当前是%d点钟，%s。",hour,result?"禁止发送":"允许发送"));
        return  result;
    }
}
