package buoi9;

public class Truck extends RegisteredMotorVehicle{
	private String type;
	
	public Truck(String tag, String name, String owner, double emptyWeight, double lastOdometer, String type) {
		super(tag, name, owner, emptyWeight, lastOdometer);
		this.type = type;
	}
	

	
	
	
	@Override
	public double getAnnualFee() {
		if(type == "BANDAI")
			return getEmptyWeight() * 0.05;
		else if (type == "CAMNHONG")
			return  getEmptyWeight() * 0.01;
		else return getEmptyWeight() * 0.1;
 	}
	
	@Override
	public void printRegistration() {
		// TODO Auto-generated method stub
		System.out.println("Tag: "+ getTag() + "\n" +
						  "Name: " + getName() + "\n"+
						  "Owner: " + getOwner() + "\n"+
						  "emptyweight: "+ getEmptyWeight()+ "\n"+
						   "Fee: "+ getAnnualFee());
	}

	
}
