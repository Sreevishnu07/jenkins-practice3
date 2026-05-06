package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
    @Test 
    public void testAdd(){
	int res=App.add(2,3);
	assertEquals(5,res);
    }
    
    @Test
    public void testdiv(){
        int res=App.div(6,2);
        assertEquals(3,res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero(){
	App.div(10,0);
    }
}