package com.yhb.designPattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}

