package com.seina.design.pattern.creational.builder.builderPersonV2;

import com.seina.design.pattern.creational.builder.builderPersonV1.Graphic;

/**
 * @author Seina
 * @version 2018-12-01 16:15:46
 */
public class Client {

    public static void main(String[] args) {

        Graphic g = new Graphic();

        PersonDirector pd = new PersonDirector(new PersonThinBuilder(g));

        pd.createPerson();

    }
}
