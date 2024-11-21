package solid.pattern.model;

public class ResourceManager implements Employee {

	@Override
	public void handleSalesDepartment() {
		System.out.println("No action");
	}

	@Override
	public void manageResources() {
		System.out.println("Manager managing resources");
	}

	@Override
	public void developApplications() {
		System.out.println("No action");
	}

}
