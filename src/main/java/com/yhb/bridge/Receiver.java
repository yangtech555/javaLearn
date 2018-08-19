package com.yhb.bridge;

import java.util.Hashtable;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public abstract class Receiver {

    protected ImpMessage impMessage;

    protected ImpLimit impLimit;

    public abstract boolean send(Object param);

    public Receiver(ImpMessage impMessage, ImpLimit impLimit) {
        this.impMessage = impMessage;
        this.impLimit = impLimit;
    }
}
