package org.example.test;

import org.example.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void testStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
}
