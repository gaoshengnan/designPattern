package com.seina.design.pattern.creational.builder.builderDemo;

/**
 * @author Seina
 * @version 2018-12-01 16:35:07
 */
public class ConcreteBuilderTwo extends Builder{

    private Product product = new Product();



    @Override
    public void builderPartA() {
        product.addPart("部件X");
    }

    @Override
    public void builderPartB() {
        product.addPart("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
