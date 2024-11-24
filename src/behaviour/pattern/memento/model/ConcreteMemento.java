package behaviour.pattern.memento.model;

public class ConcreteMemento implements MementoInterface{
	
	private String content;
	
	public ConcreteMemento(String currentContent) {
		this.content = currentContent;
	}
	

	@Override
	public String getContent() {
		return this.content;
	}

}
