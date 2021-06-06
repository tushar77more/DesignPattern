package com.dailycoder.structural.bridge.impl;

import com.dailycoder.structural.bridge.Color;
import com.dailycoder.structural.bridge.Shape;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Rectangle drwan with "+color.fill();
	}

}
