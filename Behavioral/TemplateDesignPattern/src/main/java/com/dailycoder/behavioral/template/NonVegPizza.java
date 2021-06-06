package com.dailycoder.behavioral.template;

public class NonVegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for Non-Veg pizza");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding Ingredient in Non-Veg pizza");
	}

}
