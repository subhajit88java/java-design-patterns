package behaviour.pattern.command.model;

//Receiver
public class Television implements ElectronicDeviceInterface{

	@Override
	public void switchOn() {
		System.out.println("Television switched on");
	}

	@Override
	public void switchOff() {
		System.out.println("Television switched off");
	}

}
