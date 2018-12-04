package com.seina.design.pattern.behavioral.state.workStateOptimization;

/**
 * @author Seina
 * @version 2018-12-04 22:54:48
 */
public class Client {


    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(13);
        work.setCurrent(new ForenoonState());
        work.writeProgram();

    }



}
