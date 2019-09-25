package com.xq.cloud.consumerdemo01feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/* *
 * @ProjectName:    xq-cloud01
 * @Package:        com.xq.cloud.consumerdemo01feign.service
 * @ClassName:      FeignService
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/9/24
 * @Version:    1.0
 */
@FeignClient(value = "provider-demo01")
public interface FeignService {

    //访问提供者
    @RequestMapping(value = "/pro01",method = RequestMethod.GET)
//    String getPro01(String mes); 错误
     String getPro01(@RequestParam(value = "mes") String mes);
}
