package structure.pattern.bridge.model;

//Refined Abstraction 
public class FriedRice extends MainFood{

	public FriedRice(NonVegToppings topping) {
		super(topping);
	}

	@Override
	public void prepareMainFood() {
		System.out.println("Presenting FriedRice with => " + toppings.applyToppings());			
	}

}
