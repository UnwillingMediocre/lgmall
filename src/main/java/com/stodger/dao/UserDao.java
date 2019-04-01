package com.stodger.dao;

import com.stodger.pojo.User;

/**
 * 用户数据库操作
 * @program: lgmall
 * @description: 用户数据库操作
 * @author: Stodger
 * @create: 2019-03-29 16:53
 * @Version: 1.0
 **/
public interface UserDao {


    /**
     * 检测用户名
     * @param username 用户名
     * @return User
     */
    User userCodeByUsername(String username);
}
