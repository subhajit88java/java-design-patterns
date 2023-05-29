package behaviour.pattern.chain.model;

public class Dispenser500 implements Dispenser{
	
	private Dispenser dispenser;
	
	public Dispenser500(Dispenser dispenser) {
		this.dispenser = dispenser;
	}
	
	@Override
	public void dispensed(Long amount) {
		Long notes = Math.floorDiv(amount,500);
		System.out.println(notes + " 500 notes dispensed!");
		Long remainder = (long) Math.floorMod(amount,500);
		if(remainder != 0)
			this.dispenser.dispensed(remainder);
	}
}
