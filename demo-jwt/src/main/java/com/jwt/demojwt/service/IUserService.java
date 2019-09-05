package com.jwt.demojwt.service;

import com.jwt.demojwt.entity.User;

/**
 * @author:joe
 * @date:2019/5/20 19:43
 */
public interface IUserService {
    boolean checkUser(String loginName, String password);

    User getUserByLoginName(String loginName);
}
