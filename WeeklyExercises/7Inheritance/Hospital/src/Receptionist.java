
public class Receptionist extends Staff{
	
	public Receptionist(int id, String firstNames, String lastNames) {
		empNum = id;
		forename = firstNames;
		surname = lastNames;
	}
	
	public void updateRecords() {
		String statusMsg = String.format("Employee #: %d is currently updating paitent records", empNum);
		System.out.println(statusMsg);
	}
	
}
