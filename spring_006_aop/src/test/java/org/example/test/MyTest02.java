package org.example.test;

import org.example.proxy2.BookServiceImp;
import org.example.proxy2.SubBookServiceImp;
import org.junit.Test;

public class MyTest02 {
    @Test
    public void testSub(){
        BookServiceImp service = new SubBookServiceImp();
        service.bug();
    }
}
