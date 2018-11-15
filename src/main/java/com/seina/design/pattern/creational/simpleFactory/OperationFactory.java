package com.seina.design.pattern.creational.simpleFactory;



/**
 * @author Selina
 * @version 2018/11/15 23:24:48
 */
public class OperationFactory {

    public static Operation createOperation(String operate){
        Operation oper = null;
        switch (operate){
            case "+" :
                oper = new OperationAdd();
                break;
            case "-" :
                oper = new OperationSub();
                break;
        }
    return oper;
    }


}
