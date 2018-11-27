package com.seina.design.pattern.behavioral.templatemethod.extract;

/**
 * @author Selina
 * @version 2018/11/27 00:22:54
 * 抽象模版
 */
public abstract class TestPaper {

    //模版方法，给出逻辑的骨架
    public void TestQuestion(){
        System.out.println("问题：谁是小仙女，请选择：A.Seina, B.Sunny");
        System.out.println("答案："+ Answer());
    }

    //抽象行为放到子类中去实现
    protected abstract String Answer();
}
