package com.seina.design.pattern.structural.decorator;

/**
 * @author Seina
 * @version 2018/11/21 22:43:07
 * 一个"人"这个类，具有穿各种衣服的方法
 */
public class Person {

    private String name;

    //构造一个带名字的人
    public Person(String name){
        this.name = name;
    }

    public void wearTShirt(){
        System.out.println("大T恤");
    }

    public void wearBigTrouser(){
        System.out.println("垮裤");
    }

    public void wearSnearkers(){
        System.out.println("破球鞋");
    }

    public void wearSuit(){
        System.out.println("西服");
    }

    public void wearLeatherShoes(){
        System.out.println("皮鞋");
    }


    public void show(){
        System.out.println("装扮的" + name);
    }

}
