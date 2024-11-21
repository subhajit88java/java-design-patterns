package behaviour.pattern.state.model;

// State implementation
public class Graduation implements AcademicStage{
	@Override
	public void doLearning() {
		System.out.println("Graduation!");
	}

	@Override
	public AcademicStage nextCourse() {
		return new PostGraduation();
	}
}
