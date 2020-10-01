package buoi9;

public abstract class StaffMember {
	private String name;
	private String address;
	private String phone;
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getInsurance() {
		return insurance;
	}


	private String insurance;
	private int income;
	  
	public StaffMember(String name, String address, String phone, String insurance, int income) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.insurance = insurance;
		this.income = income;
	}
	
	public double getIncome() {
		return income;
	}
	
	public abstract int pay();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "\n" 
				+ "address: " + address + "\n"
				+ "phone: " + phone + "\n"
				+ "insurance: " + insurance + "\n"
				+  "income: " + pay();
	}

}
