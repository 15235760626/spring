package com.spring.test;

import com.java.entity.JavaWork;
import com.spring.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        //通过setter方式注入
        User user1 = ac.getBean("user1", User.class);
        System.out.println(user1);


        // 通过构造方式注入
        //类型注入
        User user2 = ac.getBean("user2", User.class);
        System.out.println(user2);

        //通过索引注入
        User user3 = ac.getBean("user3", User.class);
        System.out.println(user3);


        //联合注入
        User user4 = ac.getBean("user4", User.class);
        System.out.println(user4);

        //工厂方法注入
        //静态工厂
        User user5 = ac.getBean("user5", User.class);
        System.out.println(user5);

        //非静态工厂注入
        User user6 = ac.getBean("user6", User.class);
        System.out.println(user6);

    }

}
