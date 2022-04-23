package creation.pattern.factory.main;

import creation.pattern.factory.model.Restaurant;
import creation.pattern.factory.model.RestaurantFactory;

public class TestFactoryPattern {

	public static void main(String[] args) {
		
		// Restaurant 1
		Restaurant restaurantOne = new RestaurantFactory().getRestaurantDetails(1);
		System.out.println("Restaurant 1 ->");
		System.out.println("Address : " + restaurantOne.restaurantAddress());
		System.out.println("Famous Item : " + restaurantOne.famousItem());
		System.out.println("Rating : " + restaurantOne.getRating());
		
		// Restaurant 2
		Restaurant restaurantTwo = new RestaurantFactory().getRestaurantDetails(2);
		System.out.println("Restaurant 2 ->");
		System.out.println("Address : " + restaurantTwo.restaurantAddress());
		System.out.println("Famous Item : " + restaurantTwo.famousItem());
		System.out.println("Rating : " + restaurantTwo.getRating());
	}
}
