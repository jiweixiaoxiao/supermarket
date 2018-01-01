package com.uizhi.service.impl;

import com.uizhi.dao.UserMapper;
import com.uizhi.domain.User;
import com.uizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jiwei
 * Date: 2018-01-01
 * Time: 21:52
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;

    public User getUserById(int num) {
        User user = userMapper.selectByPrimaryKey(num);
        return user;
    }
}
