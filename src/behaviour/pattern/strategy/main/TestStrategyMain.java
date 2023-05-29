package behaviour.pattern.strategy.main;

import behaviour.pattern.strategy.model.Bus;
import behaviour.pattern.strategy.model.InitiateJourney;
import behaviour.pattern.strategy.model.Train;
import behaviour.pattern.strategy.model.Transport;

public class TestStrategyMain {

	public static void main(String[] args) {
		Transport bus = new Bus(10, 500);
		Transport train = new Train(2, 53, 200);
		
		
		InitiateJourney journey = new InitiateJourney();
		journey.setTransport(bus);
		journey.startjourney();
		
		journey.setTransport(train);
		journey.startjourney();
	}
}
