package com.yhb.designPattern.builder;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getProduct();
}
