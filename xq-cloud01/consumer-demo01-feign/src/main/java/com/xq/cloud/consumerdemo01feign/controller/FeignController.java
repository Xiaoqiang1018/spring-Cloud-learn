package com.xq.cloud.consumerdemo01feign.controller;

import com.xq.cloud.consumerdemo01feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/* *
 * @ProjectName:    xq-cloud01
 * @Package:        com.xq.cloud.consumerdemo01feign.controller
 * @ClassName:      FeignController
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/9/24
 * @Version:    1.0
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "con02", method = RequestMethod.GET)
    public String getPro01(String mes) {
       return feignService.getPro01(mes);
    }
}
