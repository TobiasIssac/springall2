package org.example.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("school")
public class School {
    @Value("CUMT")
    private String name;
    @Value("XuZhou")
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public School() {
        System.out.println("School无参构造方法");
    }
}
