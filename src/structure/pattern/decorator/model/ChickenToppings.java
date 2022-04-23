package structure.pattern.decorator.model;

public class ChickenToppings implements PizzaLayer{

	private String previousLayer;
	
	public ChickenToppings(PizzaLayer pizzaLayer) {
		this.previousLayer = pizzaLayer.getLayer();
	}
	
	@Override
	public String getLayer() {
		return this.previousLayer + "\nChicken Toppings added!!";
	}

}
