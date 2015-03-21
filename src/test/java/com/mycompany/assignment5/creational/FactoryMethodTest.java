/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.creational;

import com.mycompany.assignment5.creational.factorymethod.Employee;
import com.mycompany.assignment5.creational.factorymethod.EmployeeFactory;
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
public class FactoryMethodTest {
    
    public FactoryMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void factoryMethodTest() {
        EmployeeFactory employeeFactory = new EmployeeFactory();

	Employee employee1 = employeeFactory.getEmployeeRole("Lecturer");
        Assert.assertEquals(employee1.role(), "Lecturer at CPUT");
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
