/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author resha
 */
public class FinalTest {
    
    public FinalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Final.
     */
  

    /**
     * Test of calculateNet method, of class Final.
     */
    @Test
    public void testCalculateNet() {
        System.out.println("calculateNet");
        double hours = 1;
        double rate = 1;
        double tax = 1;
        double expResult = 0.0;
        double result = Final.calculateNet(hours, rate, tax);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
