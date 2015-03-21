/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.creational;

import com.mycompany.assignment5.creational.abstractfactory.AbstractFactory;
import com.mycompany.assignment5.creational.abstractfactory.Animal;
import com.mycompany.assignment5.creational.abstractfactory.SpeciesFactory;
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
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void abstractFactoryTest() {
        AbstractFactory abstractFactory = new AbstractFactory();

	SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
	Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
        Assert.assertEquals(a1.makeSound(), "Roar");		
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
