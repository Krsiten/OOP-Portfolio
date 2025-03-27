
public class Hospital {

	public static void main(String[] args) {
		Cleaner cleaner1 = new Cleaner(1253, "John", "Doe");
		Cleaner cleaner2 = new Cleaner(1723, "Jane", "Doe");
		Doctor doctor1 = new Doctor(4216, "John", "Doe", "clinical radiology");
		Doctor doctor2 = new Doctor(1997, "John", "Doe", "neurology");
		Nurse nurse1 = new Nurse(1234, "Kristen", "Holden");
		Nurse nurse2 = new Nurse(4321, "Karl", "Wilkinson");
		Nurse nurse3 = new Nurse(4321, "Jessica", "Smith");
		Receptionist receptionist1 = new Receptionist(4321, "Willen", "Dafoe");
		
		cleaner1.sweeping();
		cleaner2.mopping();
		
		
		doctor1.lunch();
		doctor2.specialisation();
		
		nurse1.anesthesia();
		nurse2.status();
		nurse3.perscription();
		
		receptionist1.updateRecords();
	}

}
