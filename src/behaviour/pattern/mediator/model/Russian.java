package behaviour.pattern.mediator.model;

//Colleague
public class Russian implements TranslatorInterface {
	
	private MediatorManInterface mediatorManInterface;
	
	public Russian(MediatorManInterface mediatorManInterface) {
		this.mediatorManInterface = mediatorManInterface;
	}

	@Override
	public void speak(String originalStatement) {
		mediatorManInterface.translate(this, originalStatement);
	}

	@Override
	public void listen(String converetdStatement) {
		System.out.println("Russion listens >> " + converetdStatement);
	}

	@Override
	public Languages getBaseLanguage() {
		return Languages.RUSSIAN;
	}

}
