package behaviour.pattern.state.model;

// Context
public class CarreerFlow  implements AcademicStage{
	
	private AcademicStage academicStage = new Secondary();

	public void setAcademicStage(AcademicStage academicStage) {
		this.academicStage = academicStage;
	}

	@Override
	public void doLearning() {
		this.academicStage.doLearning();
		this.setAcademicStage(nextCourse());	
	}

	@Override
	public AcademicStage nextCourse() {
		return this.academicStage.nextCourse();
	}
	
}
