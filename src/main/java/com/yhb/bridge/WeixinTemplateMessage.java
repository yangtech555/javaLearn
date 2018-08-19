package com.yhb.bridge;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public class WeixinTemplateMessage extends Receiver {


    @Override
    public boolean send(Object param) {
        if (impLimit == null || !impLimit.limit(param)) {
            String message = impMessage.getMessage(param);
            System.out.println(String.format("WeixinTemplate send:%s", message));
            return true;
        }
        return false;
    }

    public WeixinTemplateMessage(ImpMessage impMessage, ImpLimit impLimit) {
        super(impMessage, impLimit);
    }
}
