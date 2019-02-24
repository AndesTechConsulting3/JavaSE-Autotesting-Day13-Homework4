package org.andestech.learning.rfb18.g2;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AppTest
{

    public static int testInt = 10;

    @Test(dependsOnMethods = "meth05Test")
    public void meth01Test(){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(testInt, 10);

    }


    @Test()
    public void meth02Test(){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(testInt, 10);

    }


    @Test()
    public void meth03Test(){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(testInt, 10);

    }


    @Test()
    public void meth04Test(){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(testInt, 10);

    }


    @Test(dependsOnMethods = "meth04Test")
    public void meth05Test(){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertEquals(testInt, 10);

    }


}
