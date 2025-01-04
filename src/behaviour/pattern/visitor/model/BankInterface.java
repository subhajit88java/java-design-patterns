package behaviour.pattern.visitor.model;

// Element interface
public interface BankInterface {
	void performOperation(VisitorInterface visitor, BankOperations operation);
}
