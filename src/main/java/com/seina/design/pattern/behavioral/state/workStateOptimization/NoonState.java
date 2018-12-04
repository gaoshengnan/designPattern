package com.seina.design.pattern.behavioral.state.workStateOptimization;

/**
 * @author Seina
 * @version 2018-12-04 21:29:46
 */
public class NoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<14){
            System.out.println("当前时间，" + work.getHour()+ "点，中午，该吃饭了");
        }

        //后面省略...
    }
}
