package structure.pattern.proxy.model;

public class CockpitSecurityProxy {
	
	private Cockpit cockpit = new CockpitEntry();
	
	public void cockpitEntry(String employeeType) {
		if(employeeType.equals("pilot"))
			cockpit.enterIntoCockpit();
		else
			System.out.println("Entry not permitted!");
	}

}
