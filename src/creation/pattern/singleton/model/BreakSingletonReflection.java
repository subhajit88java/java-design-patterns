package creation.pattern.singleton.model;

public class BreakSingletonReflection {
	
	private static BreakSingletonReflection breakSingletonReflection;
	
	private Integer id;
	
	private BreakSingletonReflection() {}
	
	public static BreakSingletonReflection getInstance() {
		if(breakSingletonReflection == null)
			breakSingletonReflection = new BreakSingletonReflection();
		
		return breakSingletonReflection;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
