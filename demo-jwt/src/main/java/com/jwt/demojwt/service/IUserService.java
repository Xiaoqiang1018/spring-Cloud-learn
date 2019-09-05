package com.jwt.demojwt.service;

import com.jwt.demojwt.entity.User;

public interface IUserService {
    void addUser(User user);

    User UserLogin(User user);
}
