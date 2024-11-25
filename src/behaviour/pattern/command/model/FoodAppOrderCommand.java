package behaviour.pattern.command.model;

//Concrete command
public class FoodAppOrderCommand implements CommandInterface {
	
	private FoodAppInterface foodAppInterface;
	
	public FoodAppOrderCommand(FoodAppInterface foodAppInterface) {
		this.foodAppInterface = foodAppInterface;
	}

	@Override
	public void followInstruction() {
		foodAppInterface.order();
	}

}

