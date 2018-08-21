package com.yhb.designPattern.memento;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        state = memento.getState();
    }
}
