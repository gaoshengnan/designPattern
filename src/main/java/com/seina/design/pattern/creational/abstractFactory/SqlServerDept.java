package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 22:43:12
 */
public class SqlServerDept implements IDepartment {
    @Override
    public void insertDept() {
        System.out.println("在Sql Server中像Department表增加一条记录");
    }

    @Override
    public Departmnt getDept(int id) {
        System.out.println("在Sql Server根据id获取Department表的一条记录");
        return null;
    }
}
