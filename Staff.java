package buoi9;

public class Staff {
	private  StaffMember[] staffList = {new Volunteer("Phuc", "Ung hoa", "123-456", "111", 0),
			new Hourly("nam", "Ha noi", "123-452", "112", 60, 40),
			new Executive("nghia", "Ha dong", "112-222", "111", 2000_000),
			new Employee("helo", "hai phong", "1223-123", "122", 1000_000)};
	
	
	public void payDay() {
		for(int i = 0; i < staffList.length; i ++) {
			System.out.println(staffList[i].toString() + "\n");
		
		}
		
	}
}
