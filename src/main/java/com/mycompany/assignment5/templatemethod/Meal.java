/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.templatemethod;

/**
 *
 * @author Kurt
 */
public abstract class Meal {

	// template method
	public final void doMeal() {
		prepareIngredients();
		cook();
		eat();
		cleanUp();
	}

	public abstract void prepareIngredients();

	public abstract void cook();

	public void eat() {
		System.out.println("Mmm, that's good");
	}

	public abstract void cleanUp();
    
}
