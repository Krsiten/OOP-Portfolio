
public class Nurse extends Staff{
	
	public Nurse(int id, String firstNames, String lastNames) {
		empNum = id;
		forename = firstNames;
		surname = lastNames;
	}
	
	public void anesthesia() {
		String statusMsg = String.format("Employee #: %d is a nurse currently aministrating anesthesia", empNum);
		System.out.println(statusMsg);
	}
	
	public void perscription() {
		String statusMsg = String.format("Employee #: %d is a nurse practitioner perscribing medication", empNum);
		System.out.println(statusMsg);
	}
	
}
