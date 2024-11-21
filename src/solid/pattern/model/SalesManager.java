package solid.pattern.model;

public class SalesManager implements Employee{

	@Override
	public void handleSalesDepartment() {
		System.out.println("sales manager managing sales dept");
	}

	@Override
	public void manageResources() {
		System.out.println("No action");
	}

	@Override
	public void developApplications() {
		System.out.println("No action");
	}

}
