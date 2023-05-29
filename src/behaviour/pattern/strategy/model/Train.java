package behaviour.pattern.strategy.model;

public class Train  implements Transport{

	private int coachNo;
	private int seatNo;
	private int fare;
	
	public Train(int coachNo, int seatNo, int fare) {
		super();
		this.coachNo = coachNo;
		this.seatNo = seatNo;
		this.fare = fare;
	}

	@Override
	public void startjourney() {
		System.out.println("Journey started by Train, coach no : " + coachNo + " seat no : " + seatNo + " fare : " + fare);		
	}

}
