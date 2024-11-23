package behaviour.pattern.mediator.model;

//Colleague
public class Italian implements TranslatorInterface {
	
	private MediatorManInterface mediatorManInterface;
	
	public Italian(MediatorManInterface mediatorManInterface) {
		this.mediatorManInterface = mediatorManInterface;
	}

	@Override
	public void speak(String originalStatement) {
		mediatorManInterface.translate(this, originalStatement);
	}

	@Override
	public void listen(String statement) {
		System.out.println("Italian listens >> " + statement);
	}
	
	@Override
	public Languages getBaseLanguage() {
		return Languages.ITALIAN;
	}

}


