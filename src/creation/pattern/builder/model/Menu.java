package creation.pattern.builder.model;

import java.util.Objects;

public class Menu {

	private String biryani;
	private String rice;
	private String tandoori;
	private String soup;
	private String roti;
	
	private Menu(Order order) {
		this.biryani = order.biryani;
		this.rice = order.rice;
		this.tandoori = order.tandoori;
		this.soup = order.soup;
		this.roti = order.roti;
	}
	
	public static class Order{
		
		private String biryani;
		private String rice;
		private String tandoori;
		private String soup;
		private String roti;
		
		public Order orderBiryani(String name) {
			this.biryani = name;
			return this;
		}
		
		public Order orderRice(String name) {
			this.rice = name;
			return this;
		}
		
		public Order orderTandoori(String name) {
			this.tandoori = name;
			return this;
		}
		
		public Order orderSoup(String name) {
			this.soup = name;
			return this;
		}
		
		public Order orderRoti(String name) {
			this.roti = name;
			return this;
		}
		
		public Menu build() {
			return new Menu(this);
		}
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(Objects.nonNull(biryani))
			sb.append(biryani + "\n");
		if(Objects.nonNull(rice))
			sb.append(rice + "\n");
		if(Objects.nonNull(tandoori))
			sb.append(tandoori + "\n");
		if(Objects.nonNull(soup))
			sb.append(soup + "\n");
		if(Objects.nonNull(roti))
			sb.append(roti + "\n");
		
		return sb.toString();
	}
	
	
}
