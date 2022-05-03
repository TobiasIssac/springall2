package org.example.service.impl;

import org.example.mapper.UsersMapper;
import org.example.pojo.Accounts;
import org.example.pojo.Users;
import org.example.service.AccountsService;
import org.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersMapper usersMapper;

    @Autowired
    AccountsService accountsService;

    @Override
    public int insert(Users users) {
        int num = usersMapper.insert(users);
        System.out.println("用户增加成功!num="+num);

        //调用帐户的增加操作,调用的帐户的业务逻辑层的功能
        num = accountsService.save(new Accounts(300,"王五","帐户好的呢!"));
        return num;}
}
