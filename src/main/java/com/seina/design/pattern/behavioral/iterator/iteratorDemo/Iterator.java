package com.seina.design.pattern.behavioral.iterator.iteratorDemo;

/**
 * @author Seina
 * @version 2018-12-05 23:12:59
 *
 * 迭代器抽象类
 */
public abstract class Iterator {

    /**
     * 用来定义得到开始对象，得到下一个对象，判断是否到结尾，当前对象等抽象方法
     */

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();


}
