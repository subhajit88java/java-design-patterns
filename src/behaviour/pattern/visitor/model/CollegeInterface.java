package behaviour.pattern.visitor.model;

// Element interface
public interface CollegeInterface {
	void performOperation(VisitorInterface visitor, CollegeOperations operation);
}
