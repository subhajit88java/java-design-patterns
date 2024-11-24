package behaviour.pattern.memento.model;

public class Originator {
	
	private String content = "";
	private Caretaker caretaker;
	
	public Originator() {
		this.caretaker = new Caretaker();
	}
	
	public void addContent(String currentContent) {
		content = content + " - " + currentContent;
	}
	
	public void save() {
		this.caretaker.save(new ConcreteMemento(this.content));
		System.out.println("Content has been saved!!");
	}
	
	public void rollback() {
		MementoInterface savedContent = this.caretaker.rollback();
		if(savedContent != null)
				this.content = savedContent.getContent();
		else
			this.content = "";
	}
	
	public String getContent() {
		return content;
	}
}
