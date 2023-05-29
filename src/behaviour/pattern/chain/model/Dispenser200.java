package behaviour.pattern.chain.model;

public class Dispenser200 implements Dispenser{

	private Dispenser dispenser;
	
	public Dispenser200(Dispenser dispenser) {
		this.dispenser = dispenser;
	}
	
	@Override
	public void dispensed(Long amount) {
		Long notes = Math.floorDiv(amount,200);
		System.out.println(notes + " 200 notes dispensed!");
		Long remainder = (long) Math.floorMod(amount,200);
		if(remainder != 0)
			this.dispenser.dispensed(remainder);
	}
}
