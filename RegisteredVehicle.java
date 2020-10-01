package buoi9;

public abstract class RegisteredVehicle {
	private String tag;
	private String name;
	private String owner;
	
	public RegisteredVehicle(String tag, String name, String owner) {
		this.tag = tag;
		this.name = name;
		this.owner = owner;
	}
	
	
	
	public void printRegistration() {
		System.out.println(getTag() + " " + getName() + " " + getOwner() );
	}
	
	public String getTag() {
		return tag;
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public abstract double  getAnnualFee();
}
