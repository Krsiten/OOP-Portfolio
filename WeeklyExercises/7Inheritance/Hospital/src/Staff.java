
public class Staff {
	protected int empNum;
	protected String forename;
	protected String surname;
	
	public void status() {
		String statusMsg = String.format("Staff membeber %s %s (Employee #: %d)", forename, surname, empNum);
		System.out.println(statusMsg);
	}
	
}
