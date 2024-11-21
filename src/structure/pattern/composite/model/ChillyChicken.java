package structure.pattern.composite.model;

//leaf component
public class ChillyChicken implements Dish{
	
	private String dishName;
	
	public ChillyChicken(String dishName) {
		this.dishName = dishName;
	} 
	
	@Override
	public void dishPrice() {
		System.out.println(dishName + " : Rs. 200");
	}
}
