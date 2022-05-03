package org.example.s02;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImp implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome()业务方法被执行"+":输出"+name+age);
        return "abcd";
    }

    @Override
    public Student change() {
        System.out.println("change()方法被执行");
        return new Student("努力");
    }
}
