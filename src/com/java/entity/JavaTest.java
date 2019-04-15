package com.java.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
public class JavaTest {
    //主管功能   将控制权交给主管
    public static void main(String[] args) {
        JavaWork javaWork = new JavaWork();
        javaWork.setTester(new LiSi());
        javaWork.doTest();

    }
}
