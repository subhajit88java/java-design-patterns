package behaviour.pattern.chain.model;

public class Dispenser2000 implements Dispenser{

	private Dispenser dispenser;
	
	public Dispenser2000(Dispenser dispenser) {
		this.dispenser = dispenser;
	}
	
	@Override
	public void dispensed(Long amount) {
		Long notes = Math.floorDiv(amount,2000);
		System.out.println(notes + " 2000 notes dispensed!");
		Long remainder = (long) Math.floorMod(amount,2000);
		if(remainder != 0)
			this.dispenser.dispensed(remainder);
	}
	
	
}
