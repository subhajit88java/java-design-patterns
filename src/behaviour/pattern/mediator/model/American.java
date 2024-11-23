package behaviour.pattern.mediator.model;

//Colleague
public class American implements TranslatorInterface {
	
	private MediatorManInterface mediatorManInterface;
	
	public American(MediatorManInterface mediatorManInterface) {
		this.mediatorManInterface = mediatorManInterface;
	}

	@Override
	public void speak(String originalStatement) {
		mediatorManInterface.translate(this, originalStatement);
	}

	@Override
	public void listen(String statement) {
		System.out.println("American listens >> " + statement);
	}
	
	@Override
	public Languages getBaseLanguage() {
		return Languages.ENGLISH;
	}

}

