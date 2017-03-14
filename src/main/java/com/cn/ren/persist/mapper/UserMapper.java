package com.cn.ren.persist.mapper;

import com.cn.ren.persist.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA ^_^
 * Author : renhongqiang
 * Date: 2017/3/14 20:07
 * Email: renhongqiang1397@gmail.com
 */
@Service
public interface UserMapper {
    User findUserInfo();
}
