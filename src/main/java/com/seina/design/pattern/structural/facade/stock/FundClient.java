package com.seina.design.pattern.structural.facade.stock;

/**
 * @author Seina
 * @version 2018-11-30 22:11:35
 */
public class FundClient {


    public static void main(String[] args) {
        Fund fund = new Fund();

        /**
         * 不需要考虑股票相关细节，这些事情基金来处理
         */

        fund.buyFund();

        fund.sellFund();
    }

}
