package structure.pattern.decorator.model;

public class Mayonnaise implements PizzaLayer{

	private String previousLayer;
	
	public Mayonnaise(PizzaLayer pizzaLayer) {
		this.previousLayer = pizzaLayer.getLayer();
	}

	@Override
	public String getLayer() {
		return this.previousLayer + "\nMayonnaise added!!";
	}
	
	

}
