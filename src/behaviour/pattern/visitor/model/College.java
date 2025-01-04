package behaviour.pattern.visitor.model;

//Concrete Element
public class College implements CollegeInterface{
	
	private String collegeName;
	private Long fees;
	
	public College(String collegeName, Long fees) {
		this.collegeName = collegeName;
		this.fees = fees;
	}

	@Override
	public void performOperation(VisitorInterface visitor, CollegeOperations operation) {
		visitor.performOperation(this, operation);
	}

	public String getCollegeName() {
		return collegeName;
	}

	public Long getFees() {
		return fees;
	}
	
	

}
