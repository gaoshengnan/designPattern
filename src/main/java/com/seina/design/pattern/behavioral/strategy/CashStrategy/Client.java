package com.seina.design.pattern.behavioral.strategy.CashStrategy;

import com.seina.design.pattern.behavioral.strategy.CashFactory.RebateCash;
import com.seina.design.pattern.behavioral.strategy.CashFactory.ReturnCash;

import java.util.Scanner;

/**
 * @author Selina
 * @version 2018/11/20 13:31:44
 */
public class Client {

    /**
     * 策略模式实现收银
     */

    public static void main(String[] args) {

        double totalPrice = 0.0d;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品单价：");
        double price = sc.nextDouble();
        System.out.println("请输入商品数量：");
        double num = sc.nextDouble();
        System.out.println("请输入以下几种优惠类型：打9折、满300减100");
        String selectedType = sc.next();

        CashContext cashContext = null;
        switch (selectedType){
            case "打9折":
                cashContext = new CashContext(new RebateCash(0.9d));
                break;
            case "满300减100":
                cashContext = new CashContext(new ReturnCash(300, 100));
                break;
        }
        totalPrice = num * price;
        System.out.println("总金额为：" + cashContext.callCash(totalPrice));


    }
}
