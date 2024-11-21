package structure.pattern.bridge.model;

// Refined Abstraction 
public class Chowmein extends MainFood{

	public Chowmein(NonVegToppings topping) {
		super(topping);
	}

	@Override
	public void prepareMainFood() {
		System.out.println("Presenting Chowmein with => " + toppings.applyToppings());		
	}

	
	
}
