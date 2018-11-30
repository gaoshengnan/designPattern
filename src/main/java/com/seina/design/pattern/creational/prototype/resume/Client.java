package com.seina.design.pattern.creational.prototype.resume;

/**
 * @author Seina
 * @version 2018-11-27 22:14:56
 */
public class Client {

    public static void main(String[] args) {

        /**
         * version: v1
         */

        //一份简历a
        Resume a = new Resume("seina");
        a.setPersonalInfo("女", "18");
        a.setWorkExperience("2018-2019", "xx公司");
        System.out.println("简历a");
        a.display();

        //一份简历b
        Resume b = new Resume("seina");
        b.setPersonalInfo("女", "18");
        b.setWorkExperience("2018-2019", "xx公司");
        System.out.println("简历b");
        b.display();

        //一份简历c
        Resume c = new Resume("seina");
        c.setPersonalInfo("女", "18");
        c.setWorkExperience("2018-2019", "xx公司");
        System.out.println("简历c");
        c.display();

        //如果需要三份，就要实例化三次，那如果需要99份，可能就需要实例化99次，或者说如果把2018错写成了2818，就需要改99次
        /**
         * 每new一次，都需要执行构造函数，如果构造函数的执行时间比较长，那么多次执行这个初始化操作效率太低
         * 转移到prototype/prototypeDemo/Client看下文
         */


        /**
         * version: v2
         */
        Resume d = new Resume("seina");
        d.setPersonalInfo("女", "18");
        d.setWorkExperience("2018-2019", "xx公司");
        System.out.println("简历d");
        d.display();

        Resume e = d;

        d.setPersonalInfo("男", "11");

        Resume f = d;

        System.out.println("简历e");
        e.display();

        System.out.println("简历f");
        f.display();

        //引用：相当于说e和f这两个简历上面写着简历内容在a上面



    }




}
