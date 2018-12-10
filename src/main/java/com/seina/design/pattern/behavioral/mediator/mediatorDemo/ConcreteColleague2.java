package com.seina.design.pattern.behavioral.mediator.mediatorDemo;

/**
 * @author Seina
 * @version 2018-12-10 22:34:07
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifying(String message){
        System.out.println("同事2得到消息：" + message);
    }


}
