package structure.pattern.facade.model;

public class Mumbai implements Destination{

	@Override
	public String destination() {
		return "Mumbai -> Parel";
	}

	@Override
	public String transportType() {
		return "Flight";
	}

}
