package com.yhb.designPattern.bridge;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public class APPPush extends Receiver {

    @Override
    public boolean send(Object param) {
        if (impLimit == null || !impLimit.limit(param)) {
            String message = impMessage.getMessage(param);
            System.out.println(String.format("APPPush send:%s", message));
            return true;
        }
        return false;
    }

    public APPPush(ImpMessage impMessage, ImpLimit impLimit) {
        super(impMessage, impLimit);
    }
}
