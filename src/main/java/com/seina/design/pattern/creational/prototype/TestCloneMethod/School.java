package com.seina.design.pattern.creational.prototype.TestCloneMethod;

/**
 * @author Seina
 * @version 2018-11-28 08:34:24
 */
public class School implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;



    public void display(){
        System.out.println("School name:" + name + "------" + "Student name:" + student.getName());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        /**
         * 浅复制v1
         * 浅复制是指被复制对象的所有变量与原来变量都含有与原来对象相同的值，而所有对其他对象的引用都指向原来的对象
         *      a.如果字段是值类型，则对该字段执行逐位复制
         *      b.如果对象是引用类型，则复制引用，但不复制引用的对象，因此原始对象及其副本引用同一对象
         */
        //return super.clone();

        /**
         * 深复制v2
         * 深复制是指引用对象的变量指向复制的新对象，而不是原来的被引用的对象
         */
        School copySchool = (School)super.clone();
        copySchool.student = (Student)student.clone();
        return copySchool;

    }
}
