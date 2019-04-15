package com.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */

//持久层  数据防访问层DAO
@Repository
public class UserDao {
    public void add(){
        System.out.println("UserDao.add....");
    }

}
