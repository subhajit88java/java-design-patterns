package behaviour.pattern.command.model;

// Concrete command
public class ElectronicDeviceSwitchOffCommand implements CommandInterface{
	
	private ElectronicDeviceInterface electronicDeviceInterface;
	
	public ElectronicDeviceSwitchOffCommand(ElectronicDeviceInterface electronicDeviceInterface) {
		this.electronicDeviceInterface = electronicDeviceInterface;
	}

	@Override
	public void followInstruction() {
		electronicDeviceInterface.switchOff();
	}

}
