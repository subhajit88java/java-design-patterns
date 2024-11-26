package behaviour.pattern.template.model;

// Template
public abstract class TechnologyOnboard {
	
	// template method
	public final void onboardTech() {
		google();
		takeRoughNotes();
		practiceCoding();
		document();
	}
	
	// hook methods
	abstract void practiceCoding();
	abstract void document();
	
	// common methods
	void google() {
		System.out.println("Learn from geek-for-geeks website");
	}
	
	// common methods
	final void takeRoughNotes() {
		System.out.println("Handwritten notes in blank paper");
	}
	

}
