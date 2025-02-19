package behaviour.pattern.state.model;

//Concrete state
public class Secondary implements AcademicStage{

	@Override
	public void doLearning() {
		System.out.println("Secondary!");
	}

	@Override
	public AcademicStage nextCourse() {
		return new HigherSecondary();
	}
	
}
