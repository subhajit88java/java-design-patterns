package behaviour.pattern.state.main;

import behaviour.pattern.state.model.*;

public class TestStateMain {
	public static void main(String[] args) {
		
		CarreerFlow carreerFlow = new CarreerFlow();
		
		// year 2005
		carreerFlow.doLearning();
		 
		// year 2007
		carreerFlow.doLearning();
		
		// year 2010
		carreerFlow.doLearning();
		
		// year 2011
		carreerFlow.doLearning();
		
		// year 2024
		carreerFlow.doLearning();
		
		// year 2030
		carreerFlow.doLearning();
		
	}
}

//Components :
//1. State interface : declares action signature
//2. Concrete states : implements State interface and define logic based on state. Also contains a method which will push the immediate next state to the context
//3. Context : Contains a reference of state, which is not supplied by Client. It starts with default state and upon each call from client side the logic of the current state is executed and the state is switched by to the next one.
//4. Client : Customer program who wants to call the same method of conext over period of time. As period passes the intrinsic state under context will keep on changing

//Difference between strategy and state patterns :
//1. Structure wise both are same
//2. Intent wise both are different :
//Strategy -> During runtime strategy is supplied by client to the context based on that the execution takes place
//State -> Either the context or the concrete strategies are responsible for the transition from 1 strategy to another. Client doesn't play any role here 

