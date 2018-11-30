package com.seina.design.pattern.creational.prototype.prototypeDemo;

/**
 * @author Seina
 * @version 2018-11-28 07:53:23
 *
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConcretePrototype A = new ConcretePrototype("001");

        A.display();

        ConcretePrototype copyA = (ConcretePrototype)A.clone();

        copyA.display();

        System.out.println("----------");

        /**
         * 一般在初始化信息不发生任何变化的时候，克隆是最好的办法，既隐藏了对象创建的细节，又对性能大大提高
         * 克隆不用重新初始化对象，而是动态地获得对象运行时的状态
         */

        A.setId("123");

        A.display();

        copyA.display();


    }

}
