package com.seina.design.pattern.creational.builder.builerPersonV2;

import com.seina.design.pattern.creational.builder.builderPersonV1.Graphic;

/**
 * @author Seina
 * @version 2018-12-01 16:08:23
 */
public class PersonFatBuilder extends PersonBuilder {

    public PersonFatBuilder(Graphic g) {
        super(g);
    }

    @Override
    public void buildHead() {
        System.out.println("胖胖胖");
        g.drawEllipse();
    }

    @Override
    public void buildBody() {
        System.out.println("胖胖胖");
        g.drawRectagle();
    }

    @Override
    public void buildLeftHand() {
        System.out.println("胖胖胖");
        g.drawLeftHandLine();
    }

    @Override
    public void buildRightHand() {
        System.out.println("胖胖胖");
        g.drawRightHandLine();
    }

    @Override
    public void buildLeftFoot() {
        System.out.println("胖胖胖");
        g.drawLeftFootLine();
    }

    @Override
    public void buildRightFoot() {
        System.out.println("胖胖胖");
        g.drawRightFootLine();
    }
}
