package com.seina.design.pattern.creational.builder.builderPersonV2;

import com.seina.design.pattern.creational.builder.builderPersonV1.Graphic;

/**
 * @author Seina
 * @version 2018-12-01 16:02:07
 */
public abstract class PersonBuilder {

    protected Graphic g;

    public PersonBuilder(Graphic g) {
        this.g = g;
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildLeftHand();

    public abstract void buildRightHand();

    public abstract void buildLeftFoot();

    public abstract void buildRightFoot();



}
