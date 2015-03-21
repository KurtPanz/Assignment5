/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.structural;

import com.mycompany.assignment5.structural.bridge.BigBus;
import com.mycompany.assignment5.structural.bridge.SmallCar;
import com.mycompany.assignment5.structural.bridge.SmallEngine;
import com.mycompany.assignment5.structural.bridge.Vehicle;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kurt
 */
public class BridgeTest {
    
    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void bridgeTest() {
        Vehicle vehicle1 = new BigBus(new SmallEngine());
        Vehicle vehicle2 = new SmallCar(new SmallEngine());
	Assert.assertNotSame(vehicle1, vehicle2);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
