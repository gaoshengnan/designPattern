package com.seina.design.pattern.behavioral.mediator.mediatorDemo;

/**
 * @author Seina
 * @version 2018-12-10 23:23:01
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 首先声明一个中介者
         */
        ConcreteMediator mediator = new ConcreteMediator();

        /**
         * 让两个同事人事中介者
         */
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        /**
         * 让中介者人事两个同事
         */
        mediator.setConcreteColleague1(concreteColleague1);
        mediator.setConcreteColleague2(concreteColleague2);

        /**
         * 两个同事开始通过中介者发消息
         */
        concreteColleague1.send("吃过饭了吗");
        concreteColleague2.send("没有呢，你打算请客吗");

    }
}
