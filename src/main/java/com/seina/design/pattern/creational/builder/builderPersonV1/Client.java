package com.seina.design.pattern.creational.builder.builderPersonV1;

/**
 * @author Seina
 * @version 2018-12-01 15:31:57
 */
public class Client {

    public static void main(String[] args) {

        Graphic g = new Graphic();

        PersonThinBuilder thinB = new PersonThinBuilder(g);
        thinB.build();

        PersonFatBuilder fatB = new PersonFatBuilder(g);
        fatB.build();

        /**
         * 此时需要注意忘记给胖胖的人画两只脚了
         */

    }

}
