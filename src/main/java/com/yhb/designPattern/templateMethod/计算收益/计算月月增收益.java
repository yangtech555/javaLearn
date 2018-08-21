package com.yhb.designPattern.templateMethod.计算收益;

import java.math.BigDecimal;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public class 计算月月增收益 extends 计算收益模板 {

    @Override
    public BigDecimal 计算基本利息收益(){
        //具体的月月增利息收益算法，每个月递增利率
        System.out.println("计算月月增收益为200.00元");
        return new BigDecimal(200.00);
    }
}
