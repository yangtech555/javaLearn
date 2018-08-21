package com.yhb.designPattern.templateMethod;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class ConcreteClass1 extends AbstractClass {

    @Override
    public void methodA(){
        System.out.println("子类1的methodA");
    }

    @Override
    public void methodB(){
        System.out.println("子类1的methodB");
    }

}
