
public class Doctor extends Staff{
	static String special;
	
	public Doctor(int id, String firstNames, String lastNames, String specialisation) {
		empNum = id;
		forename = firstNames;
		surname = lastNames;
		special = specialisation;
	}
	
	public void specialisation() {
		String statusMsg = String.format("Employee #: %d is a doctor that specialises in %s", empNum, special);
		System.out.println(statusMsg);
	}
	
	public void lunch() {
		String statusMsg = String.format("Employee #: %d is on lunch break", empNum, special);
		System.out.println(statusMsg);
	}
	
}
