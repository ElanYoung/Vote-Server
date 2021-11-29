package com.starimmortal.vote.common.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @author Administrator
 * 全局配置类 配置跨域请求
 */

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("Http://localhost:8080","null") //请求初始地址（允许跨域访问的路径）
                .allowedMethods("*") //允许传输的方法，"*"代表全部
                .allowCredentials(true) //是否允许传输数据
                .maxAge(3600); //默认1800
    }
}
