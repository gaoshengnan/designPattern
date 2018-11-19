package com.seina.design.pattern.creational.abstractFactory;

import java.util.IdentityHashMap;

/**
 * @author Selina
 * @version 2018/11/19 22:19:22
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory1 = new SqlServerFactory();


        IUser sqluser = factory1.createUser();
        IDepartment dept1 = factory1.createDpt();

        sqluser.getUser(1);
        sqluser.insertUser();

        dept1.getDept(1);
        dept1.insertDept();

        IFactory factory2 = new AccssFactory();

        IUser accuser = factory2.createUser();
        IDepartment dept2 = factory2.createDpt();

        accuser.getUser(1);
        accuser.insertUser();

        dept2.insertDept();
        dept2.getDept(1);

        //生命IUser的对象sqluser和accuser并不知道在访问哪个数据库，这就是所谓的业务逻辑与数据访问的解耦


        /**
         * 用简单工厂来改进抽象工厂
         */
        IUser user = DataAccess.creatUser();
        IDepartment dept = DataAccess.creatDept();

    }
}
