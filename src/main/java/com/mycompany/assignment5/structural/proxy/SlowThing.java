/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.structural.proxy;

/**
 *
 * @author Kurt
 */
public class SlowThing extends Thing {

	public SlowThing() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    
}
