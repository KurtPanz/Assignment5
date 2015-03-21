/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.creational.singleton;

/**
 *
 * @author Kurt
 */
public class Calculator {
    private static Calculator calculator = null;

	private Calculator() {
	}

	public static Calculator getInstance() {
		if (calculator == null) {
			calculator = new Calculator();
		}
		return calculator;
	}

	public int subtract(int a,int b)
        {
            return a - b;
        }
        
        public int add(int a,int b)
        {
            return a + b;
        }
}
