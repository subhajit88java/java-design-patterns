package behaviour.pattern.strategy.model;

public class Bus implements Transport{

	private int seatNo;
	private int fare;
	
	public Bus(int seatNo, int fare) {
		super();
		this.seatNo = seatNo;
		this.fare = fare;
	}

	@Override
	public void startjourney() {
		System.out.println("Journey started by Bus, seat no : " + seatNo + " fare : " + fare);
	}

}
