package structure.pattern.adaptor.model;

public class LegacyImpl implements LegacyInterface{

	@Override
	public Human getHumanDescription(Long height, Long weight, Long speed) {
		Human human =  new Human(height, weight, speed);
		human.setHumanDescription("Height -> " + height + " feet, Weight -> " + weight + " lb, runningSpeed " + speed + " miles/hr");
		return human;
	}

}
