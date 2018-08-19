package com.yhb.adapter;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public class LogAdapter implements ILogTarget {
    public OldLogAdaptee oldLogAdaptee = new OldLogAdaptee();

    @Override
    public void write(String msg) {
        String ip = "127.0.0.1";
        msg = "Adapter:" + msg;
        oldLogAdaptee.WriteLog(msg, ip);
    }
}
