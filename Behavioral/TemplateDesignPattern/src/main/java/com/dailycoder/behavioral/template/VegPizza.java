package com.dailycoder.behavioral.template;

public class VegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for veg pizza");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding Ingredient in veg pizza");
	}

}
