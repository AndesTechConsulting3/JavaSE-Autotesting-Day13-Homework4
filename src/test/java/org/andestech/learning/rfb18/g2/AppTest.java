package org.andestech.learning.rfb18.g2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest
{

    int a = 5;
    int d = 6;

    @Test (dependsOnMethods={"meth05Test","meth04Test"})
    public void meth01Test()
    {
        int summ=a+d;
        int expected = 11;
        Assert.assertEquals(expected,summ);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Test ()
    public void meth02Test()
    {
        int summ=a*d;
        int expected = 30;
        Assert.assertEquals(expected,summ);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Test ()
    public void meth03Test()
    {
        int summ=a-d;
        int expected = -1;
        Assert.assertEquals(expected,summ);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Test ()
    public void meth04Test()
    {
        int summ=a+d-1;
        int expected = 10;
        Assert.assertEquals(expected,summ);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Test (dependsOnMethods="meth04Test")
    public void meth05Test()
    {
        int summ=a*d-1;
        int expected = 29;
        Assert.assertEquals(expected,summ);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }
}
