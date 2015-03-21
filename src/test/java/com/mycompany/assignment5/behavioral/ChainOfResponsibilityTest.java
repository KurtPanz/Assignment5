/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.behavioral;

import com.mycompany.assignment5.behavioral.chainofresponsibility.EarthHandler;
import com.mycompany.assignment5.behavioral.chainofresponsibility.MercuryHandler;
import com.mycompany.assignment5.behavioral.chainofresponsibility.PlanetEnum;
import com.mycompany.assignment5.behavioral.chainofresponsibility.PlanetHandler;
import com.mycompany.assignment5.behavioral.chainofresponsibility.VenusHandler;
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
public class ChainOfResponsibilityTest {
    
    public ChainOfResponsibilityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void chainOfResponsibilityTest() {
        
	PlanetHandler chain = setUpChain();	
        chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.MERCURY);
        chain.handleRequest(PlanetEnum.EARTH);
        chain.handleRequest(PlanetEnum.JUPITER);
        
        Assert.assertNotNull(chain);
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

    private PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
	PlanetHandler venusHandler = new VenusHandler();
	PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
	venusHandler.setSuccessor(earthHandler);

	return mercuryHandler;
    }
}
