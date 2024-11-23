package behaviour.pattern.mediator.model;

import java.util.ArrayList;
import java.util.List;

//Concrete mediator
public class MediatorPerson implements MediatorManInterface{
	
	private List<TranslatorInterface> registeredUsers = new ArrayList<>();

	@Override
	public void translate(TranslatorInterface speaker, String originalStatement) {
		for(TranslatorInterface listener : registeredUsers) {
			if(listener.getBaseLanguage() != speaker.getBaseLanguage()) {
				// logic of language conversion based on from and to language parameters
				listener.listen("Statement convereted to listener native language");
			}
		}
		
	}
	
	@Override
	public void registerUser(TranslatorInterface user) {
		registeredUsers.add(user);
	}
	
	

}
