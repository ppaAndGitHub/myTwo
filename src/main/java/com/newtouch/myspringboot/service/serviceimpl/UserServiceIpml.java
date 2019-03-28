package com.newtouch.myspringboot.service.serviceimpl;

import com.newtouch.myspringboot.dao.UserDao;
import com.newtouch.myspringboot.dao.pojo.UserVO;
import com.newtouch.myspringboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceIpml implements UserService {
    @Resource
    UserDao userDao;
    @Override
    public UserVO getUser() {
        UserVO user1 = userDao.getUser();
        System.out.println(user1.getUserName() +":::::"+user1.getPasswords());
        return user1;
    }
}
