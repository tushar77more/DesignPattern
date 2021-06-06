package com.dailycoder.structural.bridge.impl;

import com.dailycoder.structural.bridge.Color;
import com.dailycoder.structural.bridge.Shape;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Circle is drawn with "+color.fill();
	}

}
