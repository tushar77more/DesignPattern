package com.dailycoder.structural.decorator.impl;

import com.dailycoder.structural.decorator.Bike;

public class SportBike extends DecoratorBike {

	public SportBike(Bike bike) {
		super(bike);
	}

	@Override
	public void assembledBike() {
		super.assembledBike();
		System.out.println("Adding sport bike features.");
	}
	
	

}
