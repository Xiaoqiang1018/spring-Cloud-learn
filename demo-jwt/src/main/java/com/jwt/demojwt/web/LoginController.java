package com.jwt.demojwt.web;


import com.jwt.demojwt.entity.ApiResponse;
import com.jwt.demojwt.entity.User;
import com.jwt.demojwt.enums.ApiResponseEnum;
import com.jwt.demojwt.service.IUserService;
import com.jwt.demojwt.util.ApiResponseUtil;
import com.jwt.demojwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author:joe
 * @date:2019/5/20 19:40
 */
@Controller
public class LoginController {

    @Autowired
    private IUserService userService;

    /**
     * 登陆接口
     *
     * @return token
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse login(@RequestBody Map<String, String> map) {
        String loginName = map.get("loginName");
        String password = map.get("password");
        //身份验证是否成功
        boolean isSuccess = userService.checkUser(loginName, password);
        if (isSuccess) {
            User user = userService.getUserByLoginName(loginName);
            if (user != null) {
                //返回token
                String token = JwtUtil.sign(user.getName(), user.getId());
                if (token != null) {
                    return ApiResponseUtil.getApiResponse(token);
                }
            }
        }
        //返回登陆失败消息
        return ApiResponseUtil.getApiResponse(ApiResponseEnum.LOGIN_FAIL);
    }
}
