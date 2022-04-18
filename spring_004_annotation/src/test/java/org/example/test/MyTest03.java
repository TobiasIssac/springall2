package org.example.test;

import org.example.s03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {

    @Test
    public void testSubSchool(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student stu  = (Student) ac.getBean("student");
        System.out.println(stu);

    }
}
