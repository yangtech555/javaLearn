package com.yhb.designPattern.builder.微信模板消息;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public class 微信模板消息建造指挥者 {


    public void 建造吧(抽象建造者 builder){
        builder.buildTitle();
        builder.buildKey1();
        builder.buildKey2();
    }
}
