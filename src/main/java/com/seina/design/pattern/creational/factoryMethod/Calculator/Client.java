package com.seina.design.pattern.creational.factoryMethod.Calculator;

import com.seina.design.pattern.creational.simpleFactory.Operation;
import com.seina.design.pattern.creational.simpleFactory.OperationAdd;
import com.seina.design.pattern.creational.simpleFactory.OperationSub;

import java.util.Scanner;

/**
 * @author Selina
 * @version 2018/11/16 10:59:03
 * 工厂方法客户端
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

        //首先根据指定的运算符获取指定的运算操作工厂
        IOperationFactory operationFactory = null;
        switch (strOperate){
            case "+":
                operationFactory = OperationAdd::new;
                break;
            case "-":
                operationFactory = OperationSub::new;
                break;
        }

        //省略*和/

        //然后使用运算操作工厂生产一个加法运算操作
        Operation operation = operationFactory.createOperation();

        operation.getResult(numA, numB);

        //可能以上代码相对于简单工厂复杂了一点，但是其实将逻辑判断从底层挪到了高层
    }

}
