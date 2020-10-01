package buoi9;

public class Hourly extends StaffMember{
	private int hour;
	
	public Hourly(String name, String address, String phone, String insurance, int income, int hour) {
		super(name, address, phone, insurance, income);
		this.hour = hour;
	}
	
	@Override
	public int pay() {
		// TODO Auto-generated method stub
		return (int) (hour * getIncome());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + getName() + "\n" 
				+ "address: " + getAddress() + "\n"
				+ "phone: " + getPhone() + "\n"
				+ "insurance: " +getInsurance()  + "\n"
				+ "hour: " + hour + " \n"
				+  "income: " + pay();
	}
}
