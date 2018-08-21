package com.yhb.designPattern.templateMethod;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class ConcreteClass2 extends AbstractClass {

    @Override
    public void methodA(){
        System.out.println("子类2的methodA");
    }

    @Override
    public void methodB(){
        System.out.println("子类2的methodB");
    }
}
