package structure.pattern.composite.model;

//leaf component
public class ChillyChicken implements Dish{
	@Override
	public void dishName() {
		System.out.println("ChillyChicken presented!");
	}
}
