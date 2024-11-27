package behaviour.pattern.visitor.model;

public class College implements CollegeInterface{
	
	private String collegeName;
	private Long fees;
	
	public College(String collegeName, Long fees) {
		this.collegeName = collegeName;
		this.fees = fees;
	}

	@Override
	public void showFees(VisitorInterface visitor) {
		visitor.showFees(this);
	}

	public String getCollegeName() {
		return collegeName;
	}

	public Long getFees() {
		return fees;
	}
	
	

}
