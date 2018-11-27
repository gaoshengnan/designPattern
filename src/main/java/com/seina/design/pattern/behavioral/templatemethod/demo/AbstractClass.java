package com.seina.design.pattern.behavioral.templatemethod.demo;

/**
 * @author Selina
 * @version 2018/11/27 10:37:40
 */
public abstract class AbstractClass {

    public abstract void PrimitiveOperation1();

    public abstract void PrimitiveOperation2();

    public void templateMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("");
    }



}
