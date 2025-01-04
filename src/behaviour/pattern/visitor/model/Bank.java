package behaviour.pattern.visitor.model;

//Concrete Element
public class Bank implements BankInterface{
	
	private String bankName;
	private Double rate;
	
	public Bank(String bankName, Double rate) {
		this.bankName = bankName;
		this.rate = rate;
	}
	
	@Override
	public void performOperation(VisitorInterface visitor, BankOperations operation) {
		visitor.performOperation(this, operation);
	}

	public String getBankName() {
		return bankName;
	}

	public Double getRate() {
		return rate;
	}

}
