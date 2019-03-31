package com.newtouch.myspringboot.dao;

import com.newtouch.myspringboot.dao.pojo.UserVO;

/**
 * @author ppa
 */
public interface UserDao {
    /**
     * 获取用户名
     * @return
     */
    UserVO getUser();
}
