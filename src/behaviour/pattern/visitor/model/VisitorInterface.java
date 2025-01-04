package behaviour.pattern.visitor.model;

// VisitorInterface
public interface VisitorInterface {
	void performOperation(Bank bank, BankOperations operation);
	
	// New operation added for different set of elements
	void performOperation(College college, CollegeOperations operation);
}
