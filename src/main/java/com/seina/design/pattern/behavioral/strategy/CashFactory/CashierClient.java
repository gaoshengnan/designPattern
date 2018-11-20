package com.seina.design.pattern.behavioral.strategy.CashFactory;

import java.util.Scanner;

/**
 * @author Selina
 * @version 2018/11/20 10:35:39
 * 收银客户端：根据商品单价和数量计算出总价数
 */
public class CashierClient {


    public static double getTotal(double num, double price) {
        return num * price ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品单价：");
        double price = sc.nextDouble();
        System.out.println("请输入商品数量：");
        double num = sc.nextDouble();
        System.out.println("总金额为：" + CashierClient.getTotal(num, price));
    }

}
