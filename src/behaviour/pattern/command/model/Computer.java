package behaviour.pattern.command.model;

// Receiver
public class Computer implements ElectronicDeviceInterface{

	@Override
	public void switchOn() {
		System.out.println("Computer switched on");
	}

	@Override
	public void switchOff() {
		System.out.println("Computer switched off");
	}

}
