package behaviour.pattern.state.model;

//State implementation
public class PostGraduation implements AcademicStage{
	@Override
	public void doLearning() {
		System.out.println("PostGraduation!");
	}

	@Override
	public AcademicStage nextCourse() {
		return new Stop();
	}
}
