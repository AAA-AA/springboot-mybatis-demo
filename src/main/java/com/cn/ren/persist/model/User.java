package com.cn.ren.persist.model;

import lombok.Data;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA ^_^
 * Author : renhongqiang
 * Date: 2017/3/14 20:03
 * Email: renhongqiang1397@gmail.com
 */
@Data
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private String password;

    private Date ctime;

    private Date mtime;

    private Integer status;
}
