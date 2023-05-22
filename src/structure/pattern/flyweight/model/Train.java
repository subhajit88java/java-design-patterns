package structure.pattern.flyweight.model;

public class Train implements Transport{

	@Override
	public void startJourney(String source, String destination) {
		System.out.println("Train journey started from " + source + " to " + destination);		
	}

}
