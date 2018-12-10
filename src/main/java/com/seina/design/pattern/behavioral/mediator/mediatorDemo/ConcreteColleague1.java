package com.seina.design.pattern.behavioral.mediator.mediatorDemo;

/**
 * @author Seina
 * @version 2018-12-10 22:33:54
 *
 * 具体同事，只知道自己的行为，而不了解其他同事类的情况
 *
 * 但是他们却都认识中介者对象
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifying(String message){
        System.out.println("同事1得到消息：" + message);
    }

}
