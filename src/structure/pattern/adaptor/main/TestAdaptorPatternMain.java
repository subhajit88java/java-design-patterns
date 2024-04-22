package structure.pattern.adaptor.main;

import structure.pattern.adaptor.model.Human;
import structure.pattern.adaptor.model.LegacyImpl;
import structure.pattern.adaptor.model.ModernHumanAdaptorOne;

// Client
public class TestAdaptorPatternMain {
	
	public static void main(String[] args) {
		
		// legacy interface
		Human legacyHuman = new LegacyImpl()
				.getHumanDescription(6L, 90L, 15L);
		System.out.println("Legacy Human : " + legacyHuman.getHumanDescription());
		
		
		// modern human one
		Human modernHumanOne = new ModernHumanAdaptorOne()
				.getModernHumanDescription(6L, 90L, 15L);
		System.out.println("Modern Human one : " + modernHumanOne.getHumanDescription());
		
		// modern human two
		Human modernHumanTwo = new ModernHumanAdaptorOne()
						.getModernHumanDescription(6L, 90L, 15L);
		System.out.println("Modern Human two : " + modernHumanTwo.getHumanDescription());

		
		
	}

}

// Components of Adapter design pattern :
// 1. Client 
// 2. Target
// 3. Adaptee
// 4. Adapter
