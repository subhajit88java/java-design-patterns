package structure.pattern.decorator.main;

import structure.pattern.decorator.model.ChickenToppings;
import structure.pattern.decorator.model.Mayonnaise;
import structure.pattern.decorator.model.PizzaBun;
import structure.pattern.decorator.model.PizzaLayer;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		
		PizzaLayer pizzaLayerOne = new Mayonnaise(new ChickenToppings(new PizzaBun()));
		System.out.println("pizzaLayerOne -> ");
		System.out.println(pizzaLayerOne.getLayer());
		
		PizzaLayer pizzaLayerTwo = new Mayonnaise(new PizzaBun());
		System.out.println("pizzaLayerTwo -> ");
		System.out.println(pizzaLayerTwo.getLayer());
	}
}
