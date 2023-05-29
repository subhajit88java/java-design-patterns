package behaviour.pattern.chain.model;

public class Dispenser100 implements Dispenser{
	private Dispenser dispenser;
	
	@Override
	public void dispensed(Long amount) {
		Long notes = Math.floorDiv(amount,100);
		System.out.println(notes + " 100 notes dispensed!");
	}
}
