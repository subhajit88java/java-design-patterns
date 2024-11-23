package behaviour.pattern.mediator.model;

// Colleague interface
public interface TranslatorInterface {
	void speak(String originalStatement);
	void listen(String statement);
	Languages getBaseLanguage();
}
