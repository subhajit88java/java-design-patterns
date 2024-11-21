package behaviour.pattern.state.model;

// State interface
public interface AcademicStage {
	void doLearning();
	AcademicStage nextCourse();
}
