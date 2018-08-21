package com.yhb.designPattern.templateMethod.计算收益;

import java.math.BigDecimal;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public class 计算季季增收益 extends 计算收益模板 {

    @Override
    public BigDecimal 计算基本利息收益() {
        //具体的季季增利息收益算法，每个季度递增利率
        System.out.println("计算季季增收益为500.00元");
        return new BigDecimal(500.00);
    }
}