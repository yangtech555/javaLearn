package com.yhb.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanghongbo on 2018/8/20.
 */
public abstract class Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        this.subjectState="吃饭啦";
        for (Observer item :
                observers) {
            item.update(this);
        }
    }
}
