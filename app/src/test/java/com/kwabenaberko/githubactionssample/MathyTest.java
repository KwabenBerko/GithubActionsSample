package com.kwabenaberko.githubactionssample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathyTest {


    private Mathy mathy;

    @Before
    public void setup(){
        mathy = new Mathy();
    }

    @After
    public void tearDown(){
        mathy = null;
    }

    @Test
    public void add(){
        assertEquals(13, mathy.add(5, 8));
    }

    @Test
    public void subtract(){
        assertEquals(10, mathy.subtract(30, 20));
    }

}
