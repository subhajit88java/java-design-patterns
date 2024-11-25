package behaviour.pattern.command.model;

//Concrete command
public class FoodAppLoginCommand implements CommandInterface {
	
	private FoodAppInterface foodAppInterface;
	
	public FoodAppLoginCommand(FoodAppInterface foodAppInterface) {
		this.foodAppInterface = foodAppInterface;
	}

	@Override
	public void followInstruction() {
		foodAppInterface.login();
	}

}
