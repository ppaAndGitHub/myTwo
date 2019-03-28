package com.newtouch.myspringboot.controller;

import com.newtouch.myspringboot.dao.pojo.UserVO;
import com.newtouch.myspringboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {
    @Resource
    UserService userService;

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("getUser")
    public UserVO getUser(){
        log.info("===========开始查询用户========");
        return userService.getUser();
    }
}
