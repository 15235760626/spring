package com.java.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
public class JavaWork {

    private Tester tester;

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    public void doTest() {
        //业务操作时,对象之间的耦合度高

//        ZhangSan zhangSan = new ZhangSan();
//        zhangSan.test();
//
//        LiSi liSi = new LiSi();
//        liSi.test();

        tester.test();


    }
}
