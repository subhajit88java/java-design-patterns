package creation.pattern.singleton.model;

import java.io.Serializable;

public class BreakSingletonDeserialization implements Serializable{

	private static final long serialVersionUID = -5843034894987359855L;

	private static BreakSingletonDeserialization breakSingletonDeserialization;
	
	private Integer id;
	
	private BreakSingletonDeserialization() {}
	
	public static BreakSingletonDeserialization getInstance() {
		if(breakSingletonDeserialization == null){
			breakSingletonDeserialization = new BreakSingletonDeserialization();
		}
		return breakSingletonDeserialization;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	// Need to override this method to stop creating different instances while deserializing
	protected Object readResolve() {
        return breakSingletonDeserialization;
    }
	

}
