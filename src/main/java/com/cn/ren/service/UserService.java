package com.cn.ren.service;

import com.cn.ren.persist.model.User;
import com.cn.ren.persist.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA ^_^
 * Author : renhongqiang
 * Date: 2017/3/14 20:07
 * Email: renhongqiang1397@gmail.com
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo() {
        User user = userMapper.findUserInfo();
        return user;
    }
}
