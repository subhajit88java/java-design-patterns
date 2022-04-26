package creation.pattern.prototype.model;

public class Biryani{
	
	private String rice;
	private String potato;
	private String egg;
	private String meat;
	
	public Biryani(){}

	public Biryani(String rice, String potato, String egg, String meat) {
		super();
		this.rice = rice;
		this.potato = potato;
		this.egg = egg;
		this.meat = meat;
	}


	public Biryani copy() {
		Biryani biryaniClone = new Biryani(this.rice, this.potato, this.egg, this.meat);
		return biryaniClone;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getPotato() {
		return potato;
	}

	public void setPotato(String potato) {
		this.potato = potato;
	}

	public String getEgg() {
		return egg;
	}

	public void setEgg(String egg) {
		this.egg = egg;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	@Override
	public String toString() {
		return "Biryani [rice=" + rice + ", potato=" + potato + ", egg=" + egg + ", meat=" + meat + "]";
	}

	
	
}
