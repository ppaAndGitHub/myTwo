package com.newtouch.myspringboot.controller;

import com.newtouch.myspringboot.dao.pojo.UserVO;
import com.newtouch.myspringboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 诠释所有接受前台参数的方式
     * @param userName
     * @param passwords
     * @return
     */
    @GetMapping("login/{userName}")
    public UserVO userLogin(@PathVariable(name="userName") String userName , @RequestParam(name="passwords") String passwords){
        UserVO userVO = new UserVO();
        userVO.setPasswords(passwords);
        userVO.setUserName(userName);
        System.out.println();
        return new UserVO();
    }
}
