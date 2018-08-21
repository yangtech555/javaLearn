package com.yhb.designPattern.builder.微信模板消息;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public class 具体建造者_投资成功消息 extends 抽象建造者 {
    private 微信模板消息Model model = new 微信模板消息Model();

    @Override
    public void buildTitle() {
        model.setTitle("投资成功");
    }


    @Override
    public void buildKey1() {
        model.setKey1("亲，你已成功投资了[周年加息福利标]，请打开app我页-持有列表进行查看。");
    }

    @Override
    public void buildKey2() {
        model.setKey2("周年庆加息福利标活动火爆进行中，快去投资吧:m.ppmoney.com");
    }

    @Override
    public 微信模板消息Model getModel() {
        return this.model;
    }
}
