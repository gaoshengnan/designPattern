package com.seina.design.pattern.creational.builder.builderPersonV2;

import com.seina.design.pattern.creational.builder.builderPersonV1.Graphic;

/**
 * @author Seina
 * @version 2018-12-01 16:05:28
 * 瘦人去继承PersonBuilder，就必须重写规定好的抽象方法，以达到"规定"的目的
 */
public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder(Graphic g) {
        super(g);
    }



    @Override
    public void buildHead() {
        System.out.println("瘦瘦瘦");
        g.drawEllipse();
    }

    @Override
    public void buildBody() {
        System.out.println("瘦瘦瘦");
        g.drawRectagle();
    }

    @Override
    public void buildLeftHand() {
        System.out.println("瘦瘦瘦");
        g.drawLeftHandLine();
    }

    @Override
    public void buildRightHand() {
        System.out.println("瘦瘦瘦");
        g.drawRightHandLine();
    }

    @Override
    public void buildLeftFoot() {
        System.out.println("瘦瘦瘦");
        g.drawLeftFootLine();
    }

    @Override
    public void buildRightFoot() {
        System.out.println("瘦瘦瘦");
        g.drawRightFootLine();
    }
}
