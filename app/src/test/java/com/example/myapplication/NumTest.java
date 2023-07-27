package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumTest {

    private Num n;

    @Before
    public void setUp() throws Exception {
        n = new Num();
    }

    @Test
    public void sum() {
        assertEquals(8,n.sum(5,3));
    }
}