package org.andestech.learning.rfb18.g2;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AppTest
{
    int a = 2,b = 7;

    @Test(dependsOnMethods = "meth05Test", priority = -1)
    public void meth01Test ()
    {
        int expected_val = 19;
        int actual_val = a + b;

        Assert.assertEquals(actual_val,expected_val);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void meth02Test ()
    {
        int expected_val = -5;
        int actual_val = a - b;

        Assert.assertEquals(actual_val,expected_val);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void meth03Test ()
    {
        int expected_val = 14;
        int actual_val = a * b;

        Assert.assertEquals(actual_val,expected_val);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test(priority = 100)
    public void meth04Test () throws InterruptedException
    {
        int expected_val = 11;
        int actual_val = a * a + b;

        Assert.assertEquals(actual_val,expected_val);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        wait(1000);
    }

    @Test(dependsOnMethods = "meth04Test")
    public void meth05Test ()
    {
        int expected_val = 10;
        int actual_val = (b - a) * a;

        Assert.assertEquals(actual_val,expected_val);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

}
