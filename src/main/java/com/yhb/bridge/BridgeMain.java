package com.yhb.bridge;

/**
 * Created by yanghongbo on 2018/8/20.
 */
public class BridgeMain {

    public static void main(String[] args) {

        Object param = new Object();

        Receiver wxTemplateMessageForActivity = new WeixinTemplateMessage(new ActivityMessage(), null);
        Receiver wxTemplageMessageForNormal = new WeixinTemplateMessage(new NormalMessage(), new TimeLimit());
        wxTemplateMessageForActivity.send(param);
        wxTemplageMessageForNormal.send(param);

        Receiver smsForActivity = new SMS(new ActivityMessage(), new TimeLimit());
        Receiver smsForNormal = new SMS(new NormalMessage(), new CountLimit());
        smsForActivity.send(param);
        smsForNormal.send(param);

        Receiver appPushForActivity = new APPPush(new ActivityMessage(), new TimeLimit());
        Receiver appPushForNormal = new APPPush(new NormalMessage(), null);
        appPushForActivity.send(param);
        appPushForNormal.send(param);
    }
}
