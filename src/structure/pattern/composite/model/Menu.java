package structure.pattern.composite.model;

import java.util.ArrayList;
import java.util.List;

// composite component
public class Menu implements Dish{

	List<Dish> dishes = new ArrayList<>();
	
	@Override
	public void dishPrice() {
		System.out.println("Main menu ==============> ");
		for(Dish dish : dishes)
			dish.dishPrice();
	}
	
	public void addDish(Dish dish) {
		this.dishes.add(dish);
	}
	
	public void removeDish(Dish dish) {
		this.dishes.remove(dish);
	}
	
	public void clearMenu() {
		this.dishes.clear();
	}

}
