package com.spring.service;

import com.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
//业务层
@Service
public class UserService {

    //通过byName 赋值 ; Resource 通过byName赋值  ; Autowired 通过byType赋值;
    @Autowired
    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("UserService.add....");
        userDao.add();
    }


}
