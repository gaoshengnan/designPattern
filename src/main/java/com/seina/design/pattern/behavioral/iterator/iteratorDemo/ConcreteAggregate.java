package com.seina.design.pattern.behavioral.iterator.iteratorDemo;

/**
 * @author Seina
 * @version 2018-12-05 23:21:02
 */
public class ConcreteAggregate extends Aggregate {

    /**
     * 聚集类里有一个字符串数组集合
     */
    private String[] strs;

    private int num;

    private int index = 0;

    /**
     * 构造器，初始化一个指定数字长度的字符串数组
     */
    ConcreteAggregate() {
        this.strs = new String[5];
    }

    /**
     * 创建一个迭代器，将strs字符串数组塞进去
     */
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(strs);
    }

    @Override
    public void add(String str) {
        strs[index++] = str;
        num++;
    }

    @Override
    public int getSize() {
        return num;
    }

    @Override
    public String get(int index) {
        return strs[index];
    }



}
