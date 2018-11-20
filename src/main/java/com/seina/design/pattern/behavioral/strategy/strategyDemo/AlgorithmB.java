package com.seina.design.pattern.behavioral.strategy.strategyDemo;

/**
 * @author Selina
 * @version 2018/11/20 11:47:18
 * 继承策略模式接口的具体B算法实现
 */
public class AlgorithmB extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("具体实现B算法");
    }
}
