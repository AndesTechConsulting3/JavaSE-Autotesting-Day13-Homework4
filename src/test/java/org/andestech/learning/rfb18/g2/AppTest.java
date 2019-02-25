package org.andestech.learning.rfb18.g2;


import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest
{
    @Test(dependsOnMethods = "meth05Test", parameters = {"a", "b"})
    public void meth01Test(int a, int b)
    {
        Assert.assertEquals(a, b);
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());

    }

    @Test
    public void meth02Test() {
        Assert.assertEquals(1, 1);
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());

    }

    @Test
    public void meth03Test() {
        Assert.assertEquals(1, 1);
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());

    }

    @Test
    public void meth04Test() {
        Assert.assertEquals(1, 1);
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());

    }

    @Test(dependsOnMethods = "meth04Test")
    public void meth05Test() {
        Assert.assertEquals(1, 1);
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());

    }
}
