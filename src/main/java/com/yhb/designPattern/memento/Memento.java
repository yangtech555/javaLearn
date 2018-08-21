package com.yhb.designPattern.memento;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
