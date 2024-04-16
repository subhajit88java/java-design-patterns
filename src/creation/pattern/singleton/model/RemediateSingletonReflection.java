package creation.pattern.singleton.model;

public enum RemediateSingletonReflection {
	INSTANCE;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
