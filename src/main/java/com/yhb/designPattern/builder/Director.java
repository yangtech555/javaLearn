package com.yhb.designPattern.builder;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
