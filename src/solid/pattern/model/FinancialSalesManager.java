package solid.pattern.model;

public class FinancialSalesManager implements SalesManagerInterface{

	@Override
	public void handleSalesDepartment() {
		System.out.println("Sales manager managing financial department");
	}

}
