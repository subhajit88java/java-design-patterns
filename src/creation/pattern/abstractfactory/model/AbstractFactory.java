package creation.pattern.abstractfactory.model;

public interface AbstractFactory {
	Bank getBankDetails(int code);
	Restaurant getRestaurantDetails(int code);
}
