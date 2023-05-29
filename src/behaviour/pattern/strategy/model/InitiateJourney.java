package behaviour.pattern.strategy.model;

public class InitiateJourney implements Transport{
	
	private Transport transport;

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	@Override
	public void startjourney() {
		this.transport.startjourney();
	}

}
