package com.yhb.designPattern.bridge;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public class ActivityMessage extends ImpMessage {
    @Override
    public String getMessage(Object param){
        return "XXX,...,一大波活动标来啦，点击链接吧：m.ppomeny.com/activity";
    }
}
