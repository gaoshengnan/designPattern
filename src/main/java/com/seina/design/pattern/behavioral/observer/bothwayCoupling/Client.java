package com.seina.design.pattern.behavioral.observer.bothwayCoupling;

/**
 * @author Seina
 * @version 2018-12-01 19:42:23
 */
public class Client {


    public static void main(String[] args) {

        //前台小仙女seina
        Secretary seina = new Secretary("seina");

        //两个玩股票的马户和李银河
        StockObserver mahu = new StockObserver("观察者股民-马户", seina);
        StockObserver lyh = new StockObserver("观察者股民-李银河", seina);

        //和前台小仙女seina约定好了老板来了通知他们
        seina.AddObserver(mahu);
        seina.AddObserver(lyh);

        //发现老板来了
        seina.setAction("老板来了");

        //通知两个同事
        seina.notifying();



    }
}
