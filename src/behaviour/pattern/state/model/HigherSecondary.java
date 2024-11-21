package behaviour.pattern.state.model;

//State implementation
public class HigherSecondary implements AcademicStage{

	@Override
	public void doLearning() {
		System.out.println("HigherSecondary!");
	}

	@Override
	public AcademicStage nextCourse() {
		return new Graduation();
	}

}
