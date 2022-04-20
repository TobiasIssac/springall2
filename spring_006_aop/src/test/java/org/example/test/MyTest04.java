package org.example.test;

import org.example.proxy4.*;
import org.junit.Test;

public class MyTest04 {
    @Test
    public void testAOP(){
        Service agent = new Agent(new BookServiceImp(),new TransAOP());
        agent.buy();
    }

    @Test
    public void testAOPProduct(){
        Service agent = new Agent(new ProductServiceImp(),new TransAOP());
        Service agent1 = new Agent(agent,new LogAOP());
        agent.buy();
    }
}
