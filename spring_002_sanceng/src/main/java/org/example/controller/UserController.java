package org.example.controller;

import org.example.pojo.Users;
import org.example.service.Impl.UserServiceImpl;
import org.example.service.UserService;

/**
 * 界面层
 * CTRL+ALT 再点击方法名直接追击到实现类
 * CTRL 点击方法名追击到接口
 */
public class UserController {

    //如何访问页面逻辑层，就是创建对象
    //所有界面层都有用业务逻辑层的对象
    public UserService userService = new UserServiceImpl();

    //界面层的功能实现，对外提供访问的功能
    public int insert(Users users){
        return userService.insert(users);
    }
}
