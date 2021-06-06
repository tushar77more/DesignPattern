package com.dailycoder.behavioral.template;

public abstract class PizzaTemplate {

	public abstract void selectBread();
	public abstract void addingIngredients();
	
	public void cooking() {
		System.out.println("Cooking pizza for 15 min!");
	}
	
	public void addingTopings() {
		System.out.println("Adding Topings in Pizza");
	}
	
	public final void addingCheese() {
		System.out.println("Adding cheese in Pizza");
	}
	
	public final void preparePizza() {
		
		selectBread();
		addingIngredients();
		cooking();
		addingCheese();
		addingTopings();
	}
}
