package com.yhb.designPattern.Prototype;

import java.io.IOException;

/**
 * Created by yanghongbo on 2018/8/24.
 */
public interface Prototype {
    public Prototype deepClone() throws IOException,ClassNotFoundException;
}
