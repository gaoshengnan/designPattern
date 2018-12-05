package com.seina.design.pattern.behavioral.iterator.iteratorDemo;

/**
 * @author Seina
 * @version 2018-12-05 23:19:39
 */
public class ConcreteIterator extends Iterator {

    private Object[] aggregate;
    private int current = 0;

    /**
     * 初始化的时候将具体的聚集对象传入
     */
    public ConcreteIterator(Object[] aggregate) {
        this.aggregate = aggregate;
    }

    /**
     * 得到聚集的第一个对象
     */
    @Override
    public Object first() {
        return aggregate[0];
    }

    /**
     * 得到聚集的下一个对象
     */
    @Override
    public Object next() {
        Object o = null;
        current ++;
        if (current < aggregate.length){
            o = aggregate[current];
        }
        return o;
    }

    /**
     * 判断当前是否遍历到结尾
     */
    @Override
    public boolean isDone() {
        return current >= aggregate.length ? true : false;
    }

    /**
     * 返回当前的聚集对象
     */
    @Override
    public Object currentItem() {
        return aggregate[current];
    }


}
