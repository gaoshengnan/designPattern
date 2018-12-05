package com.seina.design.pattern.structural.adapter.adapterDemo;

/**
 * @author Seina
 * @version 2018-12-05 22:15:54
 *
 * 需要适配的类
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("特殊请求");
    }
}
