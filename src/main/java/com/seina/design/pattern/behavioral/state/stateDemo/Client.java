package com.seina.design.pattern.behavioral.state.stateDemo;

/**
 * @author Seina
 * @version 2018-12-04 21:18:17
 */
public class Client {



    public static void main(String[] args) {

        /**
         * Client掉Context，Context中调State
         */
        Context context = new Context(new ConcreteStateA());
        context.request();
    }




}
