package org.example.test;

import org.example.proxy3.Agent;
import org.example.proxy3.BookServiceImp;
import org.example.proxy3.ProductServiceImp;
import org.example.proxy3.Service;
import org.junit.Test;

public class MyTest03 {
    @Test
    public void testStatic(){
        Service agent = new Agent(new BookServiceImp());
        agent.buy();
    }


    @Test
    public void testStaticProduct(){
        Service agent = new Agent(new ProductServiceImp());
        agent.buy();
    }
}
