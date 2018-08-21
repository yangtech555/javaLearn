package com.yhb.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("展示产品。。。");
        for (String item :
                parts) {
            System.out.println(item);
        }
    }
}
