package structure.pattern.bridge.model;

//Concrete Implementation
public class Prawn implements NonVegToppings{

	@Override
	public String applyToppings() {
		return "PRAWN!";
	}
}
