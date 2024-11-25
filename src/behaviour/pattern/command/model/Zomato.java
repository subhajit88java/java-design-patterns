package behaviour.pattern.command.model;

//Receiver
public class Zomato implements FoodAppInterface{

	@Override
	public void login() {
		System.out.println("Zomato login successful");
	}

	@Override
	public void selectDishes() {
		System.out.println("Dishes added into cart in zomato");
	}

	@Override
	public void order() {
		System.out.println("Order initiated in Zomato");
	}

}
