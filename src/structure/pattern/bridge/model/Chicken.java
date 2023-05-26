package structure.pattern.bridge.model;

//Implementer's child
public class Chicken implements NonVegToppings{

	@Override
	public String applyToppings() {
		return "CHICKEN!";
	}

}
