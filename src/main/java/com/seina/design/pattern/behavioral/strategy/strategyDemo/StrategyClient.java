package com.seina.design.pattern.behavioral.strategy.strategyDemo;

/**
 * @author Selina
 * @version 2018/11/20 11:54:39
 */
public class StrategyClient {

    public static void main(String[] args) {
        Context context;

        context = new Context(new AlgorithmA());
        context.contextInterface();

        context = new Context(new AlgorithmB());
        context.contextInterface();
    }
}
