package com.seina.design.pattern.behavioral.state.workStateOptimization;

/**
 * @author Seina
 * @version 2018-12-04 21:29:10
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<12){
            System.out.println("当前时间，" + work.getHour() + "点，上午工作，精神百倍");
        } else {
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }
}
