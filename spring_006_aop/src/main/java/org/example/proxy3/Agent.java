package org.example.proxy3;

public class Agent implements Service{

    public Service target;
    public Agent(Service target){
        this.target=target;
    }
    @Override
    public void buy() {
        try {
            //事务切面
            System.out.println("事务开启");
            //主业务实现
            target.buy();
            //事务切面
            System.out.println("事务提交");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }

    }
}
