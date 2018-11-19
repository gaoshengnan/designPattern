package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 22:14:28
 * 用于操作用户User，有新增用户和得到用户两个方法
 */
public class SqlServerUser implements IUser{


    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中根据ID得到User表中的一条记录");
        return null;
    }

    @Override
    public void insertUser() {
        System.out.println("在SQL Server中给User新增一条记录");
    }
}
