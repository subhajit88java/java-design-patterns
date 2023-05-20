package structure.pattern.facade.model;

public class Kolkata implements Destination{

	@Override
	public String destination() {
		return "Kolkata -> Nayabad";
	}

	@Override
	public String transportType() {
		return "Bus";
	}

}
