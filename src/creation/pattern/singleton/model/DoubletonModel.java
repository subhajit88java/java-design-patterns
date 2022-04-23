package creation.pattern.singleton.model;


public class DoubletonModel {

	private static DoubletonModel doubletonModel;
	private static int count = 0;
	
	private DoubletonModel() {}
	
	public static DoubletonModel getInstance() {
		if(count < 2) {
			doubletonModel = new DoubletonModel();
			count++;
		}
		
		return doubletonModel;
		
	}
	
	public String testMethod() {
		return "This is Doubleton class";
	}
}
