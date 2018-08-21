package com.yhb.designPattern.builder;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class BuilderMain {

    public static void main(String[] args){
        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        Product product1 = builder1.getProduct();
        product1.show();

        director.construct(builder2);
        Product product2 = builder2.getProduct();
        product2.show();
    }
}
