package com.yhb.designPattern.adapter;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public class AdapterMain {
    public static void main(String[] args){
        ILogTarget log = new LogAdapter();
        log.write("log message");
    }
}
