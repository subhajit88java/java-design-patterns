package structure.pattern.flyweight.model;

public class Bus implements Transport{
	
	private boolean ac;
	
	public Bus(boolean ac) {
		super();
		this.ac = ac;
	}
	
	@Override
	public void startJourney(String source, String destination) {
		if(ac)
			System.out.println("AC Bus journey started from " + source + " to " + destination);
		else
			System.out.println("Non-AC Bus journey started from " + source + " to " + destination);

	}
}
