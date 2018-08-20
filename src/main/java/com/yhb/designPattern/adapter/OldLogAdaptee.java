package com.yhb.designPattern.adapter;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public class OldLogAdaptee {
    public void WriteLog(String message,String ip){
        System.out.println(String.format("IP:%s,Message:%s",ip,message));
    }
}
