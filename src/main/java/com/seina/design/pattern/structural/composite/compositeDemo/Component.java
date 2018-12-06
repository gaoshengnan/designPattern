package com.seina.design.pattern.structural.composite.compositeDemo;

/**
 * @author Seina
 * @version 2018-12-06 22:08:43
 *
 * 组合的对象声明接口
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }


    /**
     * 通常都用add和remove来提供增加删除树叶或者树枝的功能
     */
    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);


}
