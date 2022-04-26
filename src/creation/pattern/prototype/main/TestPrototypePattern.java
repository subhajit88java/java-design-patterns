package creation.pattern.prototype.main;

import creation.pattern.prototype.model.Biryani;

public class TestPrototypePattern {

	public static void main(String[] args) {
		
		Biryani b1 = new Biryani("Basmati", "Jyoti", "Hen", "Chicken");
		System.out.println("b1 : " + b1 + " - " + System.identityHashCode(b1));
		
		Biryani b2 = b1.copy();
		b2.setMeat("Mutton");
		b2.setEgg("Duck");
		System.out.println("b2 : " + b2 + " - " + System.identityHashCode(b2));
		
		Biryani b3 = b1.copy();
		b3.setMeat("Quail");
		System.out.println("b3 : " + b3 + " - " + System.identityHashCode(b3));

	}
}
