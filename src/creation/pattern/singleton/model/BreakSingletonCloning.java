package creation.pattern.singleton.model;

public class BreakSingletonCloning implements Cloneable{
	
	private static BreakSingletonCloning breakSingletonCloning;
	
	private Integer id;
	
	private BreakSingletonCloning() {}
	
	public static BreakSingletonCloning getInstance() {
		if(breakSingletonCloning == null)
			breakSingletonCloning = new BreakSingletonCloning();
		return breakSingletonCloning;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
 
	// Either throw CloneNotSupportedException or return the singleton instance if we want to restrict clone method to break singleton pattern
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		return breakSingletonCloning;
	}

}
