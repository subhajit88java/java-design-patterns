package behaviour.pattern.visitor.model;

// VisitorInterface
public interface VisitorInterface {
	void calculateInterest(Bank bank);
	
	// Modification during a said timing
	void showFees(College college);
}
