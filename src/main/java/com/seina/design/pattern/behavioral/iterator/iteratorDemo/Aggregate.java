package com.seina.design.pattern.behavioral.iterator.iteratorDemo;

/**
 * @author Seina
 * @version 2018-12-05 23:14:56
 *
 * 聚集抽象类
 */
public abstract class Aggregate {


    /**
     * 创建迭代器
     */
    public abstract Iterator createIterator();

    public abstract void add(String o);

    public abstract int getSize();

    public abstract String get(int index);
}
