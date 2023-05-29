package behaviour.pattern.state.main;

import behaviour.pattern.state.model.*;

public class TestStateMain {
	public static void main(String[] args) {
		CarreerFlow carreerFlow = new CarreerFlow();
		AcademicStage secondary = new Secondary();
		AcademicStage higherSecondary = new HigherSecondary();
		AcademicStage graduation = new Graduation();
		AcademicStage postGraduation = new PostGraduation();
		
		carreerFlow.setAcademicStage(secondary);
		carreerFlow.stage();
		
		carreerFlow.setAcademicStage(higherSecondary);
		carreerFlow.stage();
		
		carreerFlow.setAcademicStage(graduation);
		carreerFlow.stage();
		
		carreerFlow.setAcademicStage(postGraduation);
		carreerFlow.stage();
	}
}
