package org.example.service.Impl;

import org.example.dao.UserMapper;
import org.example.dao.UserMapperImpl;
import org.example.pojo.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑层实现类
 */
@Service
public class UserServiceImpl implements UserService {

    //切记切记：在所有的业务逻辑曾中必定有数据访问层的对象
    @Autowired
    private UserMapper userMapper ;//= new UserMapperImpl();


    @Override
    public int insert(Users u) {
        return userMapper.insert(u);
    }
}
