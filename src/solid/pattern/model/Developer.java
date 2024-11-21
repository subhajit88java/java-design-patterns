package solid.pattern.model;

public class Developer implements Employee{

	@Override
	public void handleSalesDepartment() {
		System.out.println("No action");
	}

	@Override
	public void manageResources() {
		System.out.println("No action");
	}

	@Override
	public void developApplications() {
		System.out.println("developer developing application");
	}

}
