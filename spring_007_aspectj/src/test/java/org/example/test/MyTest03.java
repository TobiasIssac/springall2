package org.example.test;

import org.example.s03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest03 {
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImp");
        String s = someService.doSome("努力",23);
        System.out.println("在测试方法中的返回值"+s);

    }
}
