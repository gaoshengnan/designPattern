package com.seina.design.pattern.creational.builder.builderDemo;

/**
 * @author Seina
 * @version 2018-12-01 16:30:19
 *
 * 抽象建造者类，确定产品是由两个部件PartA和PartB组成
 *
 * 并生命一个得到产品建造后结果的方法
 */
public abstract class Builder {

    public abstract void builderPartA();

    public abstract void builderPartB();

    public abstract Product getResult();

}
