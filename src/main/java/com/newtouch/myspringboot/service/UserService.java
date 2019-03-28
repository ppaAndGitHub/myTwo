package com.newtouch.myspringboot.service;

import com.newtouch.myspringboot.dao.pojo.UserVO;

public interface UserService {
    /**
     * 获取用户信息
     * @return
     */
    UserVO getUser();
}
