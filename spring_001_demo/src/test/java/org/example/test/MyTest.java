package org.example.test;

import org.example.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testStudent(){

        Student student = new Student();
        System.out.println(student);
    }

    @Test
    public void testStudentSpring(){
        //如果想从Spring容器取对象，则需要先创建容器对象，并启动才可以取对象
        ApplicationContext ac  = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        Student stu = (Student) ac.getBean("stu");
        System.out.println(stu);
    }
}
