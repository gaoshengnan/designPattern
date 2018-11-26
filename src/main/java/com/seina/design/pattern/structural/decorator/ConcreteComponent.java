package com.seina.design.pattern.structural.decorator;

/**
 * @author Selina
 * @version 2018/11/21 23:30:04
 */
public class ConcreteComponent extends Component {

    @Override
    public void Operation() {
        System.out.println("具体的操作");
    }
}
