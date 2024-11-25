package behaviour.pattern.command.model;

// Receiver
public class Swiggy implements FoodAppInterface {

	@Override
	public void login() {
		System.out.println("Swiggy login successful");
	}

	@Override
	public void selectDishes() {
		System.out.println("Dishes added into cart in swiggy");
	}

	@Override
	public void order() {
		System.out.println("Order initiated in Swiggy");
	}
}
