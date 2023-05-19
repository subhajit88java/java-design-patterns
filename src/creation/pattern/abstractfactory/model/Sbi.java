package creation.pattern.abstractfactory.model;

public class Sbi implements Bank{

	@Override
	public String bankAddress() {
		return "Shyampur, Durgapur";
	}

	@Override
	public String bankType() {
		return "Govt";
	}

	@Override
	public int getRating() {
		return 1;
	}

}
