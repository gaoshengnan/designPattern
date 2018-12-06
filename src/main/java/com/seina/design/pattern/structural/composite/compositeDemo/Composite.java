package com.seina.design.pattern.structural.composite.compositeDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seina
 * @version 2018-12-06 22:19:51
 *
 * 定义枝节点的行为，用来存储子部件
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(name);
        for (Component c : children) {
            c.display(depth + 2);
        }
    }


}
