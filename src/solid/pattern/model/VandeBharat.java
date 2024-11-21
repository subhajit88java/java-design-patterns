package solid.pattern.model;

// not following "L" as it is changing the behavior of the parent class methods
public class VandeBharat extends RajdhaniExpress {
	
	@Override
	public void durgapurToKolkata() {
		throw new NullPointerException();
	}
	
	@Override
	public void kolkataToChennai() {
		System.out.println("kolkata to chennai journey deprecated");
	}
	
	public void durgapurToDelhi() {
		System.out.println("durgapur to delhi journey started");
	}

}
