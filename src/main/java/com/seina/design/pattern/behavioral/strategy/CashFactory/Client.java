package com.seina.design.pattern.behavioral.strategy.CashFactory;

import java.util.Scanner;

/**
 * @author Selina
 * @version 2018/11/20 11:35:33
 */
public class Client {

    public static void main(String[] args) {

        double totalPrice = 0.0d;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品单价：");
        double price = sc.nextDouble();
        System.out.println("请输入商品数量：");
        double num = sc.nextDouble();

        totalPrice = num * price;

        System.out.println("正常价格为：" + CashFactory.createCash("正常").getTotal(totalPrice));
        System.out.println("打9折后总金额为：" + CashFactory.createCash("打9折").getTotal(totalPrice));
        System.out.println("满300减100后总金额为：" + CashFactory.createCash("满300减100").getTotal(totalPrice));

    }

}
