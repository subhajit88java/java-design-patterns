package structure.pattern.facade.model;

public class DestinationProvider {

	public String getDestination(String name) {
		switch (name) {
		case "KOLKATA": {
			Kolkata kolkata = new Kolkata();
			return kolkata.destination() + " :: " + kolkata.transportType();
		}
		case "MUMBAI": {
			Mumbai mumbai = new Mumbai();
			return mumbai.destination() + " :: " + mumbai.transportType();
		}
		default:
			return "Wrong destination";
		}
	}
}
