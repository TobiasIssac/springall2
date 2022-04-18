package org.example.service.Impl;

import org.example.dao.UserMapper;
import org.example.dao.UserMapperImpl;
import org.example.pojo.Users;
import org.example.service.UserService;

/**
 * 业务逻辑层实现类
 */
public class UserServiceImpl implements UserService {

    //切记切记：在所有的业务逻辑曾中必定有数据访问层的对象
    private UserMapper userMapper ;//= new UserMapperImpl();
    //交给Spring去依赖注入值，必须提供setXXX()方法


    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int insert(Users u) {
        return userMapper.insert(u);
    }
}
