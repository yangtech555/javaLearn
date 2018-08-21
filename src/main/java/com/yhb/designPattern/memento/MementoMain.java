package com.yhb.designPattern.memento;

/**
 * Created by yanghongbo on 2018/8/21.
 */
public class MementoMain {

    public static void main(String[] args){

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("1");
        originator.setState("2");
        careTaker.add(originator.createMemento());
        originator.setState("3");
        careTaker.add(originator.createMemento());
        originator.setState("4");

        System.out.println(String.format("originator当前状态:%s",originator.getState()));

        originator.restoreMemento(careTaker.getMemento(0));
        System.out.println(String.format("originator恢复为第一次保存的状态:%s",originator.getState()));

        originator.restoreMemento(careTaker.getMemento(1));
        System.out.println(String.format("originator恢复为第二次保存的状态:%s",originator.getState()));
    }
}
