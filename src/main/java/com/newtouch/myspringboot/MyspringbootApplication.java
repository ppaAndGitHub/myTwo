package com.newtouch.myspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
//    https://blog.csdn.net/hzr0523/article/details/80434106
//SpringBoot+MyBatis+Redis实现SSO单点登录系统(一)
@SpringBootApplication
@ComponentScan("com.newtouch")//添加的注解
@MapperScan({"com.newtouch.myspringboot.dao"})
public class MyspringbootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MyspringbootApplication.class);
    }
    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication(MyspringbootApplication.class);
        springApplication.run(MyspringbootApplication.class, args);
    }

}
