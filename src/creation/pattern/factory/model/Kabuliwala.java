package creation.pattern.factory.model;

public class Kabuliwala implements Restaurant{

	@Override
	public String restaurantAddress() {
		return "Kasba, Kolkata";
	}

	@Override
	public String famousItem() {
		return "Biryani";
	}

	@Override
	public int getRating() {
		return 8;
	}

}
