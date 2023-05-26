package structure.pattern.bridge.model;

//Implementer's child
public class Prawn implements NonVegToppings{

	@Override
	public String applyToppings() {
		return "PRAWN!";
	}
}
