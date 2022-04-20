package org.example.proxy5;

public class LogAOP implements AOP {
    @Override
    public void before() {
        System.out.println("前置日志输出。。。");
    }

}
