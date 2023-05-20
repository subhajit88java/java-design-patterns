package structure.pattern.facade.main;

import structure.pattern.facade.model.DestinationProvider;

public class TestFacadePattern {
	
public static void main(String[] args) {
	DestinationProvider destinationProvider  = new DestinationProvider();
	System.out.println("1st destination : " + destinationProvider.getDestination("KOLKATA"));
	System.out.println("2nd destination : " + destinationProvider.getDestination("MUMBAI"));
}
}
