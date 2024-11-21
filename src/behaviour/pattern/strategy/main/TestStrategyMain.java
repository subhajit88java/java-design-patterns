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
		// Customer wants to travel by bus
		journey.setTransport(bus);
		journey.startjourney();
		
		// Customer wants to travel by train
		journey.setTransport(train);
		journey.startjourney();
	}
}

// Components :
// 1. Strategy interface : declares action signature
// 2. Concrete strategies : implements Strategy interface and define strategy algorithm 
// 3. Context : Contains a reference of strategy, which is supplied by Client as per need. Context just delegates the client call to the appropriate strategy implementation
// 4. Client : Customer program who wants to implemnet a strategy as per need. It supplies strategy to teh context which in turn delegates the call to the given strategy

// Difference between strategy and state patterns :
// 1. Structure wise both are same
// 2. Intent wise both are different :
// Strategy -> During runtime strategy is supplied by client to the context based on that the execution takes place
// State -> Either the context or the concrete strategies are responsible for the transition from 1 strategy to another. CLient doesn't play any role here 
