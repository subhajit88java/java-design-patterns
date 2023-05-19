package creation.pattern.abstractfactory.model;

public class BankFactory implements AbstractFactory{
	public Bank getBankDetails(int code) {
		if(code == 1)
			return new Sbi();
		else if(code == 2)
			return new Icici();
		else 
			return null;
	}

	@Override
	public Restaurant getRestaurantDetails(int code) {
		return null;
	}
}
