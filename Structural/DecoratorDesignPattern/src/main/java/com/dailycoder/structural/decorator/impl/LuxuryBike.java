package com.dailycoder.structural.decorator.impl;

import com.dailycoder.structural.decorator.Bike;

public class LuxuryBike extends DecoratorBike {

	public LuxuryBike(Bike bike) {
		super(bike);
		
	}

	@Override
	public void assembledBike() {
			super.assembledBike();
			System.out.println("Adding Luxury bike features.");
	}
	

}
