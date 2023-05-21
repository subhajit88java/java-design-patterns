package structure.pattern.proxy.model;

public class CockpitEntry implements Cockpit{

	@Override
	public void enterIntoCockpit() {
		System.out.println("Entered into cockpit!");		
	}

}
