package org.example.test;

import org.example.controller.UserController;
import org.example.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testInsertUsers(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        UserController userController = (UserController) ac.getBean("userController");
        userController.insert(new Users(100,22,"我的超"));

    }
}
