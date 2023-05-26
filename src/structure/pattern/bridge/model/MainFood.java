package structure.pattern.bridge.model;

// Abstraction
public abstract class MainFood {

	protected NonVegToppings toppings;
	
	public MainFood(NonVegToppings topping) {
		this.toppings = topping;
	}
	
	public abstract void prepareMainFood();
}
