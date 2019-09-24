package com.xq.cloud.consumerdemo01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/* *
 * @ProjectName:    xq-cloud01
 * @Package:        com.xq.cloud.consumerdemo01.service
 * @ClassName:      Concumer01Service
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/9/24
 * @Version:    1.0
 */
@Service
public class Concumer01Service {

    @Autowired
    private RestTemplate restTemplate;

    public String getPro01(String mes) {
        // url+服务名+接口+参数，返回值类型
        return restTemplate.getForObject("http://provider-demo01/pro01?mes=" + mes, String.class);
    }
}
