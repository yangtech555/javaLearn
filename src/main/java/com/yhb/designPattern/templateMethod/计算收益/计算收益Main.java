package com.yhb.designPattern.templateMethod.计算收益;

import java.math.BigDecimal;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public class 计算收益Main {

    public static void main(String[] args){
        计算收益模板 自助投 = new 计算自助投收益();
        BigDecimal 自助投总收益= 自助投.计算总收益();
        System.out.println("自助投总收益为"+自助投总收益+"元\n");

        计算收益模板 月月增 = new 计算月月增收益();
        BigDecimal 月月增总收益= 月月增.计算总收益();
        System.out.println("月月增总收益为"+月月增总收益+"元\n");

        计算收益模板 季季增 = new 计算季季增收益();
        BigDecimal 季季增总收益= 季季增.计算总收益();
        System.out.println("季季增总收益为"+季季增总收益 + "元");

    }
}
