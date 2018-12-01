package com.seina.design.pattern.creational.builder.builderPersonV1;

/**
 * @author Seina
 * @version 2018-12-01 15:20:13
 */
public class PersonThinBuilder {

    private Graphic g;

    public PersonThinBuilder(Graphic g) {
        this.g = g;
    }

    public void build(){
        System.out.println("画一个瘦瘦的人需要以下：");
        g.drawEllipse();
        g.drawRectagle();
        g.drawLeftHandLine();
        g.drawRightHandLine();
        g.drawLeftFootLine();
        g.drawRightFootLine();
    }
}
