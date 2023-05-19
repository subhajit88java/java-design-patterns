package creation.pattern.abstractfactory.model;

public class FactorySupplier {
	public AbstractFactory getFactory(int code) {
		if(code == 1)
			return new BankFactory();
		else if(code == 2)
			return new RestaurantFactory();
		else 
			return null;
	}
}
