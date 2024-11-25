package behaviour.pattern.command.main;

import behaviour.pattern.command.model.CommandInterface;
import behaviour.pattern.command.model.Computer;
import behaviour.pattern.command.model.ElectronicDeviceInterface;
import behaviour.pattern.command.model.ElectronicDeviceSwitchOffCommand;
import behaviour.pattern.command.model.ElectronicDeviceSwitchOnCommand;
import behaviour.pattern.command.model.FoodAppCartCommand;
import behaviour.pattern.command.model.FoodAppInterface;
import behaviour.pattern.command.model.FoodAppLoginCommand;
import behaviour.pattern.command.model.FoodAppOrderCommand;
import behaviour.pattern.command.model.Robot;
import behaviour.pattern.command.model.Swiggy;
import behaviour.pattern.command.model.Television;
import behaviour.pattern.command.model.Zomato;

public class CommandPatternMain {

	public static void main(String[] args) {
		
		// Create robot
		Robot robot = new Robot();
		
		// Create concrete receivers
		ElectronicDeviceInterface computer = new Computer();
		ElectronicDeviceInterface television = new Television();
		
		FoodAppInterface zomato = new Zomato();
		FoodAppInterface swiggy = new Swiggy();
		
		// Create commands
		CommandInterface switchOnComputer = new ElectronicDeviceSwitchOnCommand(computer);
		CommandInterface switchOffComputer = new ElectronicDeviceSwitchOffCommand(computer);
		CommandInterface switchOnTv = new ElectronicDeviceSwitchOnCommand(television);
		CommandInterface switchOffTv = new ElectronicDeviceSwitchOffCommand(television);

		CommandInterface zomatoLogin = new FoodAppLoginCommand(zomato);
		CommandInterface zomatoCart = new FoodAppCartCommand(zomato);
		CommandInterface zomatoOrder = new FoodAppOrderCommand(zomato);
		
		CommandInterface swiggyLogin = new FoodAppLoginCommand(swiggy);
		CommandInterface swiggyCart = new FoodAppCartCommand(swiggy);
		CommandInterface swiggyOrder = new FoodAppOrderCommand(swiggy);
		
		// Ask robot to perform actions
		robot.setCommand(switchOnComputer);
		robot.initiateCommand();
		
		robot.setCommand(switchOffComputer);
		robot.initiateCommand();
		
		robot.setCommand(switchOnTv);
		robot.initiateCommand();
		
		robot.setCommand(switchOffTv);
		robot.initiateCommand();
		
		robot.setCommand(zomatoLogin);
		robot.initiateCommand();
		
		robot.setCommand(zomatoCart);
		robot.initiateCommand();
		
		robot.setCommand(zomatoOrder);
		robot.initiateCommand();
		
		robot.setCommand(swiggyLogin);
		robot.initiateCommand();
		
		robot.setCommand(swiggyCart);
		robot.initiateCommand();
		
		robot.setCommand(swiggyOrder);
		robot.initiateCommand();
		
		
	}
}

// Items 
// 1. Command 
// 2. Receiver
// 3. Invoker
// 4. Client
