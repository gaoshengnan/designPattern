package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 22:55:29
 */
public class AccessDept implements IDepartment {
    @Override
    public void insertDept() {
        System.out.println("在Access中像Department表增加一条记录");
    }

    @Override
    public Departmnt getDept(int id) {
        System.out.println("在Access中给Department新增一条记录");
        return null;
    }
}
