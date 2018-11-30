package com.seina.design.pattern.creational.prototype.resume;

/**
 * @author Seina
 * @version 2018/11/27 21:57:59
 *
 * 个人简历
 */
public class Resume {

    private String name;

    private String sex;

    private String age;

    private String timeArea;

    private String company;

    public Resume(String name) {
        this.name = name;
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea, String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display(){
        System.out.println("个人信息：" + name +" "+ sex +" "+ age);
        System.out.println("工作经历：" + timeArea +" "+ company);
    }
}
