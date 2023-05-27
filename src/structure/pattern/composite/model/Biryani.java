package structure.pattern.composite.model;

//leaf component
public class Biryani implements Dish{

	@Override
	public void dishName() {
		System.out.println("Biryani presented!");
	}
}
