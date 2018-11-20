package com.seina.design.pattern.behavioral.strategy.CashFactory;

/**
 * @author Selina
 * @version 2018/11/20 11:17:41
 */
public class CashFactory {

    public static AbstractCash createCash(String type){
        AbstractCash cash = null;
        switch (type){
            case "正常":
                cash = new NormalCash();
                break;
            case "打9折":
                cash = new RebateCash(0.9d);
                break;
            case "满300减100":
                cash = new ReturnCash(300, 100);
                break;
        }
        return cash;
    }
}
