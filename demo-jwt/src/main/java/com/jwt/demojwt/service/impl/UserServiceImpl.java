package com.jwt.demojwt.service.impl;

import com.jwt.demojwt.dao.UserLogin;
import com.jwt.demojwt.entity.User;
import com.jwt.demojwt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserLogin userLogin;

    @Override
    public void addUser(User user) {
        userLogin.addUser(user);
    }

    @Override
    public User UserLogin(User user) {
        return userLogin.UserLogin(user);
    }
}
