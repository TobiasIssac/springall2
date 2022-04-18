package org.example.s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("subschool")
public class SubSchool extends School{
    @Value("CUMT附属小学")
    private String name;
    @Value("XuZhou")
    private String address;

    public SubSchool() {
        System.out.println("学校子类无参方法执行");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
