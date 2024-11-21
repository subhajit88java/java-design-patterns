package structure.pattern.adaptor.model;

// Class adapter
public class ModernHumanAdaptorOne extends LegacyImpl implements ModernInterface{
	
	@Override
	public Human getHumanDescription(Long height, Long weight, Long speed) {
		Human human =  super.getHumanDescription(height, weight, speed);
		Long convertedHeight = convertToMeter(human.getHeight());
		Long convertedWeight = convertToKg(human.getWeight());
		Long convertedSpeed = convertToKmPerHour(human.getRunningSpeed());
		
		human.setHeight(convertedHeight);
		human.setWeight(convertedWeight);
		human.setRunningSpeed(convertedSpeed);
		human.setHumanDescription("Height -> " + convertedHeight + " meter, Weight -> " + convertedWeight + " kg, runningSpeed " + convertedSpeed + " km/hr");
		return human;
	}

	private Long convertToKg(Long weight) {
		return (long) (0.453592 * weight);
	}

	private Long convertToKmPerHour(Long speed) {
		return (long) (1.60934 * speed);
	}

	private Long convertToMeter(Long height) {
		return (long) (0.3048 * height);
	}

}
