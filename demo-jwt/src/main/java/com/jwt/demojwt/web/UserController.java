//package com.jwt.demojwt.web;
//
//
//import com.jwt.demojwt.entity.ApiResponse;
//import com.jwt.demojwt.service.IUserService;
//import com.jwt.demojwt.util.ApiResponseUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// *
// */
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private IUserService userService;
//
//    @RequestMapping(value = "/yi",method = RequestMethod.GET)
//    @ResponseBody
//    public ApiResponse getUser(){
//        return ApiResponseUtil.getApiResponse(userService.getUserByLoginName(""));
//    }
//}
