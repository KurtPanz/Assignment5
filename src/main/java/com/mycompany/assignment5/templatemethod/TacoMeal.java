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
public class TacoMeal extends Meal {

	@Override
	public void prepareIngredients() {
		System.out.println("Getting ground beef and shells");
	}

	@Override
	public void cook() {
		System.out.println("Cooking ground beef in pan");
	}

	@Override
	public void eat() {
		System.out.println("The tacos are tasty");
	}

	@Override
	public void cleanUp() {
		System.out.println("Doing the dishes");
	}

    
}
