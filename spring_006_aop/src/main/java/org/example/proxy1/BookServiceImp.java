package org.example.proxy1;

public class BookServiceImp {
    public void buy(){

        try {
            System.out.println("事务开启");
            System.out.println("图书购买功能实现");
            System.out.println("事务提交");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }
    }
}
