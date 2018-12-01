package com.seina.design.pattern.creational.builder.builderDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seina
 * @version 2018-12-01 16:23:49
 */
public class Product {

    List<String> parts = new ArrayList<>();

    /**
     * 用来添加产品部件
     * @param part
     */
    public void addPart(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品创建过程");
        for (String p : parts) {
            System.out.println(p);
        }
    }





}