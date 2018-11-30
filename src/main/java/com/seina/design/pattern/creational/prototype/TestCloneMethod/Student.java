package com.seina.design.pattern.creational.prototype.TestCloneMethod;

/**
 * @author Seina
 * @version 2018-11-28 10:41:33
 */
public class Student implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
