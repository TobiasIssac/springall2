package org.example.test;

import org.example.s01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        Student student = (Student) ac.getBean("stu");
        System.out.println(student);
    }
}
