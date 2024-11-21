package structure.pattern.composite.model;

//leaf component
public class FriedRice implements Dish{
	
	private String dishName;
	
	public FriedRice(String dishName) {
		this.dishName = dishName;
	} 
	
	@Override
	public void dishPrice() {
		System.out.println(dishName + " : Rs. 200");
	}
}
