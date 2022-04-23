package creation.pattern.builder.main;

import creation.pattern.builder.model.Menu;

public class TestBuilderPattern {

	public static void main(String[] args) {
		
		//Menu 1
		Menu menuOne = new Menu.Order()
				.orderBiryani("Chicken Biryani")
				.orderTandoori("Chicken Tandoori Full")
				.build();
		
		System.out.println("Menu 1 : \n" + menuOne);
		
		//Menu 2
		Menu menuTwo = new Menu.Order()
					.orderSoup("Tomato Soup")
					.orderRoti("Rumali Roti")
					.build();
				
		System.out.println("Menu 2 : \n" + menuTwo);
	}
}
