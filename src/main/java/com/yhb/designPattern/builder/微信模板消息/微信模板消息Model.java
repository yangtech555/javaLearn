package com.yhb.designPattern.builder.微信模板消息;

/**
 * Created by yanghongbo on 2018/8/22.
 */
public class 微信模板消息Model {

    private String title;

    private String key1;

    private String key2;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    @Override
    public String toString() {
        return "微信模板消息Model{" +
                "title='" + title + '\'' +
                ", key1='" + key1 + '\'' +
                ", key2='" + key2 + '\'' +
                '}';
    }
}
