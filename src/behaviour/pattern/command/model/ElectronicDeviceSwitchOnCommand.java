package behaviour.pattern.command.model;

//Concrete command
public class ElectronicDeviceSwitchOnCommand implements CommandInterface{
	
	private ElectronicDeviceInterface electronicDeviceInterface;
	
	public ElectronicDeviceSwitchOnCommand(ElectronicDeviceInterface electronicDeviceInterface) {
		this.electronicDeviceInterface = electronicDeviceInterface;
	}

	@Override
	public void followInstruction() {
		electronicDeviceInterface.switchOn();
	}

}
