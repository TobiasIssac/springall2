package org.example.s01;

import org.springframework.stereotype.Service;

/**
 *业务实现类
 */
@Service
public class SomeServiceImp implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome的业务功能实现");
        return "这是业务实现类的返回";
    }

    @Override
    public void show() {
        System.out.println("show() method executed!");
    }
}
