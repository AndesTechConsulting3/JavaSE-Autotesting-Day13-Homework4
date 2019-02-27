package org.andestech.learning.rfb18.g2;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import static java.lang.Math.pow;
import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    int a = 1;
    int b = 2;
    int c=3;

    @Test(dependsOnMethods = "meth05Test")
    public void meth01Test() {

        int expectedValue = 1;
        int actualValue = a * b * c;
        Assert.assertEquals(actualValue, expectedValue);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void meth02Test(){

        double expectedValue = 9;
        double actualValue = (pow(b, c)) + a;
        Assert.assertEquals(actualValue, expectedValue);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void meth03Test(){

        int expectedValue = 6;
        int actualValue = a + b + c;
        Assert.assertEquals(actualValue, expectedValue);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test(priority = -1)
    public void meth04Test(){

        double expectedValue = 16;
        double actualValue = (pow(b, a+c));
        Assert.assertEquals(actualValue, expectedValue);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test(dependsOnMethods = "meth04Test")
    public void meth05Test(){

        int expectedValue = 7;
        int actualValue = a + b * c;
        Assert.assertEquals(actualValue, expectedValue);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}