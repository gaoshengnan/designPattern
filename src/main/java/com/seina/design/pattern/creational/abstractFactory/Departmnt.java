package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 22:41:01
 */
public class Departmnt {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    private int id;

    private String deptName;
}
