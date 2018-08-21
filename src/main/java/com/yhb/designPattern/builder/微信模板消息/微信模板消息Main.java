package com.yhb.designPattern.builder.微信模板消息;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public class 微信模板消息Main {

    public static void main(String[] args) {

        微信模板消息建造指挥者 指挥者 = new 微信模板消息建造指挥者();

        抽象建造者 充值成功建造者 = new 具体建造者_充值成功消息();
        指挥者.建造吧(充值成功建造者);
        微信模板消息Model 充值成功的建造产物 = 充值成功建造者.getModel();
        System.out.println(充值成功的建造产物.toString()+"\n");

        抽象建造者 投资成功建造者 = new 具体建造者_投资成功消息();
        指挥者.建造吧(投资成功建造者);
        微信模板消息Model 投资成功的建造产物 = 投资成功建造者.getModel();
        System.out.println(投资成功的建造产物.toString());

    }


}
