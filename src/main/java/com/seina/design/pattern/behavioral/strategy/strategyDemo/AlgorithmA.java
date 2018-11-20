package com.seina.design.pattern.behavioral.strategy.strategyDemo;

/**
 * @author Selina
 * @version 2018/11/20 11:47:04
 * 继承策略模式接口的具体A算法实现
 */
public class AlgorithmA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("具体实现A算法");
    }
}
