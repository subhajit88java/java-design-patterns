package structure.pattern.composite.model;

//leaf component
public class Chowmein implements Dish{

	private String dishName;
	
	public Chowmein(String dishName) {
		this.dishName = dishName;
	} 
	
	@Override
	public void dishPrice() {
		System.out.println(dishName + " : Rs. 180");
	}

}
