package buoi9;

public class Executive extends StaffMember {

	public Executive(String name, String address, String phone, String insurance, int income) {
		super(name, address, phone, insurance, income);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int pay() {
		// TODO Auto-generated method stub
		return (int) (getIncome() * 1.1);
	}
}


