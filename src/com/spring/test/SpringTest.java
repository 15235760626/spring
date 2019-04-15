package com.spring.test;

import com.java.entity.JavaWork;
import com.spring.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//        User user = ac.getBean("user", User.class);
//        System.out.println(user);
        JavaWork javaWork = ac.getBean("javaWork", JavaWork.class);
        javaWork.doTest();
    }

}
