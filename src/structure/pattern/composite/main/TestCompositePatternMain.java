package structure.pattern.composite.main;

import structure.pattern.composite.model.Biryani;
import structure.pattern.composite.model.ChillyChicken;
import structure.pattern.composite.model.Chowmein;
import structure.pattern.composite.model.FriedRice;
import structure.pattern.composite.model.Menu;
import structure.pattern.composite.model.MughlaiParatha;

public class TestCompositePatternMain {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.addDish(new Chowmein());
		menu.addDish(new Biryani());
		menu.addDish(new FriedRice());
		menu.addDish(new ChillyChicken());
		menu.addDish(new MughlaiParatha());
		menu.dishName();
		
		menu.clearMenu();
		menu.dishName();
		
	}
}
