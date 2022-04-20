package org.example.proxy2;

public class SubBookServiceImp extends BookServiceImp{
    @Override
    public void bug() {
        try {
            //事务切面
            System.out.println("事务开启");
            //主业务实现
            super.bug();
            //事务切面
            System.out.println("事务提交");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }
    }
}
