package behaviour.pattern.mediator.model;

//Colleague
public class Indian implements TranslatorInterface {
	
	private MediatorManInterface mediatorManInterface;
	
	public Indian(MediatorManInterface mediatorManInterface) {
		this.mediatorManInterface = mediatorManInterface;
	}

	@Override
	public void speak(String originalStatement) {
		mediatorManInterface.translate(this, originalStatement);
	}

	@Override
	public void listen(String statement) {
		System.out.println("Indian listens >> " + statement);
	}
	
	@Override
	public Languages getBaseLanguage() {
		return Languages.HINDI;
	}

}

