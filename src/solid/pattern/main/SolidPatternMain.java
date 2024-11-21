package solid.pattern.main;

import solid.pattern.model.*;

public class SolidPatternMain {

	public static void main(String[] args) {
		S(); // Single responsibility principle
		O(); // Open-closed principle
		L(); // Liskov's substitution principle
		I(); // Interface segregation principle
		D(); // Dependency injection principle
	}

	private static void D() {
		// TODO Auto-generated method stub
		
	}

	private static void I() {
		
		// flow not following "I"
		Employee developer = new Developer();
		developer.developApplications();
		developer.handleSalesDepartment();
		developer.manageResources();
		
		// flow following "I"
		DeveloperInterface dev = new JavaDeveloper();
		dev.developApplications();
		
		ResourceManagerInterface resManager = new PortfolioManager();
		resManager.manageResources();
		
		SalesManagerInterface salesManager = new FinancialSalesManager();
		salesManager.handleSalesDepartment();
	}

	private static void L() {
		
		// Flow not following Liskov's substitution
		RajdhaniExpress rajdhani = new RajdhaniExpress();
		rajdhani.durgapurToKolkata();
		rajdhani.kolkataToChennai();
		
		// RajdhaniExpress class withdrawn from library and client requested to use VandeBharat
		VandeBharat vandeBharat = new VandeBharat();
		vandeBharat.durgapurToDelhi(); // behavior changed
		vandeBharat.kolkataToChennai(); // behavior changed
		vandeBharat.durgapurToDelhi(); // additional feature
		
		// Flow following Liskov's substitution
		// RajdhaniExpress class withdrawn from library and client requested to use VandeBharat
		NamoBharat namoBharat = new NamoBharat();
		namoBharat.durgapurToDelhi(); // core behavior not changed
		namoBharat.kolkataToChennai(); // core behavior not changed
		namoBharat.durgapurToDelhi(); // additional feature
		
	}

	// "O" stands for open for extension but closed for modification
	private static void O() {
		
		// Flow not following open-closed principle
		Bank bank = new Bank();
		bank.openSavingsAccount();
		bank.closeSavingsAccount();
		bank.openPPFAccount(); // Addition of any extra feature to the existing one can be a cause of risk
		
		// Flow following open-closed principle
		Bank b = new Bank();
		b.openSavingsAccount();
		b.closeSavingsAccount();
		
		Bank2 bank2 = new Bank2(); // For the  extra feature a child class can be created 
		bank2.openPPFAccount();
		
		// OR
		Bank2 b2 = new Bank2();
		b2.openSavingsAccount();
		b2.closeSavingsAccount();
		b2.openPPFAccount();
	}

	// "S" pattern says that each and every class should have unique responsibility
	// This is equivalent to normalization concept of database design
	private static void S() {
		
		// Flow not following single responsibility pattern
		TeacherStudent teacherStudent = new TeacherStudent();
		teacherStudent.registerTeacher("JMG");
		teacherStudent.registerStudent("Subhajit");
		teacherStudent.mapTeacherStudent(10, 20);
		
		// Flow following single responsibility pattern
		Teacher teacher = new Teacher();
		teacher.registerTeacher("JMG");
		
		Student student = new Student();
		student.registerStudent("Subhajit");
		
		TeacherStudentMapping mapping = new TeacherStudentMapping();
		mapping.mapTeacherStudent(10, 20);
		
	}
}
