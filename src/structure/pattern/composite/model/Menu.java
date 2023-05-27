package structure.pattern.composite.model;

import java.util.ArrayList;
import java.util.List;

// composite component
public class Menu implements Dish{

	List<Dish> dishes = new ArrayList<>();
	
	@Override
	public void dishName() {
		for(Dish dish : dishes)
			dish.dishName();
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
