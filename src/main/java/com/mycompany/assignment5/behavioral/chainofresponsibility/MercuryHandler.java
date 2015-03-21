/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.behavioral.chainofresponsibility;

/**
 *
 * @author Kurt
 */
public class MercuryHandler extends PlanetHandler {

	public void handleRequest(PlanetEnum request) {
		if (request == PlanetEnum.MERCURY) {
			System.out.println("MercuryHandler handles " + request);
			System.out.println("Mercury is hot.\n");
		} else {
			System.out.println("MercuryHandler doesn't handle " + request);
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}
    
}
