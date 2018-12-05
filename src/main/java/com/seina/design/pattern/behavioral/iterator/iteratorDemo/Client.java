package com.seina.design.pattern.behavioral.iterator.iteratorDemo;

/**
 * @author Seina
 * @version 2018-12-05 23:47:37
 */
public class Client {

    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();

        aggregate.add("haha");
        aggregate.add("hehe");
        aggregate.add("yaya");
        aggregate.add("heihei");
        aggregate.add("lala");
        System.out.println("index = 0 :" + aggregate.get(0));
        System.out.println("index = 1 :" + aggregate.get(1));
        System.out.println("index = 2 :" + aggregate.get(2));
        System.out.println("index = 3 :" + aggregate.get(3));
        System.out.println("index = 3 :" + aggregate.get(4));
        System.out.println(aggregate.getSize());

        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
