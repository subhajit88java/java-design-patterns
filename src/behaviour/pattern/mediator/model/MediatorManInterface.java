package behaviour.pattern.mediator.model;

// Mediator interface
public interface MediatorManInterface {

	void translate(TranslatorInterface translatorInterface, String originalStatement);
	void registerUser(TranslatorInterface user);
}
