package com.seina.design.pattern.behavioral.state.workState;

/**
 * @author Seina
 * @version 2018-12-04 20:37:40
 */
public class Work {

    private int hour;

    private boolean finish = false;

    /**
     * 方法过长是坏味道
     */
    public void writeProgram(){
        if (hour < 11){
            System.out.println("当前时间，" + hour + "点，上午工作，精神百倍");
        } else if (hour <13){
            System.out.println("当前时间，" + hour + "点，中午，该吃饭了");
        } else if(hour < 17){
            System.out.println("当前时间，" + hour + "点，下午状态还不错哦，继续努力");
        }else {
            if (finish){
                System.out.println("当前时间，" + hour + "点，工作完成，下班回家睡觉");
            } else {
                System.out.println("当前时间，" + hour + "点，工作没完成，加班");
            }
        }
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }



}
