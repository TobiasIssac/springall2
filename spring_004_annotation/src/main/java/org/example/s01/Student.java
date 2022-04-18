package org.example.s01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
    @Value("z")
    private String name;
    @Value("22")
    private int age;

    public Student() {
        System.out.println("无参构造方法执行了");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
