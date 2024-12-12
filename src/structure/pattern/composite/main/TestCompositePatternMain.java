package structure.pattern.composite.main;

import structure.pattern.composite.model.Biryani;
import structure.pattern.composite.model.ChillyChicken;
import structure.pattern.composite.model.ChineeseDish;
import structure.pattern.composite.model.Chowmein;
import structure.pattern.composite.model.FriedRice;
import structure.pattern.composite.model.IndianDish;
import structure.pattern.composite.model.Menu;
import structure.pattern.composite.model.MughlaiParatha;

public class TestCompositePatternMain {

	public static void main(String[] args) {
		
		// Main menu
		Menu menu = new Menu();
		
		//Indian dishes
		IndianDish indianDish = new IndianDish();
		indianDish.addDish(new Biryani("Mutton Biryani"));
		indianDish.addDish(new MughlaiParatha("Chicken Mughlai"));
		indianDish.dishPrice();
		
		//Chineese dishes
		ChineeseDish chineeseDish = new ChineeseDish();
		chineeseDish.addDish(new FriedRice("Mixed Fried Rice"));
		chineeseDish.addDish(new ChillyChicken("Chilly CHicken"));
		chineeseDish.addDish(new Chowmein("Mixed Noodles"));
		chineeseDish.dishPrice();
		
		menu.addDish(indianDish);
		menu.addDish(chineeseDish);
		
		menu.dishPrice();
		
		menu.clearMenu();
		
	}
}

// part-whole hierarchy
// has-a relationship
// Components :
// 1. client
// 2. base component --> interface which will define 
// 3. leaf component --> implementing base component
// 4. composite component --> implementing base component, some additional methods and list of 
// same hierarchy of leaf components
   
