package com.xq.cloud.consumerdemo01.controller;

import com.xq.cloud.consumerdemo01.service.Concumer01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* *
 * @ProjectName:    xq-cloud01
 * @Package:        com.xq.cloud.consumerdemo01.controller
 * @ClassName:      Consumer01Controller
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/9/24
 * @Version:    1.0
 */
@RestController
public class Consumer01Controller {
    @Autowired
    private Concumer01Service concumer01Service;

    @GetMapping("con01")
    public String getcon01(String mes) {
        return concumer01Service.getPro01(mes);
    }

}
