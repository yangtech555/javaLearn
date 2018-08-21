package com.yhb.designPattern.templateMethod;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public abstract class AbstractClass {

    public abstract void methodA();

    public abstract void methodB();

    public void methodC(){

        System.out.println("父类的methodC");
    }

    public void tempalteMethod(){
        methodA();
        methodB();
        methodC();
    }
}
