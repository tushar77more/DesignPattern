package com.dailycoder.behavioral;

import com.dailycoder.behavioral.template.NonVegPizza;
import com.dailycoder.behavioral.template.PizzaTemplate;
import com.dailycoder.behavioral.template.VegPizza;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PizzaTemplate vegPizza = new VegPizza();
    	vegPizza.preparePizza();
    	
    	System.out.println("----------------------------------");
    	
    	PizzaTemplate nonvegPizza = new NonVegPizza();
    	nonvegPizza.preparePizza();
    	nonvegPizza.addingCheese();
    	
    }
}
