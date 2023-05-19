package creation.pattern.abstractfactory.model;

public class BhojohoriManna implements Restaurant{

	@Override
	public String restaurantAddress() {
		return "Salt Lake, Kolkata";
	}

	@Override
	public String famousItem() {
		return "Daab Chingri";
	}

	@Override
	public int getRating() {
		return 7;
	}

}
