package com.yhb.designPattern.Prototype;

import java.io.IOException;

/**
 * Created by yanghongbo on 2018/8/24.
 */
public class PrototypeMain {

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ConcretePrototype pp = new ConcretePrototype();
        pp.setName("aaaaa");

        ConcretePrototype pp2 = pp.deepClone();
        pp2.setName("bbbbb");

        System.out.println(pp.getName());
        System.out.println(pp2.getName());
    }



}
