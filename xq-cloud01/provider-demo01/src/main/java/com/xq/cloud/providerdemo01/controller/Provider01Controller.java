package com.xq.cloud.providerdemo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/* *
 * @ProjectName:    xq-cloud01
 * @Package:        com.xq.cloud.providerdemo01.controller
 * @ClassName:      Provider01Controller
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/9/24
 * @Version:    1.0
 */
@RestController
public class Provider01Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/pro01")
    public String getPro01(String mes, HttpServletResponse res) {
        res.setHeader("result", "1");
        return "provider--->" + port + "mes------>" + mes;
    }
}
