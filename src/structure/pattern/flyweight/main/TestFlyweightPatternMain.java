package structure.pattern.flyweight.main;

import structure.pattern.flyweight.model.FlyweightFactory;
import structure.pattern.flyweight.model.Transport;

public class TestFlyweightPatternMain {

	public static void main(String[] args) {
		// Train 1
		Transport train1 = FlyweightFactory.startJourney("train", false);
		System.out.println("Train 1 address : " + System.identityHashCode(train1));
		train1.startJourney("Durgapur", "Kolkata");
		
		// Ac Bus
		Transport acBus = FlyweightFactory.startJourney("bus", true);
		System.out.println("Ac Bus 1 address : " + System.identityHashCode(acBus));
		acBus.startJourney("Durgapur", "Burdwan");
		
		// Aeroplane 1
		Transport aeroplane1 = FlyweightFactory.startJourney("aeroplane", false);
		System.out.println("Aeroplane 1 address : " + System.identityHashCode(aeroplane1));
		aeroplane1.startJourney("Kolkata", "Bangalore");
		
		// Train 2
		Transport train2 = FlyweightFactory.startJourney("train", false);
		System.out.println("Train 2 address : " + System.identityHashCode(train2));
		train2.startJourney("Durgapur", "Asansol");
		
		// Non-ac bus
		Transport nonAcBus = FlyweightFactory.startJourney("bus", true);
		System.out.println("Non Ac Bus 1 address : " + System.identityHashCode(nonAcBus));
		nonAcBus.startJourney("Durgapur", "Panagarh");
		
		// Aeroplane 2
		Transport aeroplane2 = FlyweightFactory.startJourney("aeroplane", false);
		System.out.println("Aeroplane 2 address : " + System.identityHashCode(aeroplane2));
		aeroplane2.startJourney("Kolkata", "Rome");
	}
}
