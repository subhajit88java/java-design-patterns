package solid.pattern.model;

//following "L" as it is not changing the core behavior of the parent class methods
public class NamoBharat extends RajdhaniExpress{

	@Override
	public void kolkataToChennai() {
		// extra loggers
		System.out.println("kolkata to chennai journey started");
	}
	
	@Override
	public void durgapurToKolkata() {
		// extra loggers
		System.out.println("durgapur to kolkata journey started");
	}
	
	public void durgapurToDelhi() {
		System.out.println("durgapur to delhi journey started");
	}
}
