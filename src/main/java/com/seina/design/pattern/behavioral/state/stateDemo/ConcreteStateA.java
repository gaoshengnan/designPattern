package com.seina.design.pattern.behavioral.state.stateDemo;

/**
 * @author Seina
 * @version 2018-12-04 21:14:07
 */
public class ConcreteStateA extends State {



    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
