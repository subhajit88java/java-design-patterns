package creation.pattern.abstractfactory.model;

public class Icici implements Bank{
	@Override
	public String bankAddress() {
		return "City Centre, Durgapur";
	}

	@Override
	public String bankType() {
		return "Private";
	}

	@Override
	public int getRating() {
		return 2;
	}
}
