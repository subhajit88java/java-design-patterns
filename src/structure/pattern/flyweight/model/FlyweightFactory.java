package structure.pattern.flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static Map<String, Transport> transportMap = new HashMap<>();

	public static Transport startJourney(String transportType, boolean ac) {
		Transport transport = transportMap.get(transportType);
		if (transport == null) {
			if (transportType.equals("bus"))
				transport = new Bus(ac);
			else if (transportType.equals("train"))
				transport = new Train();
			else
				transport = new Aeroplane();
			transportMap.put(transportType, transport);
		}
		return transport;
	}

}
