package com.lgl.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @Author 15911
 * @Date 2023/7/18 20:56
 * @Version 1.0
 * 全局生效 启动类的@EnableFeignClients这个注解中 @EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration .class)
 * 局部生效对应的@FeignClient这个注解中 @FeignClient(value = "userservice", configuration = DefaultFeignConfiguration .class)
 */
public class DefaultFeignConfiguration  {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC; // 日志级别为BASIC
    }
}
