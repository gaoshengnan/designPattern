package com.seina.design.pattern.creational.prototype.TestCloneMethod;

/**
 * @author Seina
 * @version 2018-11-30 07:25:22
 */
public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {


        School school = new School();
        school.setName("seina");
        school.setStudent(new Student("hahah"));
        System.out.println("输出school");
        school.display();


        School schoolCopy = (School)school.clone();

        System.out.println("输出schoolCopy");
        schoolCopy.display();

        schoolCopy.setName("lucky");
        Student student = schoolCopy.getStudent();
        student.setName("yaya");
        schoolCopy.setStudent(student);

        System.out.println("复制后的schoolCopy");
        schoolCopy.display();

        System.out.println("复制后的school");
        school.display();

    }
}
