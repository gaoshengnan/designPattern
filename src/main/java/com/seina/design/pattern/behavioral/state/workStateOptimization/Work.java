package com.seina.design.pattern.behavioral.state.workStateOptimization;

/**
 * @author Seina
 * @version 2018-12-04 21:28:14
 */
public class Work {

    private State current;

    private int hour;

    /**
     * 维护当前状态
     */
    public void writeProgram(){
        current.writeProgram(this);
    }


    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current ;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

}
