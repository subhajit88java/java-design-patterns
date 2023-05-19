package creation.pattern.abstractfactory.main;

import creation.pattern.abstractfactory.model.AbstractFactory;
import creation.pattern.abstractfactory.model.Bank;
import creation.pattern.abstractfactory.model.FactorySupplier;
import creation.pattern.abstractfactory.model.Restaurant;

public class TestAbstractFactoryPattern {

	public static void main(String[] args) {

		FactorySupplier factorySupplier = new FactorySupplier();

		// Bank Factory
		AbstractFactory abstractFactory1 = factorySupplier.getFactory(1);
		// Banks
		Bank bank1 = abstractFactory1.getBankDetails(1);
		System.out.println("Bank 1 ->");
		System.out.println("Bank Address : " + bank1.bankAddress());
		System.out.println("Bank Type : " + bank1.bankType());
		System.out.println("bank Rating : " + bank1.getRating());

		Bank bank2 = abstractFactory1.getBankDetails(1);
		System.out.println("Bank 2 ->");
		System.out.println("Bank Address : " + bank2.bankAddress());
		System.out.println("Bank Type : " + bank2.bankType());
		System.out.println("bank Rating : " + bank2.getRating());

		
		// Restaurant Factory
		AbstractFactory abstractFactory2 = factorySupplier.getFactory(2);
		// Restaurants
		Restaurant restaurant1 = abstractFactory2.getRestaurantDetails(1);
		System.out.println("Restaurant 1 ->");
		System.out.println("Address : " + restaurant1.restaurantAddress());
		System.out.println("Famous Item : " + restaurant1.famousItem());
		System.out.println("Rating : " + restaurant1.getRating());
		
		Restaurant restaurant2 = abstractFactory2.getRestaurantDetails(2);
		System.out.println("Restaurant 2 ->");
		System.out.println("Address : " + restaurant2.restaurantAddress());
		System.out.println("Famous Item : " + restaurant2.famousItem());
		System.out.println("Rating : " + restaurant2.getRating());

	}

}
