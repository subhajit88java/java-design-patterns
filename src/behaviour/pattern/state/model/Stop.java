package behaviour.pattern.state.model;

public class Stop  implements AcademicStage{

	@Override
	public void doLearning() {
		System.out.println("Enough study, now stop!");
	}

	@Override
	public AcademicStage nextCourse() {
		return this;
	}

}
