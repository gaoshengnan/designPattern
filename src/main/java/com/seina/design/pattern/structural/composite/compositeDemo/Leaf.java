package com.seina.design.pattern.structural.composite.compositeDemo;

/**
 * @author Seina
 * @version 2018-12-06 22:12:33
 *
 *定义叶节点的行为
 */
public class Leaf extends Component{

    public Leaf(java.lang.String name) {
        super(name);
    }

    /**
     * 由于叶子没有再增加分支和树叶，所以add和remove方法都没法实现
     * 但这样可以消除叶节点和枝节点在抽象层次的区别，他们具备完全一致的接口
     */
    @Override
    public void add(Component c) {
        System.out.println("不能再增加了");
    }

    @Override
    public void remove(Component c) {
        System.out.println("不能再移除了");
    }

    @Override
    public void display(int depth) {
        System.out.println("-" + name);
    }
}
