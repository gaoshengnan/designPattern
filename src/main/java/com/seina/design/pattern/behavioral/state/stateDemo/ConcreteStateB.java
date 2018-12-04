package com.seina.design.pattern.behavioral.state.stateDemo;

/**
 * @author Seina
 * @version 2018-12-04 21:15:15
 */
public class ConcreteStateB extends State {


    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
