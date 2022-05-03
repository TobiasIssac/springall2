package org.example.s03;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImp implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome() method is executing"+name);
        return "struggle";
    }
}
