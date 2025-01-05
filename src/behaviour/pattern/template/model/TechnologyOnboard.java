package behaviour.pattern.template.model;

// Template
public abstract class TechnologyOnboard {
	
	// template method
	public final void onboardTech() {
		google(); // [shared] child class can override as per need or use the default definition
		takeRoughNotes(); // [shared] mandatory method to be followed by child, no modification permitted
		practiceCoding(); // [non-shared] child has to define its own
		document(); // [non-shared] child has to define its own
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
