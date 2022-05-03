package org.example.test;

import org.example.s02.SomeService;
import org.example.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.xml.StaxUtils;

public class MyTest02 {
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImp");
        String s = someService.doSome("努力", 23);
        System.out.println("测试方法中目标方法的返回值"+s);
    }

    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImp");
        Student student  = someService.change();
        System.out.println("测试方法中目标方法的返回值"+student);
    }
}
