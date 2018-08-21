package com.yhb.designPattern.builder;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("ConcreteBuilder2创建的部件A");
    }

    @Override
    public void buildPartB() {
        product.add("ConcreteBuilder2创建的部件B");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
