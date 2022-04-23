package creation.pattern.singleton.main;

import creation.pattern.singleton.model.SingletonModel;

public class TestSingletonPattern {

	public static void main(String[] args) {
		
		SingletonModel singletonModelOne = SingletonModel.getInstance();
		System.out.println("singletonModelOne -> ");
		System.out.println(System.identityHashCode(singletonModelOne)+ " - " + singletonModelOne.testMethod());
		
		SingletonModel singletonModelTwo = SingletonModel.getInstance();
		System.out.println("singletonModelTwo -> ");
		System.out.println(System.identityHashCode(singletonModelTwo)+ " - " + singletonModelTwo.testMethod());
	}
}
