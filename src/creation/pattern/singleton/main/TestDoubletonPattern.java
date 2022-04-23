package creation.pattern.singleton.main;

import creation.pattern.singleton.model.DoubletonModel;

public class TestDoubletonPattern {

public static void main(String[] args) {
		
		DoubletonModel doubletonModelOne = DoubletonModel.getInstance();
		System.out.println("doubletonModelOne -> ");
		System.out.println(System.identityHashCode(doubletonModelOne)+ " - " + doubletonModelOne.testMethod());
		
		DoubletonModel doubletonModelTwo = DoubletonModel.getInstance();
		System.out.println("singletonModelTwo -> ");
		System.out.println(System.identityHashCode(doubletonModelTwo)+ " - " + doubletonModelTwo.testMethod());
		
		DoubletonModel doubletonModelThree = DoubletonModel.getInstance();
		System.out.println("doubletonModelThree -> ");
		System.out.println(System.identityHashCode(doubletonModelThree)+ " - " + doubletonModelThree.testMethod());
	}
}
