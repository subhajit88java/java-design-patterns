package behaviour.pattern.state.model;

public class CarreerFlow  implements AcademicStage{
	
	private AcademicStage academicStage;

	public void setAcademicStage(AcademicStage academicStage) {
		this.academicStage = academicStage;
	}

	@Override
	public void stage() {
		this.academicStage.stage();
	}
	
}
