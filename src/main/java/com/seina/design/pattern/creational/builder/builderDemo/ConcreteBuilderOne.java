package com.seina.design.pattern.creational.builder.builderDemo;

/**
 * @author Seina
 * @version 2018-12-01 16:33:52
 */
public class ConcreteBuilderOne extends Builder {

    private Product product = new Product();

    /**
     * 建造具体的两个部件A和B
     */

    @Override
    public void builderPartA() {
        product.addPart("部件A");
    }

    @Override
    public void builderPartB() {
        product.addPart("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
