package com.seina.design.pattern.structural.composite.compositeDemo;

/**
 * @author Seina
 * @version 2018-12-06 22:24:01
 */
public class Client {

    public static void main(String[] args) {


        /**
         * 结构如下
         *
         * -root
         * ---LeafA
         * ---LeafB
         * ---Composite X
         * ------Leaf X1
         * ------Leaf X2
         * ------Composite XY
         * ---------Leaf XY1
         * ---------Leaf XY2
         * ---LeafC
         * /


         /**
         * 先生成树根，根上长出两个叶LeafA和LeafB
         */
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        /**
         * 根上长出分支CompositeX，分支上有两个叶LeafXA和LeafXB
         */
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf X1"));
        comp.add(new Leaf("Leaf X2"));

        root.add(comp);

        /**
         * CompositeX上再长出分支CompositeXY，分支上也有两个叶子LeafXYA和LeafXYB
         */
        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XY1"));
        comp2.add(new Leaf("Leaf XY2"));

        comp.add(comp2);

        /**
         * 根部又长出了两个叶LeafC和LeafD，但是LeafD没长劳，又被风吹走了
         */
        root.add(new Leaf("leaf C"));
        Leaf leafD = new Leaf("Leaf D");
        root.add(leafD);
        root.remove(leafD);

        root.display(1);

    }


}
