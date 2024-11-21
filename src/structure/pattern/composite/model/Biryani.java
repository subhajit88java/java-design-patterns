package structure.pattern.composite.model;

//leaf component
public class Biryani implements Dish{
	
	private String dishName;
	
	public Biryani(String dishName) {
		this.dishName = dishName;
	} 

	@Override
	public void dishPrice() {
		System.out.println(dishName + " : Rs. 360");
	}
}
