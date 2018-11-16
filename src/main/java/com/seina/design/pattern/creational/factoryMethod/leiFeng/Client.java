package com.seina.design.pattern.creational.factoryMethod.leiFeng;


/**
 * @author Selina
 * @version 2018/11/16 11:29:22
 */
public class Client {
    public static void main(String[] args) {


        //生产一个大学生Tom
        ILeiFengFactory LeiFengFactory = Undergraduate::new;
        LeiFeng Tom = LeiFengFactory.createLeiFactory();

        //生产一个志愿者Seina
        ILeiFengFactory leiFengFactory = Volunteer::new;
        LeiFeng Seina = leiFengFactory.createLeiFactory();


        System.out.println("我的名字是Tom");
        Tom.Sweep();
        Tom.Wash();

        System.out.println("我的名字是Seina");
        Seina.Sweep();
        Seina.Wash();
    }
}
