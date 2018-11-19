package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 22:31:12
 */
public class AccessUser implements IUser {
    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据ID得到User表中的一条记录");
        return null;
    }

    @Override
    public void insertUser() {
        System.out.println("在Access中给User新增一条记录");
    }
}
