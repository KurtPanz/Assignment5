/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.creational;

import com.mycompany.assignment5.creational.singleton.Calculator;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Kurt
 */
public class SingletonTest {
    
    public SingletonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void singletonTest() {        
        Calculator calculator1 = Calculator.getInstance();
        Calculator calculator2 = Calculator.getInstance();
        
	Assert.assertEquals(calculator1.add(5,5), calculator2.subtract(20,10));        
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
