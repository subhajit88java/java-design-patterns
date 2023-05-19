package creation.pattern.abstractfactory.model;

public class RestaurantFactory implements AbstractFactory{

	@Override
	public Bank getBankDetails(int code) {
		return null;
	}

	@Override
	public Restaurant getRestaurantDetails(int code) {
		if(code == 1)
			return new Kabuliwala();
		else if(code == 2)
			return new BhojohoriManna();
		else 
			return null;
	}
}
