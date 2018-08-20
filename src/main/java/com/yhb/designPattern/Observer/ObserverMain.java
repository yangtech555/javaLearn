package com.yhb.designPattern.Observer;

/**
 * Created by yanghongbo on 2018/8/20.
 */
public class ObserverMain {

    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcereObserver("小明");
        Observer observer1 = new ConcereObserver("小红");

        subject.attach(observer);
        subject.attach(observer1);

        subject.notifyObservers();
    }
}
