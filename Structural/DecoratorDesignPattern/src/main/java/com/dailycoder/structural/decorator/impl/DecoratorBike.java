package com.dailycoder.structural.decorator.impl;

import java.util.Collections;

import com.dailycoder.structural.decorator.Bike;

public class DecoratorBike implements Bike {

	private Bike bike;
	
	public DecoratorBike(Bike bike) {
		super();
		this.bike = bike;
	}
	
	public void assembledBike() {
		
		bike.assembledBike();
	}

}
