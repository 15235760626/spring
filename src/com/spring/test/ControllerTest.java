package com.spring.test;

import com.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
public class ControllerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("databases.xml");

        /*采用xml依赖注入*/
/*        UserService userService = ac.getBean("userService", UserService.class);
        userService.add();*/

        /*byName依赖注入*/
/*        UserService userService1 = ac.getBean("userService1", UserService.class);
        userService1.add();*/

        /*byType依赖注入*/
        UserService userService2 = ac.getBean("userService2", UserService.class);
        userService2.add();
    }
}
