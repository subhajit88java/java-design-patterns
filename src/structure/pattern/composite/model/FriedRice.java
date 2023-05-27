package structure.pattern.composite.model;

//leaf component
public class FriedRice implements Dish{
	@Override
	public void dishName() {
		System.out.println("Fried rice presented!");
	}
}
