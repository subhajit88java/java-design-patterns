package behaviour.pattern.command.model;

// Invoker
public class Robot {
	
	private CommandInterface command;

	public void setCommand(CommandInterface command) {
		this.command = command;
	}
	
	public void initiateCommand() {
		command.followInstruction();
	}

}
