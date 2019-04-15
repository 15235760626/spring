package com.spring.test;

import com.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
public class AnnotationTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        userService.add();
    }
}
