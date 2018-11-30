package com.seina.design.pattern.creational.prototype.prototypeDemo;

/**
 * @author Seina
 * @version 2018-11-28 07:24:23
 */
public class ConcretePrototype implements Cloneable{ //实现Cloneable实现浅复制

    private String id;

    public ConcretePrototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void display(){
        System.out.println(id);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}
