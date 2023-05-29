package behaviour.pattern.chain.main;

import behaviour.pattern.chain.model.*;

public class TestChainMain {
	
	public static void main(String[] args) {
		
		Dispenser dispenser100 = new Dispenser100();
		Dispenser dispenser200 = new Dispenser200(dispenser100);
		Dispenser dispenser500 = new Dispenser500(dispenser200);
		Dispenser dispenser2000 = new Dispenser2000(dispenser500);
		
		dispenser2000.dispensed(2800L);
		
	}
}
