package org.example.proxy4;

public class Agent implements Service{
    //传入目标（业务）对象，切面对象
    Service target;
    AOP aop;
    //使用构造方法初始化业务对象和切面对象
    public Agent(Service target, AOP aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try {
            aop.before();
            target.buy();
            aop.after();
        } catch (Exception e) {
            aop.exception();
        }


    }
}
