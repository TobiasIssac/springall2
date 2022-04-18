package org.example.test;

import org.example.controller.UserController;
import org.example.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testInsertUsers(){
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        //取出对象
        UserController userController = (UserController) ac.getBean("uController");
        //测试功能
        int num = userController.insert(new Users(200,22,"我的超"));
        System.out.println(num);


    }
}
