package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 23:21:55
 * 抛弃了IFactory、SqlServerFactory、AccssFactory三个工厂类
 */
public class DataAccess {

    /**
     * 用简单工厂来改进抽象工厂
     */

    //传入哪个参数，就生产哪个类型的产品
    private static final String sqlServerdb = "SqlServer";
    private static final String accessdb = "accessdb";

    //生产User
    public static IUser creatUser(){
        IUser user = null;
        switch (sqlServerdb){
            case "SqlServer" :
                user =  new SqlServerUser();
                break;
            case "accessdb" :
                user =  new AccessUser();
            break;
        }
        return user;
    }

    //生产Dept
    public static IDepartment creatDept(){
        IDepartment dept = null;
        switch (sqlServerdb){
            case "SqlServer" :
                dept = new SqlServerDept();
            break;
            case "accessdb" :
                dept = new AccessDept();
            break;
        }
        return dept;
    }

}
