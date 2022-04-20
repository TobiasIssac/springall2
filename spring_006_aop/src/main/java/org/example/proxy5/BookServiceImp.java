package org.example.proxy5;

public class BookServiceImp implements Service {
    @Override
    public void buy() {
        System.out.println("图书购买功能实现。。。。");
    }

    @Override
    public String show(int age) {
        System.out.println("这是show（）方法被调用，输出age="+age);
        return "abcd";
    }
}
