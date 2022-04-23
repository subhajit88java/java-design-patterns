package creation.pattern.factory.model;

public class RestaurantFactory {

	public Restaurant getRestaurantDetails(int code) {
		if(code == 1)
			return new Kabuliwala();
		else if(code == 2)
			return new BhojohoriManna();
		else 
			return null;
	}
}
