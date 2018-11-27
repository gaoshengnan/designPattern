package com.seina.design.pattern.behavioral.templatemethod.extract;

/**
 * @author Selina
 * @version 2018/11/27 10:24:47
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("学生甲抄的试卷");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestion();

        System.out.println("学生乙抄的试卷");
        TestPaperB studentB = new TestPaperB();
        studentB.testQuestion();
    }

}
