package com.yhb.designPattern.bridge;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public class NormalMessage extends ImpMessage{

    @Override
    public String getMessage(Object param){
        return "xxx，...(普通信息22333444555)";
    }
}
