package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 22:33:22
 * Access类型的工厂创建AccessUser和AccessDept
 */
public class AccssFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDpt() {
        return new AccessDept();
    }
}
