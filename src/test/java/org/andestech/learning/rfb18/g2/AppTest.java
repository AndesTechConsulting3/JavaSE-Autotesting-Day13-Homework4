package org.andestech.learning.rfb18.g2;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AppTest
{
    @Test(dependsOnMethods = "meth05Test")
    public void meth01Test()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(11, 11);
    }

    @Test()
    public void meth02Test()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(11, 11);
    }

    @Test()
    public void meth03Test()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(11, 11);
    }

    @Test()
    public void meth04Test()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(11, 14);
    }

    @Test(dependsOnMethods = "meth04Test")
    public void meth05Test()
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(11, 15);
    }
}
