
public class Cleaner extends Staff{
	
	public Cleaner(int id, String firstNames, String lastNames) {
		empNum = id;
		forename = firstNames;
		surname = lastNames;
	}
	
	public void sweeping() {
		String statusMsg = String.format("Employee #: %d is sweeping", empNum);
		System.out.println(statusMsg);
	}
	
	public void mopping() {
		String statusMsg = String.format("Employee #: %d is mopping", empNum);
		System.out.println(statusMsg);
	}
	
	public void disinfect() {
		String statusMsg = String.format("Employee #: %d is disinfecting touch points", empNum);
		System.out.println(statusMsg);
	}
	
}
