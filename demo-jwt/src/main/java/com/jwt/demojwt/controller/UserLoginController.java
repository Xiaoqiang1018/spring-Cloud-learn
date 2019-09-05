package com.jwt.demojwt.controller;

import com.jwt.demojwt.entity.User;
import com.jwt.demojwt.service.IUserService;
import com.jwt.demojwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/* *
 * @ProjectName:    demo-jwt
 * @Package:        com.jwt.demojwt.controller
 * @ClassName:      UserLoginController
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/9/5
 * @Version:    1.0
 */
@RestController
@RequestMapping("/login")
public class UserLoginController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        String s = null;
        //用户名校验
        User user1 = iUserService.UserLogin(user);
        String name = null;
        if (user1 != null) {
            name = user1.getName();
        }

        if (user.getName().equals(name)) {
            s = "用户已存在";
            return s;
        }
        iUserService.addUser(user);
        return "成功";
    }


    @PostMapping(value = "/doThings")
    public String dosome(){
        return "do somethings!";
    }

    @PostMapping(value = "userLogin")
    public String userLogin(@RequestBody User user, String s) {
        String sign = null;
        User user1 = iUserService.UserLogin(user);
        if (user == null ) {
            s = "用户不存在";
            return s;
        }
        String password = user1.getPassword();
        String name = user1.getName();
        String id = user1.getId();
        if (!password.equals(user.getPassword())) {
            s = "密码不正确";
        }
        sign = JwtUtil.sign(name, id);
        return sign;
    }



}
