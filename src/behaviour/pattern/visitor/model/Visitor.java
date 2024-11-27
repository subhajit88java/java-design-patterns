package behaviour.pattern.visitor.model;

// Visitor
public class Visitor implements VisitorInterface{

	@Override
	public void calculateInterest(Bank bank) {
		System.out.println("Interest of bank : " + bank.getBankName() + " is : " + bank.getRate());
	}

	@Override
	public void showFees(College college) {
		System.out.println("Fees of college : " + college.getCollegeName() + " is : " + college.getFees());

	}

}
