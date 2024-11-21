package solid.pattern.model;

// not following "S"
public class TeacherStudent {

	public void registerTeacher(String teacherName) {
		System.out.println("Teacher registered");
	}
	
	public void getTeacherDetails(Integer teacherId) {
		System.out.println("Teacher details fetched");
	}
	
	public void registerStudent(String studentName) {
		System.out.println("student registered");
	}
	
	public void getStudentDetails(Integer studentId) {
		System.out.println("student details fetched");
	}
	
	public void mapTeacherStudent(Integer teacherId, Integer studentName) {
		System.out.println("teacher-student mapped");
	}
}
