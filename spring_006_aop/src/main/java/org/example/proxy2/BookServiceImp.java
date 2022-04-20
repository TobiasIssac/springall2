package org.example.proxy2;

/**
 * 使用子类代理方式进行图书业务和事务切面的管理
 */
public class BookServiceImp {
    //在父类中只有干干净净的核心业务
    public void bug(){
        System.out.println("购买图书");
    }
}
