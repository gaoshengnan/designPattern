package com.seina.design.pattern.creational.builder.builderDemo;

/**
 * @author Seina
 * @version 2018-12-01 16:39:25
 */
public class Client {

    public static void main(String[] args) {


        Director director = new Director();

        Builder builder1 = new ConcreteBuilderOne();
        Builder builder2 = new ConcreteBuilderTwo();

        Product product;

        /**
         * 指挥者指挥某个构建者的方法来构建产品
         */
        System.out.println("第一个");
        director.construct(builder1);
        product = builder1.getResult();
        product.show();


        System.out.println("第二个");
        director.construct(builder2);
        product = builder2.getResult();
        product.show();
    }
}
