package com.seina.design.pattern.behavioral.templatemethod.extract;

/**
 * @author Selina
 * @version 2018/11/27 00:31:00
 */
public class TestPaperA extends TestPaper {

    public void testQuestion(){
        super.TestQuestion();
    }

    @Override
    protected String Answer() {
        return "a";
    }
}
