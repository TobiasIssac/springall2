package org.example.test;

import org.example.proxy3.Agent;
import org.example.proxy5.*;
import org.junit.Test;

public class MyTest05 {
    @Test
    public void testFactory(){
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImp(),new TransAOP());
        agent.buy();
    }

    @Test
    public void testFactoryShow(){
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImp(),new TransAOP());
        String s = agent.show(33);
        System.out.println(s);
    }
    @Test
    public void testFactoryProductShow(){
        Service agent = (Service) ProxyFactory.getAgent(new ProductServiceImp(),new TransAOP());
        Service agent1 = (Service) ProxyFactory.getAgent(agent,new LogAOP());

        String s = agent1.show(33);
        System.out.println(s);
    }
}
