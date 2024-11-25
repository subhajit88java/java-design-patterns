package behaviour.pattern.command.model;

//Concrete command
public class FoodAppCartCommand implements CommandInterface {
	
	private FoodAppInterface foodAppInterface;
	
	public FoodAppCartCommand(FoodAppInterface foodAppInterface) {
		this.foodAppInterface = foodAppInterface;
	}

	@Override
	public void followInstruction() {
		foodAppInterface.selectDishes();
	}

}

