package structure.pattern.flyweight.model;

public class Aeroplane implements Transport{
	@Override
	public void startJourney(String source, String destination) {
		System.out.println("Aeroplane journey started from " + source + " to " + destination);		
	}
}
