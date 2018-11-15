package com.seina.pattern.creational.SimpleFactory;


import java.util.Scanner;

/**
 * @author Selina
 * @version 2018/11/15 23:23:16
 * 客户端代码，用于控制控制台输入输出
 */
public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字A：");
        String numA = sc.nextLine();

        System.out.println("请选择运算符（+，—，*，/）");
        String strOperate = sc.nextLine();

        System.out.println("请输入数字B：");
        String numB = sc.nextLine();

        Operation operation = OperationFactory.createOperation(strOperate);

        String result = operation.getResult(numA, numB);

        System.out.println("结果是：" + result);
    }
}
