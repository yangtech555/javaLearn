package com.yhb.designPattern.Prototype;

import java.io.*;

/**
 * Created by yanghongbo on 2018/8/24.
 */
public class ConcretePrototype implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConcretePrototype deepClone() throws IOException,ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return  (ConcretePrototype)ois.readObject();

    }
}
