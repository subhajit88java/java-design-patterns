package creation.pattern.singleton.model;

public class SingletonModel {

	private static SingletonModel singletonModel;
	
	private SingletonModel() {}
	
	public static SingletonModel getInstance() {
		if(singletonModel == null)
			singletonModel = new SingletonModel();
		return singletonModel;
	}
	
	public String testMethod() {
		return "This is Singleton class";
	}
	
}
