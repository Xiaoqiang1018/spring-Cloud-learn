package com.jwt.demojwt.service.impl;

import com.jwt.demojwt.entity.User;
import com.jwt.demojwt.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author:joe
 * @date:2019/5/20 19:44
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public boolean checkUser(String loginName, String password) {
        if ("xiaoqiang".equals(loginName) && "aa".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public User getUserByLoginName(String loginName) {
        User user = new User();
        user.setId("2019");
        user.setName("xiaoqiang");
        user.setAge(18);
        return user;
    }
}
