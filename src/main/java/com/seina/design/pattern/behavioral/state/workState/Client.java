package com.seina.design.pattern.behavioral.state.workState;

/**
 * @author Seina
 * @version 2018-12-04 20:52:53
 */
public class Client {

    public static void main(String[] args) {

        Work w = new Work();

        w.setHour(9);
        w.writeProgram();

        w.setHour(12);
        w.writeProgram();

        w.setHour(14);
        w.writeProgram();

        w.setHour(19);
        w.setFinish(true);
        w.writeProgram();


    }
}
