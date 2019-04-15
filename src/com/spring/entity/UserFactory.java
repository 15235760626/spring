package com.spring.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
public class UserFactory {

    public User creatUser(){
        User user = new User();
        user.setId(5);
        user.setUsername("admin5");
        user.setPassword("admin55");
        return user;
    }
    public static User creatStaticUser(){
        User user = new User();
        user.setId(6);
        user.setUsername("admin6");
        user.setPassword("admin66");
        return user;
    }

}
