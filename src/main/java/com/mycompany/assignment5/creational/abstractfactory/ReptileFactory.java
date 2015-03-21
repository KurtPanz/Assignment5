/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.creational.abstractfactory;

/**
 *
 * @author Kurt
 */
public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("snake".equals(type)) {
			return new Snake();
		} else {
			return new Tyrannosaurus();
		}
	}
}
