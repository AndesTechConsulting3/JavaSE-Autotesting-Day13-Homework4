package org.andestech.learning.rfb18.g2;


import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest
{
    @Test(dependsOnMethods = "meth05Test")
    public void meth01Test()
    {
        Assert.assertEquals(1, 3);
        Thread.currentThread().getStackTrace()[1].getClassName();

    }

    @Test
    public void meth02Test() {
        Assert.assertEquals(1, 1);
        Thread.currentThread().getStackTrace()[1].getClassName();

    }

    @Test
    public void meth03Test() {
        Assert.assertEquals(1, 1);
        Thread.currentThread().getStackTrace()[1].getClassName();

    }

    @Test
    public void meth04Test() {
        Assert.assertEquals(1, 1);
        Thread.currentThread().getStackTrace()[1].getClassName();

    }

    @Test(dependsOnMethods = "meth04Test")
    public void meth05Test() {
        Assert.assertEquals(1, 1);
        Thread.currentThread().getStackTrace()[1].getClassName();

    }
}
