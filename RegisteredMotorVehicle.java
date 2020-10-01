package buoi9;

public class RegisteredMotorVehicle extends RegisteredVehicle{
	 private double emptyWeight;
	private double lastOdometer;
	 
	public RegisteredMotorVehicle(String tag, String name, String owner,double emptyWeight, double lastOdometer) {
		super(tag, name, owner);
		this.emptyWeight = emptyWeight;
		this.lastOdometer = lastOdometer;
		
	}
	
	
	 public double getEmptyWeight() {
			return emptyWeight;
	}

	public double getLastOdometer() {
			return lastOdometer;
	}
		
	@Override
	public double getAnnualFee() {
		return 0;
	}
	 
}
