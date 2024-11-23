package behaviour.pattern.mediator.main;

import behaviour.pattern.mediator.model.American;
import behaviour.pattern.mediator.model.Indian;
import behaviour.pattern.mediator.model.Italian;
import behaviour.pattern.mediator.model.MediatorManInterface;
import behaviour.pattern.mediator.model.MediatorPerson;
import behaviour.pattern.mediator.model.Russian;
import behaviour.pattern.mediator.model.TranslatorInterface;

public class MediatorPatternMain {
	
	public static void main(String[] args) {
		MediatorManInterface mediatorManInterface = new MediatorPerson();
		
		
		TranslatorInterface russion = new Russian(mediatorManInterface);
		TranslatorInterface american = new American(mediatorManInterface);
		TranslatorInterface italian = new Italian(mediatorManInterface);
		
		// User registered during start of debate
		mediatorManInterface.registerUser(italian);
		mediatorManInterface.registerUser(american);
		mediatorManInterface.registerUser(russion);
		
		// Russian speaks
		russion.speak("Raw russian statement");
		
		// Italian speaks
		italian.speak("Raw italian statement");
		
		// Indian joins
		TranslatorInterface indian = new Indian(mediatorManInterface);
		mediatorManInterface.registerUser(indian);
		
		// American speaks
		american.speak("This is english");
		
		
	}

}

// Components
// 1. Client
// 2. Mediator interface
// 3. Concrete mediator
// 4. Collegue interface
// 5. Concrete collegues
