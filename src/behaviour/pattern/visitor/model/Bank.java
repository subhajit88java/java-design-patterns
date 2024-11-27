package behaviour.pattern.visitor.model;

//Concrete Item
public class Bank implements BankInterface{
	
	private String bankName;
	private Double rate;
	
	public Bank(String bankName, Double rate) {
		this.bankName = bankName;
		this.rate = rate;
	}
	
	@Override
	public void calculateInterest(VisitorInterface visitor) {
		visitor.calculateInterest(this);
	}

	public String getBankName() {
		return bankName;
	}

	public Double getRate() {
		return rate;
	}

}
