package com.seina.design.pattern.behavioral.strategy.strategyDemo;

/**
 * @author Selina
 * @version 2018/11/20 11:49:54
 * concreteStrategy，具体的策略来配置，维护一个对Strategy对象的引用
 */
public class Context {

    private Strategy strategy;

    //初始化时传入具体的对象
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //根据具体的策略对象调用其算法的方法
    public void contextInterface(){
        strategy.algorithmInterface();
    }

}
