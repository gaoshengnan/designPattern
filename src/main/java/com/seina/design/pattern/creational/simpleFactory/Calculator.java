package com.seina.design.pattern.creational.simpleFactory;

import java.util.Scanner;

/**
 * @author Selina
 * @version 2018/11/15 21:42:46
 * 用JAVA实现一个计算器控制台程序
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字A：");
        String numA = sc.nextLine();

        System.out.println("请选择运算符（+，—，*，/）");
        String strOperate = sc.nextLine();

        System.out.println("请输入数字B：");
        String numB = sc.nextLine();

        String result = "";

        switch (strOperate){
            case "+":
                result = String.valueOf(Integer.parseInt(numA) + Integer.parseInt(numB));
                break;
            case "-":
                result = String.valueOf(Integer.parseInt(numA) - Integer.parseInt(numB));
                break;
            case "*":
                result = String.valueOf(Integer.parseInt(numA) * Integer.parseInt(numB));
                break;
            case "/":
                if (Integer.parseInt(numB) != 0){
                    result = String.valueOf(Integer.parseInt(numA) / Integer.parseInt(numB));
                }else {
                    System.out.println("除数不能位0");
                    break;
                }
        }
        System.out.println("结果是："+ result);
    }
}
