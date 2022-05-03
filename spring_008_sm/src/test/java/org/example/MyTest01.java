package org.example;

import org.example.pojo.Accounts;
import org.example.pojo.Users;
import org.example.service.AccountsService;
import org.example.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void testUsers(){
        ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        //取出UserServiceImpl对象
        UsersService usersService = (UsersService) ac.getBean("usersServiceImpl");
        int num  = usersService.insert(new Users(100,"刘努力","123"));
        //手动抛异常
//        System.out.println(1/0);
        System.out.println(num);
    }

    @Test
    public void testAccounts(){
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        AccountsService accountsService = (AccountsService) ac.getBean("accountsServiceImpl");
        System.out.println(accountsService.getClass());
        System.out.println(accountsService.getClass());
        accountsService.save(new Accounts(208,"李四8","帐户安全888!"));
    }

    @Test
    public void testtrans(){
        ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext_trans.xml");
        //取出UserServiceImpl对象
        UsersService usersService = (UsersService) ac.getBean("usersServiceImpl");
        int num  = usersService.insert(new Users(200,"撒花","123"));
        //手动抛异常
//        System.out.println(1/0);
        System.out.println(num);
    }
}
