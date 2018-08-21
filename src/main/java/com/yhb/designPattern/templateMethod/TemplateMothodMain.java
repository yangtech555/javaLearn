package com.yhb.designPattern.templateMethod;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class TemplateMothodMain {

    public static void main(String[] args){

        AbstractClass c1 = new ConcreteClass1();
        c1.tempalteMethod();

        AbstractClass c2= new ConcreteClass2();
        c2.tempalteMethod();

    }
}
