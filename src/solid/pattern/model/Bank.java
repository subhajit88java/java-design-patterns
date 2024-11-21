package solid.pattern.model;

// not following "O" if openPPFAccount() is added
public class Bank {

	public void openSavingsAccount() {
		System.out.println("savings account opened");
	}
	
	public void closeSavingsAccount() {
		System.out.println("savings account closed");
	}
	
	// after few years an additional feature has been added for initiating PPF fund through bank
	public void openPPFAccount() {
		System.out.println("PPF account opened");
	}
}
