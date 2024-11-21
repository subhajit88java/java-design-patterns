package structure.pattern.bridge.model;

//Concrete Implementation
public class Chicken implements NonVegToppings{

	@Override
	public String applyToppings() {
		return "CHICKEN!";
	}

}
