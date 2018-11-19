package com.seina.design.pattern.creational.abstractFactory;


/**
 * @author Selina
 * @version 2018/11/19 22:11:03
 * 数据库访问--新增用户和得到用户
 */
public class User {

    private int id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

