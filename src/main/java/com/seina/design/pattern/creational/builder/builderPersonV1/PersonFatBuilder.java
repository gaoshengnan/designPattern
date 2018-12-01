package com.seina.design.pattern.creational.builder.builderPersonV1;

/**
 * @author Seina
 * @version 2018-12-01 15:31:08
 */
public class PersonFatBuilder {
    private Graphic g;

    public PersonFatBuilder(Graphic g) {
        this.g = g;
    }

    public void build(){
        System.out.println("画一个胖胖的人需要以下：");
        g.drawEllipse();
        g.drawRectagle();
        g.drawLeftHandLine();
        g.drawRightHandLine();
    }
}
