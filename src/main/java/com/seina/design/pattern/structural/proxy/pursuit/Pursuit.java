package com.seina.design.pattern.structural.proxy.pursuit;

/**
 * @author Selina
 * @version 2018/11/26 20:28:07
 * 追求者
 */
public class Pursuit {

    Fairy mm = null;

    //声明一个追求某个学妹的追求者
    Pursuit(Fairy mm) {
        this.mm = mm;
    }

    void giveDolls(){
        System.out.println("送"+mm.getName()+"洋娃娃");
    }

    void giveChocolate(){
        System.out.println("送"+mm.getName()+"巧克力");
    }


}
