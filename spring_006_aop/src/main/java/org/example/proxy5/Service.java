package org.example.proxy5;

public interface Service {
    //规定业务功能
    void buy();

    //实现有参有返回值的方法
    default String show(int age){return null;}
}
