package com.seina.design.pattern.creational.abstractFactory;

/**
 * @author Selina
 * @version 2018/11/19 22:32:56
 * Sql Server类型的工厂创建SqlServerUser和SqlServerDept
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDpt() {
        return new SqlServerDept();
    }
}
