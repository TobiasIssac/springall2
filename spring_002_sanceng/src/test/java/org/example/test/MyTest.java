package org.example.test;

import org.example.controller.UserController;
import org.example.pojo.Users;
import org.junit.Test;

public class MyTest {
    @Test
    public void testInsertUsers(){
        UserController userController = new UserController();
        int num = userController.insert(new Users(100,22,"张三"));
        System.out.println(num);


    }
}
