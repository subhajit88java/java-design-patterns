package structure.pattern.adaptor.model;

// pojo
public class Human {
	
	private Long height;
	private Long weight;
	private Long runningSpeed;
	private String humanDescription;
	
	public Human(Long height, Long weight, Long runningSpeed) {
		super();
		this.height = height;
		this.weight = weight;
		this.runningSpeed = runningSpeed;
	}

	public String getHumanDescription() {
		return humanDescription;
	}

	public void setHumanDescription(String humanDescription) {
		this.humanDescription = humanDescription;
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Long getRunningSpeed() {
		return runningSpeed;
	}

	public void setRunningSpeed(Long runningSpeed) {
		this.runningSpeed = runningSpeed;
	};
	
	
	
	
}
