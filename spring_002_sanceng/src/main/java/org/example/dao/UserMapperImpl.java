package org.example.dao;

import org.example.pojo.Users;

/**
 * 数据访问层的实现类
 */
public class UserMapperImpl implements UserMapper{

    @Override
    public int insert(Users u) {
        System.out.println("加一个"+u.getUname());
        return 1;

    }
}
