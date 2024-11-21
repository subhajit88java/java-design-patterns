package structure.pattern.composite.model;

// leaf component
public class MughlaiParatha implements Dish{

	private String dishName;
	
	public MughlaiParatha(String dishName) {
		this.dishName = dishName;
	} 
	
	@Override
	public void dishPrice() {
		System.out.println(dishName + " : Rs. 150");
	}

}
