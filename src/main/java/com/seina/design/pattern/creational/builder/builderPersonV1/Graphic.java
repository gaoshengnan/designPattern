package com.seina.design.pattern.creational.builder.builderPersonV1;

/**
 * @author Seina
 * @version 2018-12-01 15:21:02
 */
public class Graphic {

    private int ellipse;//圆形--头

    private int rectagle;//正方形--身体

    private int leftHandLine;//左手

    private int rightHandLine;//右手

    private int leftFootLine;//左脚

    private int rightFootLine;//右脚

    public void drawEllipse(){
        System.out.println("画头部");
    }
    public void drawRectagle(){
        System.out.println("画身体");
    }
    public void drawLeftHandLine(){
        System.out.println("画左手");
    }
    public void drawRightHandLine(){
        System.out.println("画右手");
    }
    public void drawLeftFootLine(){
        System.out.println("画左脚");
    }
    public void drawRightFootLine(){
        System.out.println("画右脚");
    }



}
