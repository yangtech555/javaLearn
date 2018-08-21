package com.yhb.designPattern.builder;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class ConcreteBuilder1 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA(){
        product.add("ConcreteBuilder1创建的部件A");
    }

    @Override
    public void buildPartB(){
        product.add("ConcreteBuilder1创建的部件B");
    }

    @Override
    public Product getProduct(){
        return  this.product;
    }
}
