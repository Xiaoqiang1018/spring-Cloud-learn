package com.xq.cloud.consumerdemo01.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/* *
 * @ProjectName:    xq-cloud01
 * @Package:        com.xq.cloud.consumerdemo01.config
 * @ClassName:      RestTemplateConfiguration
 * @Author:     xiaoqiang
 * @Description:  ${description}
 * @Date:    2019/9/23
 * @Version:    1.0
 */
@Configuration
public class RestTemplateConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
