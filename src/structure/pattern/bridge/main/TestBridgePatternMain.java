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

// Components :
// 1. Abstraction -- abstract class having 'has-a' relationship with  the implementer
// 2. Implementer -- interface
// 3. Refined abstraction -- implementation of the abstraction
// 4. Concrete Implementation -- implementation of the implementer

// Has-a relationship
// There are 2 categories of entities.
// There are n number of implementations/objects of each category
// If we need to establish a relationship between each and every objects belonging from each categories then 
// we need to create n-combinations for each category-pair, which is very hectic.
// Bridge design pattern allows the categories to independently develop their implementations.
// With has-a relationship approach bridge is established between any combinations of the 2 categories.
