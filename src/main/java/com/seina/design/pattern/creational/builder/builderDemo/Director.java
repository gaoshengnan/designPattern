package com.seina.design.pattern.creational.builder.builderDemo;

/**
 * @author Seina
 * @version 2018-12-01 16:37:29
 */
public class Director {

    /**
     * 用来指挥构建过程
     * @param builder
     */

    public void construct(Builder builder){
        builder.builderPartA();
        builder.builderPartB();
    }
}
