package com.yhb.designPattern.builder.微信模板消息;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public abstract class 抽象建造者 {
    public abstract void buildTitle();

    public abstract void buildKey1();

    public abstract void buildKey2();

    public abstract 微信模板消息Model getModel();
}
