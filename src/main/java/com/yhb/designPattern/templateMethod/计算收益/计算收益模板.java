package com.yhb.designPattern.templateMethod.计算收益;

import java.math.BigDecimal;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public abstract class 计算收益模板 {


    public abstract BigDecimal 计算基本利息收益();

    public BigDecimal 计算加息券收益() {
        //公用的加息券收益算法
        System.out.println("计算加息券收益为"+100.00+"元");
        return new BigDecimal(100.00);
    }

    public BigDecimal 计算特权加息收益() {
        //公用的特权加息收益算法
        System.out.println("计算特权加息收益为"+999.99+"元");
        return new BigDecimal(999.99);
    }

    public BigDecimal 计算总收益() {
        BigDecimal 基本利息收益 = 计算基本利息收益();
        BigDecimal 加息券收益 = 计算加息券收益();
        BigDecimal 特权加息收益 = 计算特权加息收益();
        return 基本利息收益.add(加息券收益).add(特权加息收益).setScale(2,BigDecimal.ROUND_FLOOR);
    }
}
