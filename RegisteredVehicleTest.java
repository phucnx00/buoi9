package buoi9;

public class RegisteredVehicleTest {
	public static void main(String [] args) {
		RegisteredVehicle [] registeredVehicle = {new Truck("1", "phuc", "FPT", 1000, 100, "BANDAI"),
													new Truck("2", "pppp", "Viettel", 10000, 20, "CAMNHONg")};
		
		for(int i = 0; i <2 ; i++)
		registeredVehicle[i].printRegistration();
	}
}
