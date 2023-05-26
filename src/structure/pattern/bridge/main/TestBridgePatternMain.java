package structure.pattern.bridge.main;

import structure.pattern.bridge.model.Chicken;
import structure.pattern.bridge.model.Chowmein;
import structure.pattern.bridge.model.FriedRice;
import structure.pattern.bridge.model.MainFood;
import structure.pattern.bridge.model.Prawn;

public class TestBridgePatternMain {

	public static void main(String[] args) {
		MainFood chickenNoodles = new Chowmein(new Chicken());
		chickenNoodles.prepareMainFood();
		
		MainFood prawnFriedRice = new FriedRice(new Prawn());
		prawnFriedRice.prepareMainFood();
	}
}
