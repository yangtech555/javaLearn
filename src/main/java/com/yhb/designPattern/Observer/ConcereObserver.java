package com.yhb.designPattern.observer;

import java.util.Random;

/**
 * Created by yanghongbo on 2018/8/20.
 */
public class ConcereObserver implements Observer {
    private String name;

    private Subject subject;

    public ConcereObserver(String name){
        this.name=name;
    }

    @Override
    public void update(Subject subject){
        this.subject = subject;
        System.out.println(String.format("观察者:%s听到到主题说%s 然后吃了%d碗饭.",this.name,subject.getSubjectState(),new Random().nextInt(10)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
