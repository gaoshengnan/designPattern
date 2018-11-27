package com.seina.design.pattern.behavioral.templatemethod.duplicate;

/**
 * @author Selina
 * @version 2018/11/27 00:20:02
 */
public class Client {

    public static void main(String[] args) {

        /**
         * 两个人的试卷除了答案不同，其他的都一样
         */
        System.out.println("学生甲抄的试卷");
        TestPaperA testPaperA = new TestPaperA();
        testPaperA.TestQuestion();

        System.out.println("学生乙抄的试卷");
        TestPaperB testPaperB = new TestPaperB();
        testPaperB.TestQuestion();
    }
}
