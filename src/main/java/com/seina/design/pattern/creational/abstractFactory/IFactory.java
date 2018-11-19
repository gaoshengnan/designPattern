package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 22:32:14
 * IFactory是一个抽象工厂的接口，里面包含创建所有产品的抽象方法
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDpt();
}
