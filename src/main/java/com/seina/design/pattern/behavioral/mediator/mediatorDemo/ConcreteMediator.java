package com.seina.design.pattern.behavioral.mediator.mediatorDemo;

/**
 * @author Seina
 * @version 2018-12-10 22:32:46
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;

    private ConcreteColleague2 colleague2;

    public void setConcreteColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1){
            colleague2.notifying(message);
        } else {
            colleague1.notifying(message);
        }
    }
}
