package com.seina.design.pattern.structural.decorator;

/**
 * @author Selina
 * @version 2018/11/21 23:29:36
 * 装饰抽象类，扩展Component类的功能，对于Component无需知道Decorator的存在
 */
public abstract class Decorator extends Component{

    protected Component component;

    //通过set方式对Component进行包装
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写Component的Operation()，调用Component的Operation()
     */
    @Override
    public void Operation() {
        if (component != null){
            component.Operation();
        }
    }
}
