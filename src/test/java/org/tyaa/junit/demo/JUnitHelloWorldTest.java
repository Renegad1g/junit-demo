/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.junit.demo;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Yurii
 */
public class JUnitHelloWorldTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isGreaterTest() {
        System.out.println("Test");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
    }
    
    @Test
    public void isGreaterTestReversed() {
        System.out.println("Test2");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        assertFalse("Num 1 is not greater than Num 2", helloWorld.isGreater(3, 4));
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

}
